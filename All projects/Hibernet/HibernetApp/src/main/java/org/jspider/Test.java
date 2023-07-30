package org.jspider;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
//		Configuration cfg=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(factory);
	}

}
