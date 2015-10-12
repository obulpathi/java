package hibernate;

import hibernate.entity.*;
import hibernate.interceptor.AuditInterceptor;
import hibernate.types.MyBooleanType;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	private static final Logger LOGGER = Logger.getLogger("Hibernate");

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		SessionFactory sessionFactory = null;
		Session session = null;
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.registerTypeOverride(new MyBooleanType(), new String[]{"MyBooleanType"});
			configuration.setInterceptor(new AuditInterceptor());
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			session = sessionFactory.openSession();
			persistPerson(session);
			persistGeek(session);
			addPhones(session);
			createProject(session);
			loadProject(session);
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
		} finally {
			if (session != null) {
				session.close();
			}
			if (sessionFactory != null) {
				sessionFactory.close();
			}
		}
	}

	private void loadProject(Session session) {
		List<Project> projects = session.createQuery("from Project as p where p.title = ?").setString(0, "Java Project").list();
		for (Project project : projects) {
			System.out.println("Project: " + project.getTitle() + " starts at " + project.getPeriod().getStartDate());
		}
	}

	private void createProject(Session session) {
		session.getTransaction().begin();
		List<Geek> resultList = session.createQuery("from Geek as geek where geek.favouriteProgrammingLanguage = ?").setString(0, "Java").list();
		Project project = new Project();
		project.setTitle("Java Project");
		Period period = new Period();
		period.setStartDate(new Date());
		project.setPeriod(period);
		for (Geek geek : resultList) {
			project.getGeeks().add(geek);
			geek.getProjects().add(project);
		}
		session.save(project);
		session.getTransaction().commit();
	}

	private Date createDate(int day, int month, int year) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(Calendar.DAY_OF_MONTH, day);
		gc.set(Calendar.MONTH, month - 1);
		gc.set(Calendar.YEAR, year);
		gc.set(Calendar.HOUR_OF_DAY, 0);
		gc.set(Calendar.MINUTE, 0);
		gc.set(Calendar.SECOND, 0);
		gc.set(Calendar.MILLISECOND, 0);
		return new Date(gc.getTimeInMillis());
	}

	private void addPhones(Session session) {
		session.getTransaction().begin();
		List<Person> resultList = session.createQuery("from Person as person where person.firstName = ?").setString(0, "Homer").list();
		for (Person person : resultList) {
			Phone phone = new Phone();
			phone.setNumber("+49 1234 456789");
			session.persist(phone);
			person.getPhones().add(phone);
			phone.setPerson(person);
		}
		session.getTransaction().commit();
	}

	private void persistPerson(Session session) throws Exception {
		try {
			Transaction transaction = session.getTransaction();
			transaction.begin();
			Person person = new Person();
			person.setFirstName("Homer");
			person.setLastName("Simpson");
			IdCard idCard = new IdCard();
			idCard.setIdNumber("4711");
			idCard.setIssueDate(new Date());
			person.setIdCard(idCard);
			session.save(person);
			System.out.println(person.getId());
			transaction.commit();
		} catch (Exception e) {
			if (session.getTransaction().isActive()) {
				session.getTransaction().rollback();
			}
			throw e;
		}
	}

	private void persistGeek(Session session) {
		session.getTransaction().begin();
		Geek geek = new Geek();
		geek.setFirstName("Gavin");
		geek.setLastName("Coffee");
		geek.setFavouriteProgrammingLanguage("Java");
		session.save(geek);
		geek = new Geek();
		geek.setFirstName("Thomas");
		geek.setLastName("Micro");
		geek.setFavouriteProgrammingLanguage("C#");
		session.save(geek);
		geek = new Geek();
		geek.setFirstName("Christian");
		geek.setLastName("Cup");
		geek.setFavouriteProgrammingLanguage("Java");
		session.save(geek);
		session.getTransaction().commit();
	}
}
