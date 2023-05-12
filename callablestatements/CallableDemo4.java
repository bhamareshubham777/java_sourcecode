package callablestatements;

import java.sql.*;
import java.util.Scanner;

public class CallableDemo4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER CREDIT LIMIT: ");
		int creditLimit=sc.nextInt();
		sc.close();
		Connection con=null;
		CallableStatement cstmt=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			cstmt=con.prepareCall("{?=call customerType(?)}");
			cstmt.setInt(2, creditLimit);
			cstmt.registerOutParameter(1, Types.VARCHAR);
			cstmt.execute();
			System.out.println("CUSTOMER TYPE IS: "+cstmt.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
