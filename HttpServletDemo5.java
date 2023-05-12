package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fifthlink")
public class HttpServletDemo5 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName=req.getParameter("first");
		String lastName=req.getParameter("last");
		String contact=req.getParameter("con");
		String gender=req.getParameter("gen");
		String branch=req.getParameter("branch");
		
		PrintWriter pw=resp.getWriter();
		pw.print(
		"<table border='3' bordercolor='red'"+
		"<tr><th>FIRSTNAME</th>"+
		"<th>LASTNAME</th>"+
		"<th>CONTACT</th>"+
		"<th>GENDER</th>"+
		"<th>BRANCH</th></tr>"+
		"<tr><td>"+firstName+"</td>"+
		"<td>"+lastName+"</td>"+
		"<td>"+contact+"</td>"+
		"<td>"+gender+"</td>"+
		"<td>"+branch+"</td></tr></table>");
	}
}
