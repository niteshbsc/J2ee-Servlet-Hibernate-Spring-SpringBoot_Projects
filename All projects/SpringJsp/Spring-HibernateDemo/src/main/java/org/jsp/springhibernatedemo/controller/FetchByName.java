//package org.jsp.springhibernatedemo.controller;
//
//import java.util.Scanner;
//
//import org.jsp.springhibernatedemo.dao.UserDao;
//import org.jsp.springhibernatedemo.dto.User;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class FetchByName {
//
//	public static void main(String[] args) {
//		ApplicationContext context=new ClassPathXmlApplicationContext("spring-hib.xml");
//		UserDao dao=context.getBean("dao",UserDao.class);
////		User u=new User();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the name to fetch");
//		String name=sc.nextLine();
//		User u=dao.fetchUserByName(name);
//		if(u!=null) {
//			System.out.println("Id:"+u.getId());
//			System.out.println("Phone:"+u.getPhone());
//		}
//		else {
//			System.out.println("Invalid id");
//		}
//	}
//
//}
