package productoperations2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RangePrice {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER HIGHER PRICE: ");
		double hPrice=sc.nextDouble();
		System.out.println("ENTER LOWER PRICE: ");
		double lPrice=sc.nextDouble();
		
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
		stmt=con.createStatement();
		
		String query="select * from ProductInfo where price between "+lPrice+" and "+hPrice+"";
		rs=stmt.executeQuery(query);
		System.out.println("PRODUCT ID \t PRODUCT NAME \t PRODUCT PRICE");
		System.out.println("===============================================");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getDouble(3));
		}
	}
}
