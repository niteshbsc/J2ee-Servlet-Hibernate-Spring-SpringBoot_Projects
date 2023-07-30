package org.Mapping;

import java.time.LocalDate;

public class TestOneToOne {

	public static void main(String[] args) {

		Person p1=new Person();
		p1.setName("ABC");
		p1.setAge(24);
		p1.setPhone(8888);
		
		Pancard card=new Pancard();
		card.setDobl(LocalDate.parse("1998-01-24"));
		card.setNumber("sj4jj5");
		card.setPincode(657558);
		p1.setCard(card);
		
		System.out.println("Person Details");
		System.out.println("ID:"+p1.getId());
		System.out.println("Name:"+p1.getName());
		System.out.println("Age:"+p1.getAge());
		System.out.println("Phone:"+p1.getPhone());
		System.out.println("Pancard Number:"+p1.getCard().getNumber());
		System.out.println("DOB:"+p1.getCard().getDobl());
		System.out.println("Pincode:"+p1.getCard().getPincode());
	}

}
