package org.jsp.Mpping.OneToManyBidirectional;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchEmpByDeptId {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to Fetch the Department");
		int Did=sc.nextInt();
		String qry="select e from Employee e where e.dept.id=:id";
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		
		Query q=manager.createQuery(qry);
		q.setParameter("id", Did);
		List<Employee> depts=q.getResultList();
		for(Employee a:depts) {
			System.out.println(a.getName()+"----"+a.getDesg()+"----"+a.getSalary());
		}
	}

}
