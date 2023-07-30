package com.Nitesh.j2eeApp;
import java.sql.*;
import java.util.Scanner;

//Login validation using standard steps of jdbc

public class LoginValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter a password");
		String password=sc.next();
		sc.close();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String qry="select * from office.employee2 where name=? and password=?";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded & Registered");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			System.out.println("Connection stablish with database server");
			pstmt=con.prepareStatement(qry);
			System.out.println("PlateForm created");
			pstmt.setString(1,name);
			pstmt.setString(2, password);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				String username=rs.getString(1);
				System.out.println("Welcome"+" "+username);
			}
			else {
				System.out.println("No data data found");
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if (rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
			if (pstmt!=null) {
				try {
					pstmt.close();
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

