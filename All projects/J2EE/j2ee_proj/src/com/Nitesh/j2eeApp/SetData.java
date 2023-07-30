package com.Nitesh.j2eeApp;
import java.sql.*;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;

//fetch a perticular record from the cursor or buffer memmory where id=?

public class SetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String qry="insert into office.employee2 values(?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver class loaded & Registered");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			System.out.println("Connection stablish with database server");
			
			pstmt=con.prepareStatement(qry);
			System.out.println("PlateForm created");
			pstmt.setInt(1,1);
			pstmt.setString(2, "Nitesh");
			pstmt.setDouble(3,80.34);
			pstmt.setString(4, "Nitesh123");
			pstmt.executeUpdate();
//			
			pstmt.setInt(1,2);
			pstmt.setString(2, "Gorai");
			pstmt.setDouble(3, 68.99);
			pstmt.setString(4, "Gorai123");
			pstmt.executeUpdate();
			
//			pstmt.setInt(1,3);
//			pstmt.setString(2, "kumar");
//			pstmt.setDouble(3, 68.99);
//			pstmt.setString(4, "kumar123");
//			pstmt.executeUpdate();
			System.out.println("Data Inserted");
			
			
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
