package com.learning.web;

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

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet{
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String uname=req.getParameter("uname");
		String password=req.getParameter("pwd");
		System.out.println("Given username and password is:"+uname+"\t"+password);
		
		String msg="";
		String dbPwd="";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
			String sql="select password from register where username=?";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, uname);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				dbPwd=rs.getString("password");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
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

}
