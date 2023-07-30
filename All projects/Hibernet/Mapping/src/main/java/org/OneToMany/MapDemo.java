package org.OneToMany;

import java.util.ArrayList;
import java.util.List;

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
		
////		creating question
//		Question q1=new Question();
//		q1.setQuestionId(42);
//		q1.setQuestion("What is Sql?");
//		
//		//Creating Answers
//		Answer a1=new Answer();
//		a1.setAnswerId(743);
//		a1.setAnswer("Sql is a Structure query language");
//		a1.setQuestion(q1);
//		
//		//Creating Answers
//			Answer a2=new Answer();
//			a2.setAnswerId(373);
//			a2.setAnswer("Sql helps to perform Crud Operation");
//			a2.setQuestion(q1);
//			
//			//Creating Answers
////			Answer a3=new Answer();
////			a3.setAnswerId(824);
////			a3.setAnswer("Sql have Two Function");
////			a3.setQuestion(q1);
//		
//			
//			List<Answer> list=new ArrayList<Answer>();
//			list.add(a1);
//			list.add(a2);
////			list.add(a3);
//			q1.setAnswer(list);
			
		//session
		
		Session s=factory.openSession();
				
		Transaction tx=s.beginTransaction();
		
//		//save 
//		s.save(q1);
//		s.save(a1);
//		s.save(a2);
//		tx.commit();
		
		Question q=(Question)s.get(Question.class, 42);
		System.out.println();
		for(Answer a:q.getAnswer()) {
			System.out.println(a.getAnswer());
		}
		tx.commit();
		
		//fetching 
//		Question newQ=(Question)s.get(Question.class, 12);
//		System.out.println(newQ.getQuestion());
//		System.out.println(newQ.getAnswer().getAnswer());
		
		s.close();
	}

}
