package hibernate.entity;

import java.util.Date;

public interface Auditable {
	Date getCreated();
	void setCreated(Date created);
	Date getLastUpdate();
	void setLastUpdate(Date lastUpdate);
}
