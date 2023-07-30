package org.jsp.ManyToOneUni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveQuestionAnswer {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		
		Question q=new Question();
		q.setQuestion("What is Hibernate");
		q.setQuestionedBy("Nitesh");
		
		Answer a1=new Answer();
		a1.setAnswer("Hibernate is Open Source");
		a1.setAnsweredBy("Lalit");
		a1.setQuestion(q);
		
		Answer a2=new Answer();
		a2.setAnswer("Hibernate is lightweight orm tool");
		a2.setAnsweredBy("Ramu");
		a2.setQuestion(q);
		
		Answer a3=new Answer();
		a3.setAnswer("Hibernate non-invasive Framwork");
		a3.setAnsweredBy("Gorai");
		a3.setQuestion(q);
		
		manager.persist(a1);
		manager.persist(a2);
		manager.persist(a3);
		
		tx.begin();
		tx.commit();
	}

}
