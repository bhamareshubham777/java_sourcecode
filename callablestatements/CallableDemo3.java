package callablestatements;

import java.sql.*;
import java.util.Scanner;

public class CallableDemo3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER QUANTITY: ");
		int qty=sc.nextInt();
		System.out.println("ENTER PRICE: ");
		double price=sc.nextDouble();
		sc.close();
		
		Connection con=null;
		CallableStatement cstmt=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			cstmt=con.prepareCall("{?=call calculatebill(?,?)}");
			cstmt.setInt(2, qty);
			cstmt.setDouble(3, price);
			cstmt.registerOutParameter(1, Types.DOUBLE);
			cstmt.execute();
			
			System.out.println("BILL AMOUNT: "+cstmt.getDouble(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
