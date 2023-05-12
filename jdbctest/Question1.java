package jdbctest;

import java.sql.*;
import java.util.Scanner;

public class Question1 {
	static Connection con;
	static PreparedStatement pstmt;
	static ResultSet rs;
	static Scanner sc=new Scanner(System.in);
	static {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {
		
		System.out.println(" SELECT MODE OF OPERATION: ");
		System.out.println(" 1:INSERT RECORD \n 2:DISPLAY RECORD");
		int choice=sc.nextInt();
		
		if(choice==1) {
			addUser();
		}else if(choice==2) {
			displayUser();
		}else {
			System.out.println("INVALID CHOICE");
		}
	}
	
	public static void addUser() {
		System.out.println("ENTER USERNAME: ");
		String user=sc.next();
		System.out.println("ENTER PASS: ");
		String pass=sc.next();
		System.out.println("ENTER AGE: ");
		int userAge=sc.nextInt();
		System.out.println("ENTER CONTACT NUM: ");
		int conNo=sc.nextInt();
		System.out.println("ENTER CITY: ");
		String cityName=sc.next();
		
		String query="insert into user_info(username,password,age,contact,city)values(?,?,?,?,?)";
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, user);
			pstmt.setString(2, pass);
			pstmt.setInt(3, userAge);
			pstmt.setInt(4, conNo);
			pstmt.setString(5, cityName);
			int count=pstmt.executeUpdate();
			System.out.println(count+" RECORD INSERTED SUCCEFULLY");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void displayUser() throws SQLException {
		String query="select * from user_info";
		pstmt=con.prepareStatement(query);
		rs=pstmt.executeQuery();
		System.out.println("id \t username \t pass \t age \t contact \t city");
		System.out.println("==============================================================");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getInt(5)+"\t"+rs.getString(6));
		}
	}
}
