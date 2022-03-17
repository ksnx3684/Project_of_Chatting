package com.ksnx3684.chatting.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	public int join(UserDTO userDTO) throws Exception {
		return userDAO.join(userDTO);
	}
	
	public int withdrawal(UserDTO userDTO) throws Exception {
		return userDAO.withdrawal(userDTO);
	}
	
	public UserDTO detail(UserDTO userDTO) throws Exception {
		return userDAO.detail(userDTO);
	}
	
	public int update(UserDTO userDTO) throws Exception {
		return userDAO.update(userDTO);
	}

}
