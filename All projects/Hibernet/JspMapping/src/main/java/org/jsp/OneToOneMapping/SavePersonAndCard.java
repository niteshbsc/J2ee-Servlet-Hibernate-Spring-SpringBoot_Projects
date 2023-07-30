package org.jsp.OneToOneMapping;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

public class SavePersonAndCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		Person p=new Person();
		p.setName("Abc");
		p.setAge(24);
		p.setPhone(8888);
		
		Pancard card=new Pancard();
		card.setNumber("637gs7");
		card.setDob(LocalDate.parse("1998-02-24"));
		card.setPincode(560039);
		
		p.setCard(card);
		manager.persist(p);
	tx.begin();
	tx.commit();
	}

}
