package org.jsp.ManyToManyBi;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class FetchBatchesByStudentId {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student id to display Batch");
		int id=sc.nextInt();
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		Student b=manager.find(Student.class, id);
		if(b!=null) {
			List<Batch> batches=b.getBatches();
			for(Batch bt: batches) {
				System.out.println(bt);
			}
		}
		else {
			System.out.println("Invalid id");
		}
	}

}
