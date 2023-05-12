package callablestatements;

import java.sql.*;
import java.util.Scanner;

public class CallableDemo8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER PRODUCT ID: ");
		int pID=sc.nextInt();
		System.out.println("ENTER PRODUCT NAME: ");
		String pName=sc.next();
		System.out.println("ENTER PRODUCT PRICE: ");
		double pPrice=sc.nextDouble();
		System.out.println("ENTER USER ID: ");
		int uid=sc.nextInt();
		System.out.println("ENTER UPDATED VALUE: ");
		String uname=sc.next();
		System.out.println("ENTER BIKE ID TO DELETE: ");
		int bid=sc.nextInt();
		
		sc.close();
		
		Connection con=null;
		CallableStatement cstmt=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			cstmt=con.prepareCall("{call alltablesoperations(?,?,?,?,?,?)}");
			cstmt.setInt(1, pID);
			cstmt.setString(2, pName);
			cstmt.setDouble(3, pPrice);
			cstmt.setInt(4, uid);
			cstmt.setString(5,uname);
			cstmt.setInt(6, bid);
			cstmt.execute();
			
			System.out.println("PROCEDURE EXECUTED SUCCESSFULLY...!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
