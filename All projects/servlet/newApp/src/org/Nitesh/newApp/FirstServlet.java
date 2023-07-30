package org.Nitesh.newApp;

import java.io.*;
//import java.io.PrintWriter;

import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//@WebServlet("fs")
public class FirstServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
//		Display Response on new HTML file

//		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='yellow'>"+"<h1>Welcome"+name+"from"+place+"</h1>"+"</body></html>"); 
		out.close();
//		System.out.println("This is 2nd Servlet by using genericServlet");
	}

}
