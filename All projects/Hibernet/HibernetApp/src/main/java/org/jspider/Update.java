package org.jspider;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your id to update");
//		int id=sc.nextInt();
//		System.out.println("Enter the name,phone, age and password");
//		String name=sc.next();
//		long phone=sc.nextLong();
//		int age=sc.nextInt();
//		String password=sc.next();
//		User u=new User();
//		u.setId(id);
//		u.setName(name);
//		u.setPhone(phone);
//		u.setAge(age);
//		u.setPassword(password);
		
		User u=new User();
//		u.setId(3);
		u.setName("Navneeth");
		u.setPhone(7484);
		u.setAge(24);
		u.setPassword("ywte633");
		
		Session session=new Configuration().configure().buildSessionFactory().openSession();
//		session.saveOrUpdate(u);
		
		Transaction t=session.beginTransaction();
		session.update(u);
		t.commit();
//		sc.close();
	}

}
