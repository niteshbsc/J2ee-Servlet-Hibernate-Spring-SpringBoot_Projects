package org.SecondLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveEmployee {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setName("Navneeth");
		e.setDept("Development");
		e.setDesg("Associate Sofftware Engineer");
		e.setSalary(62722);
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx=s.beginTransaction();
		
		s.save(e);
		tx.begin();
		tx.commit();
	}

}
