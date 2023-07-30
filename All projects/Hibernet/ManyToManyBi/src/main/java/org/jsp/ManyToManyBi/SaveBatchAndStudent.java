package org.jsp.ManyToManyBi;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class SaveBatchAndStudent {

	public static void main(String[] args) {
		Batch b1=new Batch();
		b1.setCode("SEHM21");
		b1.setSubject("Hibernate");
		
		Batch b2=new Batch();
		b2.setCode("SESM21");
		b2.setSubject("Spring");
		
		Batch b3=new Batch();
		b3.setCode("SJPM21");
		b3.setSubject("Java");
		
		Student s1=new Student();
		s1.setName("Pushpa");
		s1.setPhone(99999);
		s1.setBatches(new ArrayList<Batch>(Arrays.asList(b1,b2,b3)));
		
		Student s2=new Student();
		s2.setName("Rocky");
		s2.setPhone(88888);
		s2.setBatches(new ArrayList<Batch>(Arrays.asList(b1,b2,b3)));
		
		Student s3=new Student();
		s3.setName("Bahubali");
		s3.setPhone(77777);
		s3.setBatches(new ArrayList<Batch>(Arrays.asList(b1,b2,b3)));
		
		//Assigning  Students for Hibernate
		b1.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		//Assigning  Students for Hibernate
		b2.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		//Assigning  Students for Hibernate
		b3.setStudents(new ArrayList<Student>(Arrays.asList(s1,s2,s3)));
		
//		EntityManagerFactory factory= Persistence.createEntityManagerFactory("dev");
//		EntityManager manager=factory.createEntityManager();
		EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		manager.persist(b1);
		manager.persist(b2);
		manager.persist(b3);
		tx.begin();
		tx.commit();
	}

}
