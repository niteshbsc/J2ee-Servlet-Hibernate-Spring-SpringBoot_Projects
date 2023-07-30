package org.jspider;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UserByPhone {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your phone Number");
		long phone=sc.nextLong();
		
		String hql="select u from User u where u.phone=?1";
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<User> q=s.createQuery(hql);
		q.setParameter(1, phone);
		List<User> users=q.getResultList();
		
		if(users.size()>0) {
			User u=users.get(0);
			
			System.out.println("Welcome Mr"+ u.getName()+"Your login is successful");
			System.out.println("ID:"+u.getId());
			System.out.println("Age:"+u.getAge());
//			System.out.println("Phone:"+u.getPhone());
			
		}
		else {
			System.err.println("Invalid phone number or Password");
		}
	}

}
