package Product_Soap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Invoice
 */
@WebServlet("/Invoice")
public class Invoice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
        PrintWriter out=response.getWriter();		         
        String pname=request.getParameter("pname");
        int pqty = Integer.parseInt(request.getParameter("pqty"));
       // int pprice = Integer.parseInt(request.getParameter("pprice"));
		
     //   out.println("Your total purchase is for rupees : " + invoice);
		
        out.println("thanks for shopping with us "  );
        
	}

}
