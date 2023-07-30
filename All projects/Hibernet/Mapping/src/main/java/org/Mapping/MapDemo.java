package org.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		
//		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
//		creating question
		Question q1=new Question();
		q1.setQuestionId(12);
		q1.setQuestion("What is Sql?");
		
		//Creating Answers
		Answer a1=new Answer();
		a1.setAnswerId(343);
		a1.setAnswer("Sql is a Structure query language");
		a1.setQuestion(q1);
		q1.setAnswer(a1);
		
		
//		creating question
		Question q2=new Question();
		q2.setQuestionId(1213);
		q2.setQuestion("What is java?");
		
		//Creating Answers
		Answer a2=new Answer();
		a2.setAnswerId(344);
		a2.setAnswer("java is programming language");
		a2.setQuestion(q2);
		q2.setAnswer(a2);
		//session
		
		Session s=factory.openSession();
				
		Transaction tx=s.beginTransaction();
		
		//save 
		s.save(q1);
		s.save(q2);
		s.save(a1);
		s.save(a2);
		
		tx.commit();
		
		//fetching 
		Question newQ=(Question)s.get(Question.class, 12);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());
		
		s.close();
	}

}
