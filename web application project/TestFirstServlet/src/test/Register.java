package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out=response.getWriter();
	response.setContentType("text/html");
	String n =request.getParameter("userName");
	String p =request.getParameter("userPass");
	String e =request.getParameter("userEmail");
	String c =request.getParameter("userCountry");
	
	out.println("<html>");
	out.println("<head>");
	out.println("<title>");
	out.println("welcome page");
	out.println("</title>");
	out.println("</head>");
	out.println("<body>");
	//out.println("welcome<h1>" +(x + y)+ "</h1>");
	out.println("</body>");
	out.println("</html>");
	
	
	
	}

}
