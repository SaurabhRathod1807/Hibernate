package Hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteAll {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		c.addAnnotatedClass(Friend.class);
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("delete from Friend");
		q.executeUpdate();
		t.commit();
		System.out.println("Delete all the Data!");
		
				
	}
}
