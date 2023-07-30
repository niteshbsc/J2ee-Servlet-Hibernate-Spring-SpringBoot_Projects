package org.SecondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondCacheExample {

	public static void main(String[] args) {

		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session1=factory.openSession();
//		first
		
		Employee e1=session1.get(Employee.class, 1);
		System.out.println(e1);
		
		session1.close();
		
		Session session2=factory.openSession();
//		second
		Employee e2=session1.get(Employee.class, 1);
		System.out.println(e2);
		session2.close();
	}

}
