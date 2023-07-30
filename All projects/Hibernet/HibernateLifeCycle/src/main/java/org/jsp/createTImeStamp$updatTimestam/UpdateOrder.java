package org.jsp.createTImeStamp$updatTimestam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateOrder {

	public static void main(String[] args) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		FoodOrder order=manager.find(FoodOrder.class, 1);
		order.setCost(167);
		tx.begin();
		tx.commit();
	}

}
