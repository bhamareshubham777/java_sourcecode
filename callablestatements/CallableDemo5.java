package callablestatements;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableDemo5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER BILL AMOUNT: ");
		int billAmt=sc.nextInt();
		System.out.println("ENTER CUSTOMER TYPE: ");
		String custType=sc.next();
		sc.close();
		Connection con=null;
		CallableStatement cstmt=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			cstmt=con.prepareCall("{?=call decideDiscount(?,?)}");
			cstmt.setInt(2, billAmt);
			cstmt.setString(3, custType);
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.execute();
			System.out.println("TOTAL BILL AMOUNT IS: "+cstmt.getInt(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
