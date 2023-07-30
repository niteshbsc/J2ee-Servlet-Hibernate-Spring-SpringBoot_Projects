package org.jsp.springhibernatedemo.controller;

import java.util.Scanner;

import org.jsp.springhibernatedemo.dao.UserDao;
import org.jsp.springhibernatedemo.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.orm.hibernate5.HibernateTemplate;

public class UpdateUser {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-hib.xml");
//		HibernateTemplate template=context.getBean(HibernateTemplate.class);
		UserDao dao=context.getBean("dao",UserDao.class);
		User u=new User();
		u.setId(2);
		u.setName("Gorai");
		u.setPhone(4567);
		u.setPassword("123abc");
		dao.updateUser(u);
	}

}
