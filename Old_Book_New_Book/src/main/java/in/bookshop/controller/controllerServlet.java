package in.bookshop.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.bookshop.dto.userdto;
import in.bookshop.service.IUserService;
import in.bookshop.serviceFactory.UserServiceFactory;


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
		//IUserService userService = UserServiceFactory.getUserService();

		
		if(request.getRequestURI().endsWith("signup")) {
			IUserService userService = UserServiceFactory.getUserService();

			String fname= request.getParameter("fname");
			String lname= request.getParameter("lname");
			String email= request.getParameter("email");
			String email2= request.getParameter("email2");
			String password= request.getParameter("password");
			String status="Active";
			
		 
			
			System.out.println("registration process..");
			
			userdto user = new userdto();
			user.setFirstname(fname);
			user.setLastname(lname);
			user.setEmail(email);
			user.setEmailverified(email2);
			user.setPassword(password);
			user.setStatus(status);
			
			String st = userService.addUser(user);
			RequestDispatcher rd = null;
			System.out.println(st);
			if (status.equals("success")) {
				request.setAttribute("status", "success");
				response.sendRedirect("../insertResult.jsp");
				//rd.forward(request, response);
			} else if(status.equals("userexist")){
				//request.setAttribute("status", "userexist");
				response.sendRedirect("../register2.html");
				
			}else {
				//request.setAttribute("status", "failure");
				response.sendRedirect("../insertResult.jsp");
			
			}

			}
			else if(request.getRequestURI().endsWith("login")) {
				IUserService userService = UserServiceFactory.getUserService();

				String email= request.getParameter("Email");
				String password= request.getParameter("Password");
				System.out.println("coming to do process");
				userdto user = new userdto();
				user.setEmail(email);
				user.setPassword(password);
				String st = userService.loginUser(user);
				System.out.println(st);
				if (st.equals("success")) {
					HttpSession session = request.getSession(false);
					session.setAttribute("email", email);
					session.setAttribute("password", password);
					response.sendRedirect("../Home.jsp");
					//rd.forward(request, response);
				} else {
					//request.setAttribute("status", "userexist");
					response.sendRedirect("../Login.jsp");
					
				}
		}
			else if(request.getRequestURI().endsWith("logout")) {
				HttpSession session = request.getSession();
				session.removeAttribute("email");
				session.removeAttribute("password");
				session.invalidate();
				response.sendRedirect("../Login.jsp");		
			}
	}

}

