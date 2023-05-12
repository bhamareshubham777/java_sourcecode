package crudoperation;

import java.sql.*;

public class DisplayProduct {
	public static void main(String[] args) throws SQLException {
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		String query="select * from product";
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
		stmt=con.createStatement();
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
}
