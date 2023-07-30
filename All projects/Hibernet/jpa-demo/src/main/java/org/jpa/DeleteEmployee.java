package org.jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to delete thhe record");
		int id=sc.nextInt();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		Employee e=manager.find(Employee.class, id);
		if(e!=null) {
			manager.remove(e);
			EntityTransaction tx=manager.getTransaction();
			tx.begin();
			tx.commit();
			System.out.println("Employee has been Deleted");
		}
		else {
			System.out.println("You have Entered an Invalid Id");
		}
		
		}

}
