package org.jsp.cacheMechanism;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployee {

	public static void main(String[] args) {
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		Employee e=new Employee();
		e.setName("Kumar");
		e.setPhone(890987);
		e.setDesg("Tester");
		
		manager.persist(e);
		tx.begin();
		tx.commit();
	}

}
