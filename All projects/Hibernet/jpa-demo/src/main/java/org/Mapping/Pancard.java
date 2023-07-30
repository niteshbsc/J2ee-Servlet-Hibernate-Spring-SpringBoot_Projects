package org.Mapping;

import java.time.LocalDate;

public class Pancard {
private static int incr;
private int id;
{
	id=++incr;
}
private String number;
private LocalDate dobl;
private int pincode;
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
public LocalDate getDobl() {
	return dobl;
}
public void setDobl(LocalDate dobl) {
	this.dobl = dobl;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}


}
