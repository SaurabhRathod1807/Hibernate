package Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class AddFriend {
	public static void main(String[] args) {
		Friend f = new Friend();
		f.name="Sanket";
		f.age=26;
		f.address="Nanded";
		
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		c.addAnnotatedClass(Friend.class);
		SessionFactory sf =c.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(f);
		t.commit();
		
		System.out.println("Friend is Added!");
	}
}
