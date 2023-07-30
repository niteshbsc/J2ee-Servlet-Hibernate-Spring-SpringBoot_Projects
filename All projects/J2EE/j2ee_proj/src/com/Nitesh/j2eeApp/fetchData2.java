package com.Nitesh.j2eeApp;
import java.sql.*;
import java.util.Scanner;

//fetch a perticular record from the cursor or buffer memmory where name=?

public class fetchData2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		sc.close();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String qry="select * from office.employee where name=?";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded & Registered");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			System.out.println("Connection stablish with database server");
			pstmt=con.prepareStatement(qry);
			System.out.println("PlateForm created");
			pstmt.setString(1,name);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				int id=rs.getInt(1);
				double sal=rs.getDouble(3);
				System.out.println(id+" "+sal);
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

