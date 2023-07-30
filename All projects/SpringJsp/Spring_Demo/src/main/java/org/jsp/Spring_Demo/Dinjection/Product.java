package org.jsp.Spring_Demo.Dinjection;

public class Product {
private int pid;
private String name;

public void display() {
	System.out.println("Product Id:"+pid);
	System.out.println("Product name:"+name);
}

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Product() {
}

public Product(int pid, String name) {
	super();
	this.pid = pid;
	this.name = name;
}


}
