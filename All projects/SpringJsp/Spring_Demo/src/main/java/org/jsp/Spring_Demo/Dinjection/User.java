package org.jsp.Spring_Demo.Dinjection;

public class User {
private Product p;

public User() {
}

public User(Product p) {
	super();
	this.p = p;
}

public Product getP() {
	return p;
}

public void setP(Product p) {
	this.p = p;
}

}
