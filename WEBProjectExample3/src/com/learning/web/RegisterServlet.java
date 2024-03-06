package com.learning.web;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register.do")
public class RegisterServlet extends HttpServlet {
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String fullName=req.getParameter("fname");
		String userName=req.getParameter("uname");
		String password=req.getParameter("pwd");
		String cPassword=req.getParameter("cpwd");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		String gender=req.getParameter("gender");
		String course[]=req.getParameterValues("course");
		String timing=req.getParameter("timing");
		String remarks=req.getParameter("remarks");
		
		String msg="";
		if(password.equals(cPassword)) {
			msg="<H2>Registration successfull !</H2>";
		}else {
			msg="<H2>Registration Failed !</H2>";
		}
		System.out.println(msg);
		System.out.println(fullName+"\t"+userName+"\t"+email+"\t"+phone+"\t"+gender+"\t"+timing+"\t"+remarks);
		System.out.println("Courses:");
		for(String s:course) {
			System.out.println(s);
		}
		
		Writer out=res.getWriter();
		out.write(msg);
		
		
	}
	
	
}
