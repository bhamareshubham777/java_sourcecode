package jdbctest;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NO. OF TICKETS: ");
		int totalTickets=sc.nextInt();
		sc.close();
		Connection con=null;
		CallableStatement cstmt=null;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
		cstmt=con.prepareCall("{?=call calculateBookingAmount(?)}");
		cstmt.setInt(2, totalTickets);
		cstmt.registerOutParameter(1, Types.INTEGER);
		cstmt.execute();
		System.out.println("TOTAL AMOUNT: "+cstmt.getInt(1));
	}
}
