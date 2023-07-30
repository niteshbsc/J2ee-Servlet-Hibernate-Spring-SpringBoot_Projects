package org.jsp.ValueInjectionAnno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
//Inject value using Field
@Value(value="24")
private int age;
private String name;
private long phone;

//Inject value using Constructor 
public Person(@Value(value="67489") long phone) {
	this.phone=phone;
}

//Inject value using Setter 
@Value(value="Hey")
public void setName(@Value(value="Nitesh") String name) {
	this.name=name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getName() {
	return name;
}

}
