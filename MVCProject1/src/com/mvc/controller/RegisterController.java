package com.mvc.controller;

import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.dto.RegisterDTO;
import com.mvc.service.RegisterService;
import com.mvc.service.impl.RegisterServiceImpl;


@WebServlet("/register.do")
public class RegisterController extends HttpServlet {
	
	private RegisterService registerService;
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		registerService=new RegisterServiceImpl();
		
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
		
		System.out.println(fullName+"\t"+userName+"\t"+email+"\t"+phone+"\t"+gender+"\t"+timing+"\t"+remarks);
		System.out.println("Courses:");
		String courses="";
		for(String s:course) {
			courses=courses+" , "+s;
			System.out.println(s);
		}
		
		RegisterDTO registerDTO =new RegisterDTO(fullName,userName,password,cPassword,email,phone,gender,courses,timing,remarks);
		
		if(password.equals(cPassword)) {
			
			int result=registerService.registerUser(registerDTO);
			
			if(result==1) {
				msg="<H2> Registration successfull ! </H2>";
			}
			else {
				msg="<H2> Registration Failed ! </H2>";
			}
			
		}else {
			System.out.println("Password and confirm password is missmatched.. Please provide same");
			msg="<H1 >Password and confirm password is missmatched.. Please provide same </H1>";
		}
		
		
		Writer out=res.getWriter();
		out.write(msg);
		out.write("<br/>");
		out.write("<br/>");
		
		RequestDispatcher rd=req.getRequestDispatcher("/home.html");
		rd.include(req, res);
		
		
	}
	
	
}
