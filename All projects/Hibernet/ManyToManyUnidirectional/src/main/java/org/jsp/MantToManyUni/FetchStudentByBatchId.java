package org.jsp.MantToManyUni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchStudentByBatchId {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the batch id to display Student");
		int id=sc.nextInt();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		Batch b=manager.find(Batch.class, id);
		if(b!=null) {
			List<Student> students=b.getStudent();
			for(Student st: students) {
				System.out.println(st);
			}
		}
		else {
			System.out.println("Invalid id");
		}
	}

}
