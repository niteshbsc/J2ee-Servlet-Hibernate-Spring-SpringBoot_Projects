package org.Nitesh;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student$Certificate {
	@Id
	private int id;
	private String name;
	private String city;
	
	private Certificate certi;
	
	public Student$Certificate(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Student$Certificate() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student$Certificate [id=" + id + ", name=" + name + "]";
	}
	

	
}
