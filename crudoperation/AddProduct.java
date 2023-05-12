package crudoperation;

import java.sql.*;
import java.util.Scanner;

public class AddProduct
{
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the product_id: ");
	int id =sc.nextInt();
	
	System.out.println("Enter the product name: ");
	String name=sc.next();
	
	System.out.println("Enter the product Price: ");
	double price=sc.nextDouble();
	Connection con=null;
	Statement stmt=null;
  
	String query="insert into product values("+id+",'"+name+"',"+price+")";
     
	try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
		stmt=con.createStatement();
		int count=stmt.executeUpdate(query);
		System.out.println(count+" Product inserted Successfully....");
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  
	}
}
