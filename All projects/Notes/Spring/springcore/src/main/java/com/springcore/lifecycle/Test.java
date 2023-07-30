package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
//	
////	Registering shutdown hook (call the destroy method)
	context.registerShutdownHook();
//	Samosha sm=(Samosha) context.getBean("s1");
//	System.out.println(sm);
//	
//  
//	System.out.println("++++++++++++++++++++++++++++++++++++++");
//	
//	Pepsi p1=(Pepsi) context.getBean("p1");
//	System.out.println(p1);
	
	UsingAnnotation ex=(UsingAnnotation) context.getBean("example");
	System.out.println(ex);
}
}
