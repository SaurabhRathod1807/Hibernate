package Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class product {

	@Id
	 public int id;
	
	@Column(name="proname")
	public String proname;
}
