package org.jsp.Spring_Demo.Dinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserProduct {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("User_Product.xml");
		User p=context.getBean(User.class);
		p.getP().display();
	}

}
