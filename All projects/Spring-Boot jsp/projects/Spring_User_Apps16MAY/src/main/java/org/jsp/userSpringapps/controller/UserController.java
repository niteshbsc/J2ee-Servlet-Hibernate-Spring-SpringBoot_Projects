package org.jsp.userSpringapps.controller;

import java.util.Scanner;

import org.jsp.userSpringApp.UserConfig;
import org.jsp.userSpringapps.dao.UserDao;
import org.jsp.userSpringapps.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

public class UserController {

	static Scanner sc=new Scanner(System.in);
	static UserDao dao;
	
	static {
		ApplicationContext context=new AnnotationConfigApplicationContext(UserConfig.class);
		dao=context.getBean(UserDao.class);
	}
	public static void main(String[] args) {
		System.out.println("1.Save User");
		System.out.println("2.update User");
		System.out.println("3.verify User by phone and password");
		System.out.println("4.verify User by Email and password");
		System.out.println("5.verify User by id and password");
		
		int choice=sc.nextInt();
		switch (choice) {
		case 1:{
			save();
			break;
		}
		case 2:{
			Update();
			break;
		}

		
	}
}
	public static void Update() {
		System.out.println("enter ur id to update ");
		int id=sc.nextInt();
		System.out.println("Enter Name,phone,email and password");
		String name=sc.next();
		long phone=sc.nextLong();
		String email=sc.next();
		String password=sc.next();
		
		User u=new User();
		u.setName(name);
		u.setEmail(email);
		u.setPhone(phone);
		u.setPassword(password);
//		u=dao.updateUser(u);
		u=dao.updateUser(u);
		System.out.println("data update with id :");
		
	}
	public static void save() {
		System.out.println("Enter Name,phone,email and password");
		String name=sc.next();
		long phone=sc.nextLong();
		String email=sc.next();
		String password=sc.next();
		
		User u=new User();
		u.setName(name);
		u.setEmail(email);
		u.setPhone(phone);
		u.setPassword(password);
		
		u=dao.saveUser(u);
		System.out.println("USer Saved with id :"+u.getId());
		
		
		
	}
}