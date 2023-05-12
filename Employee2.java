package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/secondlink")
public class Employee2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double hraSal=(double) req.getAttribute("hraSalary");
		double grossSal=(double) req.getAttribute("grossSalary");
		
		double deduction=grossSal*0.05;
		double netSalary=grossSal-deduction;
		
		req.setAttribute("net", netSalary);
	}
}
