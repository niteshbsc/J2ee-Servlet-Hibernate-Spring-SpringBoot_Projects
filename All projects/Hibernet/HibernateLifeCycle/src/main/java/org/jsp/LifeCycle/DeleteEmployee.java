package org.jsp.LifeCycle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEmployee {

	public static void main(String[] args) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		
		Employee e=manager.find(Employee.class, 1);
		manager.remove(e);
		tx.begin();
		tx.commit();
	}

}
