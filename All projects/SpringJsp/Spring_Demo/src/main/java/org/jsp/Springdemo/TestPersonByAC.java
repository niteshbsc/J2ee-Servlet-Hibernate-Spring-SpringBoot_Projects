package org.jsp.Springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPersonByAC {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("car.xml");
		Person p=context.getBean(Person.class);
		p.display();
	}

}
