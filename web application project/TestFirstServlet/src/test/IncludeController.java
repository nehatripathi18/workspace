package test;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/IncludeController")
public class IncludeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String un=request.getParameter("username");
		String pass= request.getParameter("pwd");
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<b> welcome to the forwars controller first servlet</b>");
		out.println("<b> user name is "+ un + "</b>");
		out.println("<br");
		out.println("<br");
		out.println("<br");

	RequestDispatcher dis= request.getRequestDispatcher("/TestController");
	dis.include(request, response);
		
		
		
	}

}
