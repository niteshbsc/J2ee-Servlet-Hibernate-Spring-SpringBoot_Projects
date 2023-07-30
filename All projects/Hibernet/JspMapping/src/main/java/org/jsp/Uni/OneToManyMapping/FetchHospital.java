package org.jsp.Uni.OneToManyMapping;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
@SuppressWarnings("all")

public class FetchHospital {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		
		String qry="select h from Hospital h";
		Query q=manager.createQuery(qry);
		List<Hospital> bs=q.getResultList();
		for(Hospital b:bs) {
//			System.out.println("EmailID-"+b.getEmail());
			System.out.println("Name-" +b.getName());
//			System.out.println("Phone-" +b.getPhone());
		}
	}

}
