package com.jsp.CompositeKey;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {

	public static void main(String[] args) {
		
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		PersonId id=new PersonId();
		id.setEmail("2@gmail.com");
		id.setPhone(8888);
		Person p=new Person();
		p.setName("Gorai");
		p.setPassword("12345");
		p.setId(id);
		manager.persist(p);
		tx.begin();
		tx.commit();
	}
}
