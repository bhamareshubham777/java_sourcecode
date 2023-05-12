package callablestatements;

import java.sql.*;
import java.util.Scanner;

public class CallableDemo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER RADIUS: ");
		double radius=sc.nextDouble();
		sc.close();
		
		Connection con=null;
		CallableStatement cstmt=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			cstmt=con.prepareCall("{?=call areaofcircle(?)}");
			cstmt.setDouble(2, radius);
			cstmt.registerOutParameter(1, Types.DOUBLE);
			cstmt.execute();
			
			System.out.println("AREA OF CIRCLE IS: "+cstmt.getDouble(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
