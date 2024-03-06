package com.india.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/login.do",loadOnStartup=1)
public class LoginServlet extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init(ServletConfig config)---LoginServlet");
	}
	
	@Override
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
	
	@Override
	public void destroy() {
		System.out.println("destroy()--LoginServlet");
	}

}
