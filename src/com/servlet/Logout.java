package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//This servlet will serve as the servlet for the logout process
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//This function is used to invalidate the session in order to properly log the user out
		HttpSession session=request.getSession(false);
		session.invalidate();
		//This function is used to redirect the user back to the login page after logging out
		response.sendRedirect("login.html");
	}

}