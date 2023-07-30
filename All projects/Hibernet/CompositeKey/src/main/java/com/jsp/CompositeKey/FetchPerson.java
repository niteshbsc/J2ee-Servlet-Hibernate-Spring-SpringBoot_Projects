package com.jsp.CompositeKey;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class FetchPerson {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Email Phone Number");
		String email=sc.next();
		long phone=sc.nextLong();
		PersonId id=new PersonId();
		id.setEmail(email);
		id.setPhone(phone);
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		Person p=manager.find(Person.class, id);
		if(p!=null) {
			System.out.println("name:"+p.getName());
			System.out.println("EmailId:"+p.getId().getEmail());
			System.out.println("Phone Number:"+p.getId().getPhone());
		}
		else {
			System.out.println("Invalid Phone number or Email");
		}
	}

}
