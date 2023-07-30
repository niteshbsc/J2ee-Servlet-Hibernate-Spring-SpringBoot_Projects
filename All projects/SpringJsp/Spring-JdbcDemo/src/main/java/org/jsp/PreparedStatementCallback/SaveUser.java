package org.jsp.PreparedStatementCallback;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class SaveUser {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter id ,name,phone,password");
//		final int id = sc.nextInt();
//		final String name = sc.next();
//		final long phone = sc.nextLong();
//		final String password = sc.next();
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.jdbc.xml");
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		
		String qry = "insert into user values(?,?,?,?)";
		int r=template.execute(qry,new myCallBack());
		System.out.println("data inserted");
//		int r = template.execute(qry, new PreparedStatementCallback<Integer>() {
//
//			public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
//				ps.setInt(1, id);
//				ps.setString(2, name);
//				ps.setLong(3, phone);
//				ps.setString(4, password);
//				return ps.executeUpdate();
//			}
//
//		});
//		System.out.println(r + " data inserted1");
//	}
	}
}
class myCallBack implements PreparedStatementCallback<Integer>{

	public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
		ps.setInt(1, 2);
		ps.setString(2, "king");
		ps.setLong(3, 7777);
		ps.setString(4, "ad123");
		return ps.executeUpdate();
	}
	
}
