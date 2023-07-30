package org.jsp.MultiQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestRide {

	public static void main(String[] args) {
ApplicationContext context=new AnnotationConfigApplicationContext(RideConfig.class);
Ride r=context.getBean(Ride.class);
r.getV().start();
	}

}
