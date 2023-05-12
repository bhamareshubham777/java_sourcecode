package uservalidation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validationlink")
public class Validation extends HttpServlet{
	String username="shubham";
	String password="shubh123";
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user=req.getParameter("username");
		String pass=req.getParameter("pass");
		
		if(username.equals(user) && password.equals(pass)) {
			RequestDispatcher rd=req.getRequestDispatcher("welcomelink");
			rd.forward(req, resp);
		}else {
			PrintWriter pw=resp.getWriter();
			pw.print("<h1 style='color:red'>INVALID LOGIN DETAILS..!!!</h1>");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}
	}
}
