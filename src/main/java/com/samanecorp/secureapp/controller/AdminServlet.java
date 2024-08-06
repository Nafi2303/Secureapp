package com.samanecorp.secureapp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samanecorp.secureapp.dto.UserDto;
import com.samanecorp.secureapp.service.IUserService;
import com.samanecorp.secureapp.service.UserService;

@WebServlet(name = "admin", value = "/admin")
public class AdminServlet extends HttpServlet{
	
	private IUserService userService = new UserService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setAttribute("usersList", userService.getAll());
		
		req.getRequestDispatcher("WEB-INF/jsp/users.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
