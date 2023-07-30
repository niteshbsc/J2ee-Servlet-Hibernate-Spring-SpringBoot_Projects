package org.jsp.springhibernatedemo.controller;

import java.util.List;
import java.util.Scanner;

import org.jsp.springhibernatedemo.dao.UserDao;
import org.jsp.springhibernatedemo.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FetchAllUser {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-hib.xml");
		UserDao dao=context.getBean("dao",UserDao.class);
		List<User> u=dao.FetchAllUser();
		if(u.size()>0) {
			System.out.println(u);
		}
	}

}
