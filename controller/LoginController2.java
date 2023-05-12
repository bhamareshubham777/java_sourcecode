package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.LoginValidation;


@WebServlet("/link1")
public class LoginController2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName=req.getParameter("user");
		String passWord=req.getParameter("pass");
		LoginValidation v1= new LoginValidation();
		
		try {
			boolean status = v1.validation(userName, passWord);
			if(status) {
				resp.sendRedirect("loginVeiw.jsp");
			}else {
				resp.sendRedirect("login.html");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
