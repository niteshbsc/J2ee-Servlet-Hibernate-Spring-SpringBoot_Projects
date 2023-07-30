package org.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapping {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.setEid(30);
		e1.setName("Ram");
		
		e2.setEid(32);
		e2.setName("Shyam");
		
		Project p1=new Project();
		Project p2=new Project();
		
		p1.setPid(20);
		p1.setProjectName("Study Portal");
		
		p2.setPid(22);
		p2.setProjectName("Ecommerce");
		
		List<Employee> list1=new ArrayList<Employee>();
		List<Project> list2=new ArrayList<Project>();
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		e1.setEmployees(list1);
		p1.setProjects(list2);
//		e1.setProjects(list2);
//		p2.setEmployees(list1);
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);
		
		tx.commit();
		factory.close();
	}

}
