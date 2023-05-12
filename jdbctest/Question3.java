package jdbctest;

import java.sql.*;
import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER CONTACT NO: ");
		int cont=sc.nextInt();
		sc.close();
		Connection con=null;
		PreparedStatement pstmt=null;
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
		String query="delete from user_info where contact=?";
		pstmt=con.prepareStatement(query);
		pstmt.setInt(1, cont);
		int count=pstmt.executeUpdate();
		if(count==1) {
			System.out.println(count+" RECORD DELETED SUCCESSFULLY");
		}else {
			System.out.println("RECORD NOT FOUND");
		}
		
	}
}
