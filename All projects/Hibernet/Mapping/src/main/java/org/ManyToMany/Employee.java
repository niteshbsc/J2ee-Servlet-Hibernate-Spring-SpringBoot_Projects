package org.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int eid;
	private String name;
	
	@ManyToMany
	@JoinTable(name="emp_learn",joinColumns = {
			@JoinColumn(name="eid")}, inverseJoinColumns = {
					@JoinColumn(name="pid")
	})
	private List<Employee> employees;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String name, List<Employee> employees) {
		super();
		this.eid = eid;
		this.name = name;
		this.employees = employees;
	}


	
	
}
