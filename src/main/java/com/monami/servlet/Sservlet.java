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
 * Servlet implementation class Sservlet
 */
public class Sservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sservlet() {
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
		String d=config.getInitParameter("d");
		String e=config.getInitParameter("e");
		String f=config.getInitParameter("f");
		response.setContentType("text/html");
		ServletContext context=getServletContext();
		ServletContext context1=getServletConfig().getServletContext();
		String v1=context.getInitParameter("v1");
		String vv1=config.getServletContext().getInitParameter("v1");
		out.println("Second Servlet is working");
		out.print("<br/>"+"Servlet Context: " + context);
		out.print("<br/>"+"Servlet Context1: " + context1);
		out.println("<br/>"+"Variable: "+v1);
		out.println("<br/>"+"Variable1: "+vv1);
		out.println("Servlet Config"+config);
		out.println("<br>"+"d :"+d);
		out.println("<br>"+"e :"+e);
		out.println("<br>"+"f :"+f);
	}

}
