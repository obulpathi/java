package hibernate.entity;

import java.util.HashSet;
import java.util.Set;

public class Geek extends Person {
	private String favouriteProgrammingLanguage;
	private Set<Project> projects = new HashSet<Project>();

	public String getFavouriteProgrammingLanguage() {
			return favouriteProgrammingLanguage;
	}

	public void setFavouriteProgrammingLanguage(String favouriteProgrammingLanguage) {
		this.favouriteProgrammingLanguage = favouriteProgrammingLanguage;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
}
