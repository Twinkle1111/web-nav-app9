package com.monami.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fservlett
 */
public class Fservlett extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fservlett() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		String a=config.getInitParameter("a");
		String b=config.getInitParameter("b");
		String c=config.getInitParameter("c");
		response.setContentType("text/html");
		ServletContext context=getServletContext();
		ServletContext context1=getServletConfig().getServletContext();
		String v1=context.getInitParameter("v1");
		String vv1=config.getServletContext().getInitParameter("v1");
		
		out.println("First Servlet is working");
		out.print("<br/>"+"Servlet Context: " + context);
		out.print("<br/>"+"Servlet Context1: " + context1);
		out.println("<br/>"+"Variable: "+v1);
		out.println("<br/>"+"Variable1: "+vv1);
		out.println("Servlet Config"+config);
		out.println("<br>"+"a :"+a);
		out.println("<br>"+"b :"+b);
		out.println("<br>"+"c :"+c);
		
	}

}
