
package test;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TestController")
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public TestController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String un=request.getParameter("username");
		response.setContentType("text/html");
				PrintWriter out=response.getWriter();
				out.println("<b> welcome to the testcontroller direct forward servlet</b>");
				out.println("user name : " + un );
	}

}
