package org.jsp.Uni.OneToManyMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveHospitalAndBranch {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		
		Hospital hs=new Hospital();
		hs.setName("Rims");
		hs.setGst("Rims123");
		hs.setFounder("Rajendra");
		
		Branch b=new Branch();
		b.setName("Rims Hazaribagh");
		b.setEmail("Rh@gmail.com");
		b.setPhone(677894);
		
		Branch b1=new Branch();
		b1.setName("Rims Bundu");
		b1.setEmail("Rb@gmail.com");
		b1.setPhone(628994);
		
		Branch b2=new Branch();
		b2.setName("Rims Main");
		b2.setEmail("Rm@gmail.com");
		b2.setPhone(698724);
		
		List<Branch> branches= new ArrayList<Branch>(Arrays.asList(b,b1,b2));
		hs.setBranches(branches);
		
		manager.persist(hs);
		tx.begin();
		tx.commit();
	}

}
