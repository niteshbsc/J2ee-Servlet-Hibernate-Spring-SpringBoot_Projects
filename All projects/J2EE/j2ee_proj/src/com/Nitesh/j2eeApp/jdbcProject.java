package com.Nitesh.j2eeApp;
import java.sql.*;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;

//fetch a perticular record from the cursor or buffer memmory where id=?

public class jdbcProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con=null;
//		Statement stmt=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
//		String qry="insert into btm.Student values(2,'Gorai',84.45)";
//		String qry="update btm.Student set per='80' where id=2";
//		String qry="delete from btm.Student where per='80'";
//		String qry1="insert into btm.Student values(2,'Gorai',77.45)";
//		String qry="insert into btm.Student values(3,'Gorai',84.45)";
//		String qry1="insert into btm.Student values(4,'Gorai',84.45)";
		
//		String qry="insert into office.employee values(?,?,?)";
		
		String qry="select * from office.employee";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded & Registered");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			System.out.println("Connection stablish with database server");
//			stmt=con.createStatement();
//			System.out.println("PlateForm created");
			
//			stmt.executeUpdate(qry);
//			stmt.execute(qry1);
//			System.out.println("Data inserted");
			
//			pstmt=con.prepareStatement(qry);
//			System.out.println("PlateForm created");
//			pstmt.setInt(1,1);
//			pstmt.setString(2, "Nitesh");
//			pstmt.setDouble(3,80.34);
//			pstmt.executeUpdate();
//			
//			pstmt.setInt(1,2);
//			pstmt.setString(2, "Gorai");
//			pstmt.setDouble(3, 68.99);
//			pstmt.executeUpdate();
//			System.out.println("Data Inserted");
			
			pstmt=con.prepareStatement(qry);
			System.out.println("PlateForm created");
			rs=pstmt.executeQuery();
			while(rs.next()) {
//				if(rs.next()) {     fetch only a single record
				int id=rs.getInt("id");
				String name=rs.getString(2);
				double sal=rs.getDouble(3);
				System.out.println(id+" "+name+" "+sal);
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
