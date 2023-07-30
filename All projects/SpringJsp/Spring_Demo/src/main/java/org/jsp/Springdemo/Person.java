package org.jsp.Springdemo;

public class Person {
private int id;
private String name;
public void display() {
	System.out.println("Id:"+id);
	System.out.println("Name:"+name);
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
