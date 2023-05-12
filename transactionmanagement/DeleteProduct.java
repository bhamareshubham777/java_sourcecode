package transactionmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteProduct {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ID TO DELETE: ");
		int id=sc.nextInt();
		
		Connection con=null;
		PreparedStatement pstmt=null;
		
		String query="delete from ProductInfo where id=?";
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			con.setAutoCommit(false);
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, id);
			int count=pstmt.executeUpdate();
			System.out.println(" WANT TO UNDO: ");
			System.out.println(" 1: YES \n 2: NO");
			int choice=sc.nextInt();
			
			if(choice==1) {
				con.rollback();
				System.out.println("TRANSACTION ROLLABACK");
			}else if(choice==2) {
				con.commit();
				System.out.println(count+" PRODUCT DELETED");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
