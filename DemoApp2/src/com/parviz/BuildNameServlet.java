package com.parviz;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BuildNameServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String firstName = req.getParameter("first-name");
		String lastName = req.getParameter("last-name");
		String fullName = firstName + " " + lastName;
		
		req.setAttribute("fullName", fullName);
		RequestDispatcher rd = req.getRequestDispatcher("greet");
		rd.forward(req, res);
	}
}
