package org.jsp.Springdemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUsingByApplicationContext {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("car.xml");
		Car c=context.getBean("myCar", Car.class);
		c.start();
		
	}

}
