package org.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setName("Navneeth");
		e.setDept("Development");
		e.setDesg("Associate Sofftware Engineer");
		e.setSalary(62722);
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=  factory.createEntityManager();
		EntityTransaction tx= manager.getTransaction();
		manager.persist(e);
		tx.begin();
		tx.commit();
	}

}
