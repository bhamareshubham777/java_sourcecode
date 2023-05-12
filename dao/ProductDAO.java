package dao;

import java.sql.*;
import java.util.ArrayList;

import dto.ProductDTO;

public class ProductDAO {
	static Connection con=null;
	PreparedStatement pstmt=null;
	static {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public int addProduct(ProductDTO p) {
		
		String query="insert into ProductInfo(name,price) values(?,?)";
		int count=0;
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, p.getProductName());
			pstmt.setDouble(2, p.getProductPrice());
			count=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public int deleteProduct(ProductDTO p) {
		String query="delete from ProductInfo where id=(?)";
		int count=0;
		try {
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1,p.getProductId());
			count=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public ArrayList<ProductDTO> displayProduct() {
		ResultSet rs=null;
		Statement stmt=null;
		ArrayList<ProductDTO>prod=new ArrayList<ProductDTO>();
		
		String query="select * from ProductInfo";
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				double price=rs.getDouble(3);
				//add values to object
				ProductDTO p1=new ProductDTO();
				p1.setProductId(id);
				p1.setProductName(name);
				p1.setProductPrice(price);
				//add object to arraylist
				prod.add(p1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prod;
	}
}

