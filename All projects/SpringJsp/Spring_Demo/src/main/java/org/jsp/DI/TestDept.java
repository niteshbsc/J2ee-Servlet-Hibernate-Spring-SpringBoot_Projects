package org.jsp.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDept {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext(DeptConfig.class);
		Department d=context.getBean(Department.class);
		System.out.println(d.getIds());
		System.out.println(d.getNames());
	}

}
