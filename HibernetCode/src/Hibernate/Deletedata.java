package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Deletedata {
	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		c.addAnnotatedClass(Friend.class);
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		Friend obj = (Friend) s.load(Friend.class, 3);
		s.delete(obj);
		t.commit();
		
		System.out.println("Data Deleted!");
		
	}
}
