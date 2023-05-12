package productoperations2;

import java.sql.*;
import java.util.Scanner;

public class LoginUser {
	static Connection con;
	static Statement stmt;
	static ResultSet rs;
	static Scanner sc=new Scanner(System.in);
	
	static {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			stmt=con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void login() throws SQLException {
		System.out.println("ENTER USERNAME: ");
		String user = sc.next();
		System.out.println("ENTER PASSWORD: ");
		String pass=sc.next();
		
		String query="select username,password from LoginInfo";
		
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
		if(status==true) {
			System.out.println("SELECT MODE OF OPERATION: ");
			System.out.println(" 1:DISPLAY PRODUCT \n 2:ADD PRODUCT");
			int choice=sc.nextInt();
			
			if(choice==1) {
				displayProduct();
			}else if(choice==2) {
				addProduct();
			}
		}else {
			System.out.println("FAILED TO LOGIN...!!!");
		}
	}
	
	public static void displayProduct() throws SQLException {
		String query="select * from product";
		rs=stmt.executeQuery(query);
		
		System.out.println("ID \t\t NAME \t\t PRICE");
		System.out.println("==========================================");
		
		while(rs.next()) {
			int id=rs.getInt(1);
			String name=rs.getString(2);
			double price=rs.getDouble(3);
			
			System.out.println(id+"\t\t"+name+"\t\t"+price);
	}
}
	
	public static void addProduct() throws SQLException {
		System.out.println("Enter the product_id: ");
		int productId =sc.nextInt();
		
		System.out.println("Enter the product name: ");
		String productName=sc.next();
		
		System.out.println("Enter the product Price: ");
		double productPrice=sc.nextDouble();
		
		String query="insert into product values("+productId+",'"+productName+"',"+productPrice+")";
		int count=stmt.executeUpdate(query);
		System.out.println(count+" Product inserted Successfully....");
	}
	
	public void signUp() throws SQLException {
		System.out.println("ENTER USER ID: ");
		int id=sc.nextInt();
		System.out.println("ENTER USERNAME: ");
		String user = sc.next();
		System.out.println("ENTER PASSWORD: ");
		String pass=sc.next();
		
		String query="insert into LoginInfo values("+id+",'"+user+"',"+pass+")";
		int count=stmt.executeUpdate(query);
		System.out.println(count+" USER SIGN IN SUCCESSFULLY....");
	
	}
}

