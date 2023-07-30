package org.FirstLevelCache;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class catchDwmo {

	public static void main(String[] args) {
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Employee e1=s.get(Employee.class, 1) ;
		System.out.println(e1);
		System.out.println("Working Something");
		
		Employee e2=s.get(Employee.class, 1);
		System.out.println(e2);
		
		System.out.println(s.contains(e2));
		s.close();
	}

}
