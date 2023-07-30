package org.jspider;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to delete the records");
		int id=sc.nextInt();
		
		Session s=new Configuration().configure().buildSessionFactory().openSession();
		
		User u=s.find(User.class, id) ;
		if(u!=null) {
			s.delete(u);
			Transaction t=s.beginTransaction();
			t.commit();
			System.out.println("user with ID"+id+"Deleted");
		}
		else {
			System.err.println("Entered id is invalid");
		}
	}
}
