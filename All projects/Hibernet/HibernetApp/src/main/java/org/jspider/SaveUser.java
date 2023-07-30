package org.jspider;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u=new User();
//		u.setName("Nitesh");
//		u.setAge(24);
//		u.setPhone(8888);
//		u.setPassword("123");
		
//		delete data from database using id
//		u.setId(2);
		
//		Update data from the databse using id
//		u.setId(3);   //id must be present in databse
//		u.setName("Gorai");
//		u.setAge(25);
//		u.setPhone(700471732);
		
//		retrieve the data from databse using get() and load()
//		u.setId(1);
		
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
//		s.save(u);    //save the data 
//		s.remove(u);  //remove the data
//		s.saveOrUpdate(u);  //update the data

//		s.get(User.class, 1);
		User us=(User)s.get(User.class, 1); // fetch the data from the database
		System.out.println(us);
		
		
//		Transaction t=s.beginTransaction();
//		t.commit();
//		System.out.println("User saved with:"+u.getId());
		
	}

}
