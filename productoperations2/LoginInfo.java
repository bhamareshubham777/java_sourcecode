package productoperations2;

import java.sql.*;

import java.util.Scanner;

public class LoginInfo {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER USERNAME: ");
		String user = sc.next();
		System.out.println("ENTER PASSWORD: ");
		String pass=sc.next();
		
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		String query="select username,password from LoginInfo";
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
		stmt=con.createStatement();
		rs=stmt.executeQuery(query);
		boolean status=false;
		while(rs.next()) {
			String dbuser = rs.getString(1);
			String dbPass = rs.getString(2);
			
			if(dbuser.equals(user) && dbPass.equals(pass)) {
				System.out.println("LOGIN SUCCESSFULLY...");
				status=true;
			}
		}
		if(status==false) {
			System.out.println("INVALID USER OR PASS");
		}
	}
}
