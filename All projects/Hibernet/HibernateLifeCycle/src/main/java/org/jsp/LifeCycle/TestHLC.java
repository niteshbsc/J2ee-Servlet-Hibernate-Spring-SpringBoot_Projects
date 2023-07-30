package org.jsp.LifeCycle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestHLC {

	public static void main(String[] args) {
		
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		
		Employee e=new Employee();
		e.setName("Nitesh");
		e.setDesg("Developer");
		e.setPhone(88888);
		manager.persist(e); //persistent state
		
		e.setName("Rockey");
		e.setDesg("CEO");
		tx.begin();
		tx.commit();
		manager.detach(e);
		e.setName("Bahubali");
		e.setDesg("Acttor");
		tx.begin();
		tx.commit();
	}

}
