package preparedstatement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class CourseInfo {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		FileInputStream fin = null;
		
		String query="insert into course_info(course_name,course_image)values(?,?)";
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
			pstmt=con.prepareStatement(query);
			
			pstmt.setString(1, "JAVA");
			fin=new FileInputStream("C:\\J2EE\\java.png");
			pstmt.setBinaryStream(2, fin);
			pstmt.executeUpdate();
			
			pstmt.setString(1, "SQL");
			fin=new FileInputStream("C:\\J2EE\\sql.png");
			pstmt.setBinaryStream(2, fin);
			pstmt.executeUpdate();
			
			pstmt.setString(1, "php");
			fin=new FileInputStream("C:\\J2EE\\php.png");
			pstmt.setBinaryStream(2, fin);
			pstmt.executeUpdate();
					
			System.out.println("INFO INSERTED SUCCESSFULLY...!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
