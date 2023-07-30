package org.jsp.Mpping.OneToManyBidirectional;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchEmpByDesg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Desiganation to Fetch the Department");
		String desg1=sc.next();
		String qry="select e from Employee e where e.desg=:desg";
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		
		Query q=manager.createQuery(qry);
		q.setParameter("desg", desg1);
		List<Employee> depts=q.getResultList();
		for(Employee a:depts) {
			System.out.println(a.getId()+"----"+a.getName()+"----"+a.getSalary());
		}
	}

}
