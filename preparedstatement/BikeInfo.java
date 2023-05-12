package preparedstatement;

import java.sql.*;
import java.util.Scanner;

public class BikeInfo {
	Scanner sc=new Scanner(System.in);
	static Connection con;
	static PreparedStatement pstmt;
	static ResultSet rs;
	static {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void addBike() throws SQLException {
		System.out.println("ENTER ID");
		int id=sc.nextInt();
		System.out.println("ENTER BIKE MODEL: ");
		String model=sc.next();
		System.out.println("ENTER BIKE COMPANY: ");
		String company=sc.next();
		System.out.println("ENTER BIKE PRICE: ");
		double price=sc.nextDouble();
		
		String query1="insert into BikeInfo values(?,?,?,?)";
		pstmt=con.prepareStatement(query1);
		
		pstmt.setInt(1, id);
		pstmt.setString(2, model);
		pstmt.setString(3, company);
		pstmt.setDouble(4, price);
		
		int count = pstmt.executeUpdate();
		System.out.println(count+" BIKE INFO ADDED SUCCESSFULLY...!!!");
	}
	
	public void getByModel() throws SQLException {
		System.out.println("ENTER BIKE MODEL");
		String model=sc.next();
		
		String query2="select * from BikeInfo where bike_model=(?)";
		pstmt=con.prepareStatement(query2);
		
		pstmt.setString(1, model);
		rs=pstmt.executeQuery();
		
		System.out.println("ID \t MODEL \t COMPANY \t PRICE");
		System.out.println("================================================");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t\t"+rs.getDouble(4));
		}
	}
	
	public void getByCompany() throws SQLException {
		System.out.println("ENTER BIKE COMPANY");
		String company=sc.next();
		
		String query2="select * from BikeInfo where bike_company=(?)";
		pstmt=con.prepareStatement(query2);
		
		pstmt.setString(1, company);
		rs=pstmt.executeQuery();
		
		System.out.println(" BIKE MODEL ");
		System.out.println("=============");
		while(rs.next()) {
			System.out.println("  "+rs.getString(2));
		}
		
	}
	
	public void getAllBikes() throws SQLException {
		String query3="select * from BikeInfo";
		pstmt=con.prepareStatement(query3);
		rs=pstmt.executeQuery();
		
		System.out.println("ID \t MODEL \t COMPANY \t PRICE");
		System.out.println("================================================");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t\t"+rs.getDouble(4));
		}
	}
}
