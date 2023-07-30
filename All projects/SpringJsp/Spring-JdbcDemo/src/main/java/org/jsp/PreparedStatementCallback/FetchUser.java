package org.jsp.PreparedStatementCallback;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class FetchUser {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.jdbc.xml");
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		
		String qry = "select * from user";
//		List<User> user=template.query(qry, new ResultSetExtractor<T>)
	}

}
