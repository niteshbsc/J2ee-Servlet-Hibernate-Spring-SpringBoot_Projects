package org.jsp.MultiQualifier;

import org.springframework.stereotype.Component;

@Component(value="car")
public class Car implements Vehicle {
public void start() {
	System.out.println("Car has been Started");
}
}
