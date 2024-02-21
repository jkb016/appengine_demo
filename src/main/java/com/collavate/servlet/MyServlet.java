package com.collavate.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(MyServlet.class.getName());
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.info("start doGet");
		String response = "No records";
		resp.setContentType("text/html");
		resp.getWriter().print(response);
		logger.info("exit doGet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.info("exit doPost");
	}
	

}
