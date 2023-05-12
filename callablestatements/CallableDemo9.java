package callablestatements;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableDemo9 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER COMPANY NAME: ");
		String cname=sc.next();
		sc.close();
		Connection con=null;
		CallableStatement cstmt=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			cstmt=con.prepareCall("{call outparameterdemo(?,?)}");
			cstmt.setString(1, cname);
			cstmt.registerOutParameter(2, Types.INTEGER);
			cstmt.execute();
			
			System.out.println("TOTAL NO OF MODELS: "+cstmt.getInt(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
