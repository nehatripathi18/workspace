package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("user");
		
		//hidden from field/HiddenFormFieldExample/src/test/.java
		
		out.println("<Form action='SecondServlet'>");
		out.println("<input type='hidden' name='user' value='"+ user+"'>");
		out.println("<input type='submit' value='submit'>");
		out.println("</form>");
	}

}
