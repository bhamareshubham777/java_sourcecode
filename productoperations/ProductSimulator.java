package productoperations;

import java.sql.*;

public class ProductSimulator {
	static Connection con=null;
	static Statement stmt=null;
	static {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			stmt=con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void addProduct(int pID, String pName, double pPrice) throws SQLException {
		String query1="insert into ProductInfo values("+pID+",'"+pName+"',"+pPrice+")";
		int count=stmt.executeUpdate(query1);
		if(count==1) {
			System.out.println(count+" RECORD INSERTED SUCCESSFULLY...!!!");
		}
	}
	
	public void deleteProduct(int pID) throws SQLException {
		String query2="delete from ProductInfo where id="+pID+"";
		int status=stmt.executeUpdate(query2);
		if(status==1) {
			System.out.println("RECORD DELETED SUCCEFULLY...!!!");
		}else {
			System.out.println("RECORD NOT FOUND");
		}
	}
	
	public void displayProduct() throws SQLException {
		ResultSet rs;
		String query3="select * from ProductInfo";
		rs=stmt.executeQuery(query3);
		System.out.println("PRODUCT ID \t PRODUCT NAME \t PRODUCT PRICE");
		System.out.println("===============================================");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getDouble(3));
		}
	}
}
