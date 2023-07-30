package org.jsp.employee_demo.controller;

import org.jsp.employee_demo.dao.EmployeeDao;
import org.jsp.employee_demo.dto.Employee;

public class SaveEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e= new Employee();
		e.setName("Nitesh");
		e.setPassword("hey234");
		e.setDesg("Developer");
		e.setPhone(34566);
		e.setSalary(80000.34);
		EmployeeDao dao= new EmployeeDao();
		e=dao.saveEmployee(e);
		System.out.println("Your Details are registered with ID:" +e.getId());
		
	}

}
