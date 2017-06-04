package field;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/field")
public class FieldInitValueExample extends HttpServlet{
	private static final long serialVersionUID =1L;
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		
		FieldInitValue fiv=new FieldInitValue();
	
		request.setAttribute("hello", fiv);
		RequestDispatcher view = request.getRequestDispatcher("Show.jsp"); 
		view.forward(request,response);
		
	}
	
}
