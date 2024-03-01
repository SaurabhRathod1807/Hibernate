package Hibernate;
import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Readfewdata {
	
	public static void main(String[] args) {
		
		Configuration c  = new Configuration();
		c.configure("hibernate.cfg.xml");
		c.addAnnotatedClass(Friend.class);
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		Query q = s.createQuery("select name, age, address from Friend where id=3");
		List<Object> show = q.list();
		for(int i=0; i<show.size(); i++) {
			Object[] row = (Object[]) show.get(i);
			System.out.println(row[0] + " " + row[1] + " " + row[2]);
		}
	}
}
