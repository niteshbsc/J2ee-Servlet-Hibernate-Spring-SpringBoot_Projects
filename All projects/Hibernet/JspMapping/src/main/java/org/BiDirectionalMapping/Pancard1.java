package org.BiDirectionalMapping;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pancard1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private  String number;
private LocalDate dob;
private int pincode;

@OneToOne(mappedBy="card",cascade=CascadeType.ALL)
private Person1 p;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public LocalDate getDob() {
	return dob;
}

public void setDob(LocalDate dob) {
	this.dob = dob;
}

public int getPincode() {
	return pincode;
}

public void setPincode(int pincode) {
	this.pincode = pincode;
}

public Person1 getP() {
	return p;
}

public void setP(Person1 p) {
	this.p = p;
}

}
