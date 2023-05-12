package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sevenlink")
public class HttpServletsDemo7 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String str1=req.getParameter("num1");
		String str2=req.getParameter("num2");
		String []operation=req.getParameterValues("operation");
		
		int no1=Integer.parseInt(str1);
		int no2=Integer.parseInt(str2);
		
		PrintWriter pw=resp.getWriter();
		for(int i=0 ; i<operation.length ; i++) {
		if(operation[i].equals("ADD")) {
			int result=no1+no2;
			pw.print("<h1>ADDITION IS: "+result+"</h1>");
		}else if(operation[i].equals("MULT")) {
			int result=no1*no2;
			pw.print("<h1>MULTIPLICATION IS: "+result+"</h1>");
		}
	}
	}
}
