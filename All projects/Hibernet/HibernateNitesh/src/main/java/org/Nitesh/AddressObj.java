package org.Nitesh;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddressObj {

	public static void main(String[] args) throws IOException{

		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
//		Creating student
		Student st=new Student();
		st.setId(102);
		st.setName("Gorai");
		st.setCity("Kantatoli");
		System.out.println(st);
		
//		Creating object of address class
		Address ad=new Address();
		ad.setAddressId(104);
		ad.setStreet("Street1");
		ad.setCity("Ranchi");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(1234.123);
		
		//Reading image
		FileInputStream fid=new FileInputStream("src/main/java/pic.jpg");
		byte[] data=new byte[fid.available()];
		fid.read(data);
		ad.setImage(data);
		Session ssn= factory.openSession();
		Transaction tx=ssn.beginTransaction();
		ssn.save(st);
		ssn.save(ad);
		tx.commit();
		ssn.close();
		System.out.println("Done...");
	}

}
