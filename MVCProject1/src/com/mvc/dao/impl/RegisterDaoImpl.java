package com.mvc.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mvc.dao.RegisterDao;
import com.mvc.dto.RegisterDTO;

public class RegisterDaoImpl implements RegisterDao{

	@Override
	public int registerUser(RegisterDTO registerDTO) {
		
		int result=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
			String sql="insert into register values (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, registerDTO.getFullName());
			ps.setString(2, registerDTO.getUserName());
			ps.setString(3, registerDTO.getPassword());
			ps.setString(4, registerDTO.getcPassword());
			ps.setString(5, registerDTO.getEmail());
			ps.setString(6, registerDTO.getPhone());
			ps.setString(7, registerDTO.getGender());
			ps.setString(8, registerDTO.getCourses());
			ps.setString(9, registerDTO.getTiming());
			ps.setString(10, registerDTO.getRemarks());
			
			result=ps.executeUpdate();
			
			if(result==1) {
				System.out.println("Register successfully");
				//msg="<H2> Registration successfull ! </H2>";
			}
			else {
				System.out.println("Registeration Failed");
				//msg="<H2> Registration Failed ! </H2>";
			}
			
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
