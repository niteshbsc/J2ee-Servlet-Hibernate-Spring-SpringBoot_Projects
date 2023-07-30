package org.jspiders.lifecycleApp;

import java.io.*;

import javax.servlet.*;

public class FirstServlet extends GenericServlet {
	
	@Override
	
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
//		Display Response on new HTML file
		
		PrintWriter out=resp.getWriter();
		out.println("<html><body bgcolor='green'>"
				+ "<h1>welcome "+name+"from "+place+"</h1>"
						+ "</body></html>");
		out.close();
			}

}
