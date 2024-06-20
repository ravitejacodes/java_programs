package com.gqt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gqt.model.Customer;

public class CustomerRegister extends HttpServlet {
	@Override
	protected void service(HttpServletRequest Request, HttpServletResponse Response) throws ServletException, IOException {
		String name=Request.getParameter("name");
		String username=Request.getParameter("username");
		String password=Request.getParameter("password");
		String email=Request.getParameter("email");
		PrintWriter out= Response.getWriter();
		out.println(name+" "+username+" "+password+" "+email);
		
		Customer tempCustomer=new Customer(name,username,password,email); 
		int rows=tempCustomer.customerRegister();
		if(rows== 0) {
			Response.sendRedirect("/car-service-system/registerFailure.jsp");
		}
		else {
			Response.sendRedirect("/car-service-system/registerSucces.jsp");
		}
		
		
	}
	
}
