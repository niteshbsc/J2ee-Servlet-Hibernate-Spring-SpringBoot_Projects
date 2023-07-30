package org.jspider;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchAllUsers {

	public static void main(String[] args) {

		Session s=new Configuration().configure().buildSessionFactory().openSession();
		Query<User> q=s.createQuery("select k from User k");
		List<User> users=q.getResultList();
		for(User u:users) {
			System.out.println("Id"+u.getId());
			System.out.println("Name"+u.getName());
			System.out.println("Age"+u.getAge());
			System.out.println("Phone NO."+u.getPhone());
		}
	}

}
