package com.mvc.controller;

import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.dto.LoginDTO;
import com.mvc.service.LoginService;
import com.mvc.service.impl.LoginServiceImpl;

@WebServlet("/login.do")
public class LoginController extends HttpServlet{
	
	private LoginService loginService;
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		loginService=new LoginServiceImpl();
		
		String uname=req.getParameter("uname");
		String password=req.getParameter("pwd");
		System.out.println("Given username and password is:"+uname);
		
		String msg="";
		String dbPwd="";
		
		LoginDTO loginDTO=new LoginDTO();
		loginDTO.setUsername(uname);
		loginDTO.setPwd(password);
		
		dbPwd=loginService.loginUser(loginDTO);
		
		if(dbPwd.equals(password)) {
			msg="<H1>Login Successfull. <BR/> Welcome " +uname+" in Java Learning, Thanks for using me</H1>";
		}else {
			msg="<H1>Login Failed.</H1>";
		}
		
		Writer out=res.getWriter();
		out.write(msg);
		out.write("<br/>");
		out.write("<br/>");
		
		RequestDispatcher rd=req.getRequestDispatcher("/home.html");
		rd.include(req, res);
	}
	
	void show() {
		
		//loginService.loginUser(null);
		System.out.println("show()-- LoginServlet");
	}

}
