package org.jspider;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to print the details");
		int id=sc.nextInt();
		
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		User u=s.find(User.class, id);
		System.out.println(u);
		if(u!=null) {
			System.out.println("User found");
			System.out.println("ID:"+u.getId());
			System.out.println("Name:"+u.getName());
			System.out.println("Age:"+u.getAge());
			System.out.println("Phone:"+u.getPhone());
		}
	}

}
