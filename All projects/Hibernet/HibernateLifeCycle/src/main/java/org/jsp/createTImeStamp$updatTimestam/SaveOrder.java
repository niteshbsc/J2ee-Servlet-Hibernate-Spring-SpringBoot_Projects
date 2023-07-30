package org.jsp.createTImeStamp$updatTimestam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveOrder {

	public static void main(String[] args) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		FoodOrder order=new FoodOrder();
		order.setCost(250);
		order.setItem("Biryani");
//		order.setOrderedTime(null);
		manager.persist(order);
		tx.begin();
		tx.commit();
	}

}
