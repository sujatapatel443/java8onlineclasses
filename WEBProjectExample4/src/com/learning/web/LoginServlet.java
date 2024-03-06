package com.learning.web;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet{
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String name=req.getParameter("uname");
		String password=req.getParameter("pwd");
		System.out.println("Given username and password is:"+name+"\t"+password);
		
		String msg="";
		if(name.equals(password)) {
			msg="<H1>Login Successfull. <BR/> Welcome " +name+" in Java Learning, Thanks for using me</H1>";
		}else {
			msg="<H1>Login Failed.</H1>";
		}
		
		Writer out=res.getWriter();
		out.write(msg);
	}

}
