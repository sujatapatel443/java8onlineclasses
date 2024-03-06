package com.mvc.service.impl;

import com.mvc.dao.LoginDao;
import com.mvc.dao.impl.LoginDaoImpl;
import com.mvc.dto.LoginDTO;
import com.mvc.service.LoginService;

public class LoginServiceImpl implements LoginService{
	
	private LoginDao loginDao;

	@Override
	public String loginUser(LoginDTO loginDTO) {
		
		loginDao=new LoginDaoImpl();
		
		String dbPASSWORD=loginDao.loginUser(loginDTO);
		
		return dbPASSWORD;
	}
	
	public void addUser() {
		System.out.println("User added..");
	}

}
