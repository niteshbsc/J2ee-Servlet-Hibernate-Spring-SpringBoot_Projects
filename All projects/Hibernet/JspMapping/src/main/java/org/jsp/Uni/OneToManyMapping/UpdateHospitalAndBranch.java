package org.jsp.Uni.OneToManyMapping;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateHospitalAndBranch {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the id to Update the Hospital and Branch");
//		int id=sc.nextInt();
//		System.out.println("Enter the value for update");
//		String name=sc.next();
//		String gst=sc.next();
//		String founder=sc.next();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		Hospital hs=manager.find(Hospital.class, 1);
		hs.setGst("Hey123");
		Branch b=manager.find(Branch.class, 3);
		b.setName("Apolo Kantatoli");
//		b.setPhone(8798798);
		manager.merge(b);
		tx.begin();
		tx.commit();
	}

}
