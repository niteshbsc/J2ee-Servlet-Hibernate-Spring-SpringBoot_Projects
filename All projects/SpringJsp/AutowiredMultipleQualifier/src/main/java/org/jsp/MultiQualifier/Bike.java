package org.jsp.MultiQualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="bike")
@Primary
public class Bike implements Vehicle{
	public void start() {
		System.out.println("Bike has been created");
	}
}
