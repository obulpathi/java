package hibernate.entity;

import javax.persistence.*;
import java.util.*;

public class Project implements Auditable {
	private Long id;
	private String title;
	private Set<Geek> geeks = new HashSet<Geek>();
	private Period period;
	private Date created;
	private Date lastUpdate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Geek> getGeeks() {
		return geeks;
	}

	public void setGeeks(Set<Geek> geeks) {
		this.geeks = geeks;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
