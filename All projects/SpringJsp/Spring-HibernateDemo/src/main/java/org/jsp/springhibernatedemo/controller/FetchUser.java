package org.jsp.springhibernatedemo.controller;

import java.util.Scanner;

import org.jsp.springhibernatedemo.dao.UserDao;
import org.jsp.springhibernatedemo.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FetchUser {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("spring-hib.xml");
	UserDao dao=context.getBean("dao",UserDao.class);
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id to Fetch");
	int id=sc.nextInt();
	User u=dao.fetchUser(id);
	if(u!=null) {
	System.out.println("Name:"+u.getName());
	System.out.println("Phone:"+u.getPhone());
	}
	else {
		System.out.println("Invalid id");
	}
}
}
