package org.jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Id to update");
		int id=sc.nextInt();
		System.out.println("Enter a department, Designation, name and salary to update");
		String dept=sc.next();
		String desg=sc.next();
		String name=sc.next();
		double salry=sc.nextDouble();
		Employee e=new Employee();
		e.setId(id);
		e.setDept(dept);
		e.setDesg(desg);
		e.setName(name);
		e.setSalary(salry);
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=  factory.createEntityManager();
		EntityTransaction tx= manager.getTransaction();
		manager.merge(e);
		tx.begin();
		tx.commit();
		
	}

}
