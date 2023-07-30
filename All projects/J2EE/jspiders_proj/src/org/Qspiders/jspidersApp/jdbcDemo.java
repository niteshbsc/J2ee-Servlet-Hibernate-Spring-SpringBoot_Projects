package org.Qspiders.jspidersApp;

import java.sql.*;

public class jdbcDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmt=null;
//		String qry="insert into btm.Student values(2,'Gorai',84.45)";
//		String qry="update btm.Student set per='80' where id=2";
//		String qry="delete from btm.Student where per='80'";
//		String qry1="insert into btm.Student values(2,'Gorai',77.45)";
		
		String qry="insert into btm.Student values(3,'Gorai',84.45)";
		String qry1="insert into btm.Student values(4,'Gorai',84.45)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded & Registered");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			System.out.println("Connection stablish with database server");
			stmt=con.createStatement();
			System.out.println("PlateForm created");
			stmt.executeUpdate(qry);
			stmt.execute(qry1);
			System.out.println("Data inserted");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if (stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
			if(con!=null) {
				try {
					con.close();
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Close all costly resources");
		}
	}

}
