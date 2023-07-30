package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
	}

	@Override
	public String toString() {
		return "Pepsi [pice="+price+"]";
	}

	public void afterPropertiesSet() throws Exception {
		//init
		System.out.println("Taking pepsi: init");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
//		Destroy
		System.out.println("Going to put bottle back to shop: destroy");
	}
	
}
