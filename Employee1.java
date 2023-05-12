package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firstlink")
public class Employee1 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("eid");
		String name=req.getParameter("ename");
		String salary=req.getParameter("esalary");
		
		double empSalary=Double.parseDouble(salary);
		
		double hra=empSalary*0.3;
		double gross=empSalary+hra;
		
		req.setAttribute("hraSalary", hra);
		req.setAttribute("grossSalary", gross);
		RequestDispatcher rd=req.getRequestDispatcher("secondlink");
		rd.include(req, resp);
		
		double netSal=(double) req.getAttribute("net");
		PrintWriter pw=resp.getWriter();
		pw.print("<h1>ID: "+id+"</h1>");
		pw.print("<h1>NAME: "+name+"</h1>");
		pw.print("<h1>GROSS SALARY: "+gross+"</h1>");
		pw.print("<h1>NET SALARY: "+netSal+"</h1>");
	}
}
