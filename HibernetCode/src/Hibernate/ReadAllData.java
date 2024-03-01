package Hibernate;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Expression;
public class ReadAllData {
	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		c.addAnnotatedClass(Friend.class);
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
//		Transaction t = s.beginTransaction();
		Query q = s.createQuery("select id,name, age, address from Friend ");
		List<Object> abc = q.list();
		for(int i=0; i<abc.size();i++) {
			Object[] row=(Object[]) abc.get(i);
			System.out.println(row[0] + " " + row[1] + " " + row[2] + " " + row[3]);
		}
	}
}
