package org.jsp.ManyToOneUni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAnswerByAnswerdBy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the AnsweredBY to find the Answer");
		String ansBy=sc.next();
		String qry="select a from Answer a where a.answer.answeredBy=:answeredBy";
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		
		Query q=manager.createQuery(qry);
		q.setParameter("answeredBy", ansBy);
		List<Answer> answers=q.getResultList();
		for(Answer a:answers) {
			System.out.println(a.getAnswer()+"----"+a.getAnsweredBy());
		}
	}

}
