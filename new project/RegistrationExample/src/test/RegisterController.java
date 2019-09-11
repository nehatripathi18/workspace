package test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name=request.getParameter("name");
	String em = request.getParameter("email");
	if(name.trim().length()==0)
	{
		response.sendRedirect("RegistrationForm.html?status=Name cannot be empty");
		return;
	}
	if(em.trim().length()==0)
	{
		response.sendRedirect("RegistrationForm.html?status=Email cannot be empty");
		return;
	}
	
	response.sendRedirect("Login.html");
	
	}

}
