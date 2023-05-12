package crudoperation;

import java.sql.*;
import java.util.Scanner;

public class DeleteProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER PRODUCT ID: ");
		int pID = sc.nextInt();
		
		Connection con;
		Statement stmt;
		
		String query="delete from product where id="+pID+"";
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			stmt=con.createStatement();
			int status=stmt.executeUpdate(query);
			if(status==1) {
				System.out.println("RECORD DELETED SUCCEFULLY...");
			}else {
				System.out.println("RECORD NOT FOUND...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
