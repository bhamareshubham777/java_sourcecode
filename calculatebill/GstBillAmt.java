package calculatebill;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/twolink")
public class GstBillAmt extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double totalAmt= (double) req.getAttribute("totalAmt");
		
		double gstAmt= (totalAmt+(totalAmt*0.05));
		PrintWriter pw=resp.getWriter();
		pw.print("<h1 style='color:maroon'>TOTAL BILL AMOUNT: "+totalAmt+"</h1>");
		pw.print("<h1 style='color:darkblue'>TOTAL BILL AMOUNT WITH GST: "+gstAmt+"</h1>");
	}
}
