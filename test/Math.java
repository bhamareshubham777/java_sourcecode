package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mathlink")
public class Math extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String num1=req.getParameter("num1");
		String num2=req.getParameter("num2");
		
		int no1=Integer.parseInt(num1);
		int no2=Integer.parseInt(num2);
		
		int add=no1+no2;
		int sub=no1-no2;
		int mult=no1*no2;
		double div=(double)no1/(double)no2;
		
		req.setAttribute("addition", add);
		req.setAttribute("substration", sub);
		req.setAttribute("multiplication", mult);
		req.setAttribute("division", div);
		
		RequestDispatcher rd=req.getRequestDispatcher("math.jsp");
		rd.include(req, resp);
	}
}
