package org.Nitesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Nitesh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
//		System.out.println(factory);
		
//		Creating student
		Student st=new Student();
		st.setId(102);
		st.setName("Gorai");
		st.setCity("Kantatoli");
		System.out.println(st);
		
		Session ssn= factory.openSession();
		Transaction tx=ssn.beginTransaction();
		ssn.save(st);
		tx.commit();
//		ssn.getTransaction();
		ssn.close();
	}

}
