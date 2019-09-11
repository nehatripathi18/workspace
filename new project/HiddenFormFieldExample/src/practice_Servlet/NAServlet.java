package practice_Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NAServlet")
public class NAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		         response.setContentType("text/html");
		         PrintWriter out=response.getWriter();		         
		         String user=request.getParameter("user");
		         int age = Integer.parseInt(request.getParameter("age"));
		         String pwd=request.getParameter("pwd");
		         
		
		         	         if(age>18 && pwd.equals("1234")) {
		         	        	out.print("you are eligible " + user );
			 
			// response.sendRedirect("NameAge.html");
		        		
		         RequestDispatcher rd= request.getRequestDispatcher("/NAServlet2");
		         //rd.forward(request, response); 
		         rd.include(request, response);
		         }
		         	         else {
		         	        	out.print("wrong" + user );
		         	        	 RequestDispatcher rd= request.getRequestDispatcher("NameAge.html");
		         	        	rd.include(request, response);
		         	         }	         	         
	}
	}
