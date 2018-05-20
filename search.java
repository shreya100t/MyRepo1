package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.shoeService;

import dao.dao;
import database.database;

/**
 * Servlet implementation class search
 */
@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       response.setContentType("text/html");
	       PrintWriter out=response.getWriter();
	       dao d=new dao();
	       database d1=new database();
	       shoeService s=new shoeService();
	      String id= request.getParameter("id");
	      d.setId(id);
	       ResultSet rs=null;
	       try
	       {
	    	  rs=d1.search(id);
	    	  while(rs.next())
	    	  {
	    	  out.println(rs.getString(1));
	    	  out.println(rs.getString(2));
	    	  out.println(rs.getString(3));
	    	  out.println(rs.getString(4));

	     }}
	       
	       catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	       }
	}


