package org.jsp.Mpping.OneToManyBidirectional;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveDeptAndEmp {

	public static void main(String[] args) {
		Department d=new Department();
		d.setName("Devlopment");
		d.setLocation("BTM Layout");
		
		Employee e1=new Employee();
		e1.setDept(d);
		e1.setDesg("ASE");
		e1.setName("Nitesh");
		e1.setSalary(345673);
		
		Employee e2=new Employee();
		e2.setDept(d);
		e2.setDesg("CEO");
		e2.setName("Kumar");
		e2.setSalary(3456734);
		
		Employee e3=new Employee();
		e3.setDept(d);
		e3.setDesg("ASE");
		e3.setName("Nitesh");
		e3.setSalary(345673);
		
		d.setEmps(new ArrayList<Employee>(Arrays.asList(e1,e2,e3)));
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		manager.persist(d);
		tx.begin();
		tx.commit();
	}

}
