package com.learning.web;

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
		
		System.out.println(fullName+"\t"+userName+"\t"+email+"\t"+phone+"\t"+gender+"\t"+timing+"\t"+remarks);
		System.out.println("Courses:");
		String courses="";
		for(String s:course) {
			courses=courses+" , "+s;
			System.out.println(s);
		}
		
		if(password.equals(cPassword)) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
				String sql="insert into register values (?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				
				ps.setString(1, fullName);
				ps.setString(2, userName);
				ps.setString(3, password);
				ps.setString(4, cPassword);
				ps.setString(5, email);
				ps.setString(6, phone);
				ps.setString(7, gender);
				ps.setString(8, courses);
				ps.setString(9, timing);
				ps.setString(10, remarks);
				
				int result=ps.executeUpdate();
				
				if(result==1) {
					System.out.println("Register successfully");
					msg="<H2> Registration successfull ! </H2>";
				}
				else {
					System.out.println("Registeration Failed");
					msg="<H2> Registration Failed ! </H2>";
				}
				
			
			
			} catch (Exception e) {
				e.printStackTrace();
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
