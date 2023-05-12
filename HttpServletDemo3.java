package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/thirdlink")
public class HttpServletDemo3 extends HttpServlet{
	String uName="shubh";
	String uPass="shubh123";
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("user");
		String password=req.getParameter("pass");
		PrintWriter pw=resp.getWriter();
		if(uName.equals(username) && uPass.equals(password)) {
			pw.print("<h1 style='color:green'> LOGIN SUCCESSFUL");
		}else {
			pw.print("<h1 style='color:red'> LOGIN FAILED");
		}
	}
}
