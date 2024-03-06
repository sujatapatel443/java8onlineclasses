package com.mvc.service.impl;

import com.mvc.dao.RegisterDao;
import com.mvc.dao.impl.RegisterDaoImpl;
import com.mvc.dto.RegisterDTO;
import com.mvc.service.RegisterService;

public class RegisterServiceImpl implements RegisterService{
	
	private RegisterDao registerDao;

	@Override
	public int registerUser(RegisterDTO registerDTO) {
		registerDao=new RegisterDaoImpl();
		
		int res=registerDao.registerUser(registerDTO);
		
		return res;
	}

}
