package Product_Soap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Calculation")
public class Calculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	} 
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out=response.getWriter();		         
        String pname=request.getParameter("pname");
        int pqty = Integer.parseInt(request.getParameter("pqty"));
        //int pprice; // = Integer.parseInt(request.getParameter("pprice"));
		int invoice;
		
		switch (pname)
		{
		case "Soap":invoice= pqty*50;
		
	     	out.println("invoice of the purchase is : " +invoice);
	     	break;
		case "Shampoo":invoice= pqty*120;
			
	     	out.println("invoice of the purchase is " +invoice);
	     	break;
	      
	    }
		RequestDispatcher rd= request.getRequestDispatcher("/Invoice");
     	rd.include(request, response);
}    		
}