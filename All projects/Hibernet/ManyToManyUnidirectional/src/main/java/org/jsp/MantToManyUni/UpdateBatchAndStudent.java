package org.jsp.MantToManyUni;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class UpdateBatchAndStudent {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		Batch b=manager.find(Batch.class,2);
		b.setSubject("Spring Boot");
		Batch b1=manager.find(Batch.class,3);
		b1.setSubject("Java");
		
		manager.merge(b);
		manager.merge(b1);
		tx.begin();
		tx.commit();
	}

}
