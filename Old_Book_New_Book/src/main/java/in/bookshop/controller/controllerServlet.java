package in.bookshop.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controller/*")
public class controllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("coming to do get");
		doProcess(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("coming to dopost");
		doProcess(request, response);
	}
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getRequestURI().endsWith("signup")) {
			String userid= request.getParameter("Email");
			String password= request.getParameter("Password");
			System.out.println("coming to do process");
			}
			else if(request.getRequestURI().endsWith("login")) {
				String userid= request.getParameter("Email");
				String password= request.getParameter("Password");
				System.out.println("coming to do process");
			
		}
		
	}

}
