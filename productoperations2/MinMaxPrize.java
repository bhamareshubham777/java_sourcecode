package productoperations2;

import java.sql.*;

public class MinMaxPrize {
	static Connection con;
	static Statement stmt;
	ResultSet rs;
	static {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			stmt=con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void maxPrice() throws SQLException {
		String query="select * from ProductInfo where price=(select max(price) from ProductInfo)";
		rs=stmt.executeQuery(query);
		System.out.println("PRODUCT ID \t PRODUCT NAME \t PRODUCT PRICE");
		System.out.println("===============================================");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getDouble(3));
		}
	}
	
	public void minPrice() throws SQLException {
		String query="select * from ProductInfo where price=(select min(price) from ProductInfo)";
		rs=stmt.executeQuery(query);
		System.out.println("PRODUCT ID \t PRODUCT NAME \t PRODUCT PRICE");
		System.out.println("===============================================");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getDouble(3));
		}
	}
}
