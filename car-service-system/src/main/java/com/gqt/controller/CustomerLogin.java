package com.gqt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gqt.model.Customer;
public class CustomerLogin extends HttpServlet {
	@Override
	protected void service(HttpServletRequest Request, HttpServletResponse Response) throws ServletException, IOException {
		String username=Request.getParameter("username");
		String password=Request.getParameter("password");
		
		
		Customer tempCustomer= new Customer();
		tempCustomer.setUsername(username);
		tempCustomer.setPassword(password);
		
		
		int status=tempCustomer.customerLogin();
		if(status==1) {
			Response.sendRedirect("/car-service-system/customerLogin.jsp");
					
		}
		else if(status==-1) {
			Response.sendRedirect("/car-service-system/customerInvalidUsername.jsp");
			
			
		}
		else {
			Response.sendRedirect("/car-service-system/customerInvalidPassword.jsp");
			
			
		}
	
	}
}
