package com.parviz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String fullName = (String) req.getAttribute("fullName");
		
		PrintWriter out = res.getWriter();
		out.println("Hello " + fullName);
	}
}
