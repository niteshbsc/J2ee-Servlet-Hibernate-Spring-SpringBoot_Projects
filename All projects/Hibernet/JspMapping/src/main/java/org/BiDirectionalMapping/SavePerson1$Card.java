package org.BiDirectionalMapping;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson1$Card {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager =factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		
		Person1 p=new Person1();
		p.setName("Nitesh");
		p.setAge(24);
		p.setPhone(567844);
		
		Pancard1 p1=new Pancard1();
		p1.setNumber("23edfg4");
		p1.setDob(LocalDate.parse("1998-08-17"));
		p1.setPincode(87456);
		
		p.setCard(p1);
		p1.setP(p);
		
		manager.persist(p);
		tx.begin();
		tx.commit();
	}

}
