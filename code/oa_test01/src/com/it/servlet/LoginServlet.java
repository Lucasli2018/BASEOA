package com.it.servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.it.po.User;
import com.it.service.LoginService;
import com.it.service.impl.LoginServiceImpl;

/**
 * 登录
 * @author Administrator
 *
 */
public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LoginService login=new LoginServiceImpl();
		User user=new User();
		user.setId(1);
		user.setName(request.getParameter("name"));
		user.setPassword(request.getParameter("password"));
		System.out.println(user);
		login.save(user);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
