package callablestatements;

import java.sql.*;
import java.util.Scanner;

public class CallableDemo6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ID: ");
		int bID=sc.nextInt();
		System.out.println("ENTER MODEL: ");
		String bModel=sc.next();
		System.out.println("ENTER COMPANY: ");
		String bCompany=sc.next();
		System.out.println("ENTER PRICE: ");
		double bPrice=sc.nextDouble();
		
		sc.close();
		
		Connection con=null;
		CallableStatement cstmt=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			cstmt=con.prepareCall("{call bikeoperations(?,?,?,?)}");
			cstmt.setInt(1, bID);
			cstmt.setString(2, bModel);
			cstmt.setString(3, bCompany);
			cstmt.setDouble(4, bPrice);
			cstmt.execute();
			System.out.println("PROCEDURE EXECUTED SUCCESSFULLY...!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
