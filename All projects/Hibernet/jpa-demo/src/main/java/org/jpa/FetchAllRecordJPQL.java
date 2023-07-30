package org.jpa;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class FetchAllRecordJPQL {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		String qry="select e from Employee e";
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		Query q=manager.createQuery(qry);
		
		List<Employee> emps=q.getResultList();
		for(Employee e:emps) {
			System.out.println("Id:"+e.getId());
			System.out.println("Name:"+e.getName());
			System.out.println("Department:"+e.getDept());
			System.out.println("Designation:"+e.getDesg());
			System.out.println("Salary:"+e.getSalary());
			
		}
	}

}
