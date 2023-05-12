package callablestatements;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableDemo7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER PRODUCT ID: ");
		int pID=sc.nextInt();
		System.out.println("ENTER PRODUCT NAME: ");
		String pName=sc.next();
		System.out.println("ENTER PRODUCT PRICE: ");
		double pPrice=sc.nextDouble();
		System.out.println("ENTER ID TO DELETE: ");
		int prodID=sc.nextInt();
		
		sc.close();
		
		Connection con=null;
		CallableStatement cstmt=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			cstmt=con.prepareCall("{call productoperations(?,?,?,?)}");
			cstmt.setInt(1, pID);
			cstmt.setString(2, pName);
			cstmt.setDouble(3, pPrice);
			cstmt.setInt(4, prodID);
			cstmt.execute();
			
			System.out.println("PROCEDURE EXECUTED SUCCESSFULLY...!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
