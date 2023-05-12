package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sixlink")
public class HttpServletDemo6 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String design=req.getParameter("design");
		String sal=req.getParameter("sal");
		
		double salary=Double.parseDouble(sal);
		PrintWriter pw=resp.getWriter();
		if(design.equals("HR")) {
			double hrSalary=salary+(salary*0.2);
			pw.print("<h1>"+hrSalary+"</h1>");
		}else if(design.equals("MANAGER")) {
			double mgrSalary=salary+(salary*0.3);
			pw.print("<h1>"+mgrSalary+"</h1>");
		}
	}
}
