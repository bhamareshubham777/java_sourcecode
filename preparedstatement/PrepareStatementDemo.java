package preparedstatement;

import java.sql.*;

public class PrepareStatementDemo {
	public static void main(String[] args) {
		Connection con;
		PreparedStatement pstmt;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			
			String query="insert into product values(?,?,?)";
			pstmt=con.prepareStatement(query);
			
			pstmt.setInt(1, 5);
			pstmt.setString(2, "HEADFONE");
			pstmt.setDouble(3,2222.22);
			int count1=pstmt.executeUpdate();
			
			pstmt.setInt(1, 6);
			pstmt.setString(2, "FRIDGE");
			pstmt.setDouble(3,3333.33);
			int count2=pstmt.executeUpdate();
			
			System.out.println(count1+count2 +" RECORS INSERTED...!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
