package practice_Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NAServlet2")
public class NAServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");
         PrintWriter out=response.getWriter();		         
        // String user=request.getParameter("user");
        // int age = Integer.parseInt(request.getParameter("age"));
        // String pwd=request.getParameter("pwd");

         
         out.println("welcome" );
		
			
	}

}
