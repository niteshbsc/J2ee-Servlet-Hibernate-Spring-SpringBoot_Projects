package org.Nitesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
//		get(), load()
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session ssn=factory.openSession();
		
//		get id-102
//		Student std=(Student)ssn.get(Student.class,102);  //using get()
		Student std=(Student)ssn.load(Student.class,102);  //using load()
		System.out.println(std);
		Address ad=(Address)ssn.get(Address.class, 1);
		System.out.println(ad.getStreet()+" "+ad.getCity());
		
		
		ssn.close();
		factory.close();
	}

}
