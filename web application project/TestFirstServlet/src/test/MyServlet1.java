package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) {
		
	System.out.println("get method called");
	
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
	
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		int x= Integer.parseInt(req.getParameter("num1"));
		int  y= Integer.parseInt(req.getParameter("num2"));
		String str1= req.getParameter("name2");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("welcome page");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("welcome<h1>" +(x + y)+ "</h1>");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("post method called");
	}
	
	
}
