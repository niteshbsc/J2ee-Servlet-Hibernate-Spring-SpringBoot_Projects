package org.jsp.controller;

import java.util.List;
import java.util.Scanner;

import org.jsp.dao.ProductDao;
import org.jsp.dao.UserDao;
import org.jsp.dto.Product;
import org.jsp.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class UserController {
static Scanner sc=new Scanner(System.in);
static UserDao dao;
static ProductDao dao1;

static {
	ApplicationContext context=new AnnotationConfigApplicationContext("org.jsp");
	dao=context.getBean(UserDao.class);
	dao1=context.getBean(ProductDao.class);
}

public static void main(String[] args) {
	System.out.println("1.Save User");
	System.out.println("2.Update User");
	System.out.println("3.Verify user by phone and password");
	System.out.println("4.Verify user by Email and password");
	System.out.println("5.Verify user by id and password");
	System.out.println("6.Save Product");
	System.out.println("7.view Product by User id");
	System.out.println("8.View Products");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:{
		save();
		break;
	}
	case 2:{
		Update();
		break;
	}
	case 3:{
		VerifyUser();
		break;
	}
//	case 4:{
//		Verify2();
//		break;
//	}
//	case 5:{
//		Verify3();
//		break;
//	}
	case 6:{
		saveProduct();
		break;
	}
	case 7:{
		ViewProduct();
		break;
	}
	}
}
public static void save() {
	System.out.println("Enter name, phone, email, and password");
	String name=sc.next();
	long phone=sc.nextLong();
	String email=sc.next();
	String password=sc.next();
	User u=new User();
	u.setName(name);
	u.setEmail(email);
	u.setPhone(phone);
	u.setPassword(password);
	u=dao.SaveUser(u);
	System.out.println("User saved with Id:"+u.getId());
}
public static void Update() {
System.out.println("Enter the id to update the Record");
int id=sc.nextInt();
System.out.println("Enter Name, Phone, Email, password to Update ");
String name=sc.next();
long phone=sc.nextLong();
String email=sc.next();
String password=sc.next();
User u=new User();
u.setName(name);
u.setPhone(phone);
u.setEmail(email);
u.setPassword(password);
u=dao.UpdateUser(u);
System.out.println("User Updated with Id:"+u.getId());
}
public static void VerifyUser() {
	System.out.println("Enter a phone and password to verify");
	long phone=sc.nextLong();
	String password=sc.next();
	User u=new User();
	u=dao.verifyUser(phone, password);
	System.out.println(u);
//	if(u!=null) {
//	System.out.println("Valid");
//	}
//	else {
//		System.out.println("Invalid");
//	}
}

public static void saveProduct() {
	System.out.println("Enter name, description, brand, category, price");
	String name=sc.next();
	String desc=sc.next();
	String brand=sc.next();
	String category=sc.next();
	double price=sc.nextDouble();
	Product p=new Product();
	p.setName(name);
	p.setDescription(desc);
	p.setBrand(brand);
	p.setCategory(category);
	p.setPrice(price);
	p=dao1.saveProduct(p);
	System.out.println("User saved with id "+p.getId());
}

public static void ViewProduct() {
	System.out.println("Enter the User id");
	int id=sc.nextInt();
	List<Product> product=dao.viewUser(id);
	for(Product p: product) {
		System.out.println(p);
	}
}
}
