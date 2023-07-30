package org.jsp.CollectionInjection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDepartment {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("dept.xml");
Department d=context.getBean(Department.class);
System.out.println(d.getNames());
System.out.println(d.getId());
System.out.println(d.getDetails());
	}

}
