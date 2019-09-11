package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   public void init() throws ServletException{
	   super.init();
	   System.out.println("inside init method");
   }
   
    public LifeCycleServlet() {
       
         System.out.println("creating object of LifecycleServlet"); 
        
         }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
          
		System.out.println("lifecycleservlet get called");
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
        out.println("<b> licycle  servlet get callled");
        out.println("refresh the page to check life cycle method");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void destroy()
	{		
		System.out.println("dacarysssss.....");
		//super.destroy();
	}
}
