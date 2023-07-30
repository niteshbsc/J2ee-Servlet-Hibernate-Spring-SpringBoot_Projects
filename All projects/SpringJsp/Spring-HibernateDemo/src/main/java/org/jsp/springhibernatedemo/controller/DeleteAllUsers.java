package org.jsp.springhibernatedemo.controller;

import java.util.Scanner;

import org.jsp.springhibernatedemo.dao.UserDao;
import org.jsp.springhibernatedemo.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeleteAllUsers {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-hib.xml");
		UserDao dao=context.getBean("dao",UserDao.class);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter id to delete");
//		int id=sc.nextInt();
		User u=new User();
		dao.deleteAllUser(u);
//		if(r) {
//			System.out.println("Deleted");
//		}else {
//			System.out.println("Enter Valid id");
//		}
	}
	}

