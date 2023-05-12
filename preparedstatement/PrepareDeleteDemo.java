package preparedstatement;

import java.sql.*;

public class PrepareDeleteDemo {
	public static void main(String[] args) {
		Connection con;
		PreparedStatement pstmt;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			
			String query="delete from product where id=(?)";
			pstmt=con.prepareStatement(query);
			
			pstmt.setInt(1, 5);
			int count1=pstmt.executeUpdate();
			
			pstmt.setInt(1, 6);
			int count2=pstmt.executeUpdate();
			
			System.out.println(count1+count2 +" RECORS DELETED...!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
