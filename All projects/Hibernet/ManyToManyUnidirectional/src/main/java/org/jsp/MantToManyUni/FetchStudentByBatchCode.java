package org.jsp.MantToManyUni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchStudentByBatchCode {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the batch code to display student");
		String code=sc.next();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		String qry="select b from Batch b where b.code=:c";
		Query q=manager.createQuery(qry);
		q.setParameter("c", code);
		try {
			Batch b=(Batch) q.getSingleResult();
			List<Student> students=b.getStudent();
			for(Student st:students) {
				System.out.println(st);
			}
		}catch(NoResultException e) {
			System.out.println("Invalid Batch code");
		}
	}

}
