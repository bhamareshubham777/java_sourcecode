package calculatebill;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/onelink")
public class TotalBillAmt extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String str1=req.getParameter("quantity");
		String str2=req.getParameter("price");
		
		int qty=Integer.parseInt(str1);
		double price=Double.parseDouble(str2);
		
		double total=qty*price;
		
		req.setAttribute("totalAmt", total);
		
		RequestDispatcher rd=req.getRequestDispatcher("twolink");
		rd.include(req, resp);
	}
}
