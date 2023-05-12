package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LoginValidation{
	
	public boolean validation(String user, String pass) throws SQLException {
		Connection con=null;;
		Statement stmt=null;
		ResultSet rs=null;
		
		boolean status=false;
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/1eja7","root","shubh143");
				stmt=con.createStatement();
				String query="select username,password from LoginInfo";
				
				rs=stmt.executeQuery(query);
				
				while(rs.next()) {
					String dbuser = rs.getString(1);
					String dbPass = rs.getString(2);
					
					if(dbuser.equals(user) && dbPass.equals(pass)) {
						status=true;
						break;
					}else {
						status=false;
					}
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
			return status;
			
	}
}
