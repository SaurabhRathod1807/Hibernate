package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Readdata {
	public static void main(String[] args) {
		
		Configuration c= new Configuration();
		c.configure("hibernate.cfg.xml");
		c.addAnnotatedClass(Friend.class);
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		Friend obj1 = (Friend) s.get(Friend.class, 2);
		Friend obj2 = (Friend) s.load(Friend.class, 3);
		
		
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
