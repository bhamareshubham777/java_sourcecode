package callablestatements;

import java.sql.*;
import java.util.Scanner;

public class CallableDemo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRST NO: ");
		int no1=sc.nextInt();
		System.out.println("ENTER SECOND NO: ");
		int no2=sc.nextInt();
		sc.close();
		Connection con=null;
		CallableStatement cstmt=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			//create platform using callable statement
			cstmt=con.prepareCall("{?=call addnumbers(?,?)}");
			//set input to sec and third placeholder
			cstmt.setInt(2, no1);
			cstmt.setInt(3, no2);
			//store output into first placeholder
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.execute();
			//get output from first placeholder
			System.out.println("ADDITION IS: "+cstmt.getInt(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
