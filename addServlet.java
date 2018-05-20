package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.shoeService;

import dao.dao;

/**
 * Servlet implementation class addServlet
 */
@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	//	String id=request.getParameter("id");
		String brand=request.getParameter("brand");
		String type=request.getParameter("type");
		int price=Integer.parseInt(request.getParameter("price"));
		
		dao d=new dao();
		shoeService s=new shoeService();
		
		//d.setId(id);
		d.setName(brand);
		d.setType(type);
		d.setPrice(price);
		
		
			try {
				s.addItem(d);
				out.println("added successfully");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		
		
	}

}
