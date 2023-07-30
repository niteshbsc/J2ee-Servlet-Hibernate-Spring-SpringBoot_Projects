package org.jsp.PreparedStatementCallback;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateDatabase {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.jdbc.xml");
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		template.execute(
				"create table user(id int not null,name varchar(45) not null,phone bigint(10) not null,password varchar(45) not null,primary key(id))");
		System.out.println("table created");
	}

}
