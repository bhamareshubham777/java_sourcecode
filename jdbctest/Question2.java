package jdbctest;

import java.sql.*;
import java.util.Scanner;

public class Question2 {
	static Connection con;
	static Statement stmt;
	static ResultSet rs;
	static {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			stmt=con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println(" SELECT MODE OF OPEERATION: ");
		System.out.println(" 1:GET COUNT \n 2:ARRANGE IN ASC ORDER");
		int choice=sc.nextInt();
		sc.close();
		
		if(choice==1) {
			getCount();
		}else if(choice==2) {
			arrangeAsc();
		}else {
			System.out.println("INVALID CHOICE");
		}
	}
	
	public static void getCount() throws SQLException {
		String query="select city, count(*) from user_info group by city";
		rs=stmt.executeQuery(query);
		System.out.println("CITY \t\tCOUNT");
		while(rs.next()) {
			System.out.println(rs.getString(1)+"\t\t"+rs.getInt(2));
		}
	}
	public static void arrangeAsc() throws SQLException {
		String query="select username, age from user_info order by age";
		rs=stmt.executeQuery(query);
		System.out.println("USERNAME \tAGE");
		while(rs.next()) {
			System.out.println(rs.getString(1)+"\t\t"+rs.getInt(2));
		}
	}
}
