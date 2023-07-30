package org.Cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CascadeExample {

	public static void main(String[] args) {
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Question q1= new Question();
		q1.setQuestionId(234);
		q1.setQuestion("What is cascading");
		
		Answer a1=new Answer(123, "In hibernate is important",q1);
		Answer a2=new Answer(124, "In hibernate ", q1);
		Answer a3=new Answer(125, " important",q1);
		List<Answer> list=new ArrayList<Answer>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		q1.setAnswer((Answer) list);
		
		s.save(q1);
//		s.save(a1);
//		s.save(a2);
//		s.save(a3);
		Transaction tx=s.beginTransaction();
		tx.commit();
		s.close();
	}

}
