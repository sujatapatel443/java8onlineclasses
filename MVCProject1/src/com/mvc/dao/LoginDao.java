package com.mvc.dao;

import com.mvc.dto.LoginDTO;
import com.mvc.dto.RegisterDTO;

public interface LoginDao {
	
	public String loginUser(LoginDTO loginDTO);

}
