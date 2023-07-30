package org.jsp.Mpping.OneToManyBidirectional;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchDeptByLocation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Location to Fetch the Department");
		String loc=sc.nextLine();
		String qry="select d from Department d where d.location=:location";
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		
		Query q=manager.createQuery(qry);
		q.setParameter("location", loc);
		List<Department> depts=q.getResultList();
		for(Department a:depts) {
			System.out.println(a.getId()+"----"+a.getName());
		}
	}

}
