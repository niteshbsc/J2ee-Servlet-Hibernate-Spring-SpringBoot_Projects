package org.Nitesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbededStudent$Certi {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Student$Certificate std=new Student$Certificate();
		std.setId(212);
		std.setName("Rahul Sahu");
		std.setCity("Jharkhand");
		
		Certificate crt=new Certificate();
		crt.setCourse("Python");
		crt.setDuration("2Month");
		std.setCerti(crt);
		
		Student$Certificate std1=new Student$Certificate();
		std1.setId(211);
		std1.setName("Kingu");
		std1.setCity("JharkhandNaksaliArea");
		
		Certificate crt1=new Certificate();
		crt1.setCourse("GunFire");
		crt1.setDuration("1 Month");
		std1.setCerti(crt1);
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
//		Save Object
		s.save(std);
		s.save(std1);
		tx.commit();
		s.clear();
		factory.close();
	}
}
