package org.jsp.Springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployeeByAC {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("car.xml");
		Employee e=context.getBean(Employee.class);
		e.display();
	}

}
