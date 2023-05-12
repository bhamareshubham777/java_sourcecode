package crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER PRODUCT ID: ");
		int pID = sc.nextInt();
		System.out.println("ENTER UPDATED PRICE: ");
		double pPrice = sc.nextDouble();
		
		Connection con;
		Statement stmt;
		
		String query="update product set price="+pPrice+" where id="+pID+"";
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			stmt=con.createStatement();
			int status=stmt.executeUpdate(query);
			if(status==1) {
				System.out.println("RECORD UPDATED SUCCEFULLY...");
			}else {
				System.out.println("RECORD NOT FOUND...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
