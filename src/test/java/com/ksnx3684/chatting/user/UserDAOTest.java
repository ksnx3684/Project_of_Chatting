package com.ksnx3684.chatting.user;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ksnx3684.chatting.MyJunitTest;

public class UserDAOTest extends MyJunitTest {
	
	@Autowired
	private UserDAO userDAO;

	@Test
	public void check() {
		assertNotNull(userDAO);
	}
	
	//@Test
	public void joinTest() throws Exception {
		UserDTO userDTO = new UserDTO();
		userDTO.setId("id1");
		userDTO.setPw("pw1");
		userDTO.setName("name1");
		userDTO.setGender("male");
		int result = userDAO.join(userDTO);
		
		assertEquals(1, result);
	}
	
	//@Test
	public void withdrawalTest() throws Exception {
		UserDTO userDTO = new UserDTO();
		userDTO.setId("id1");
		int result = userDAO.withdrawal(userDTO);
		assertEquals(1, result);
	}
	
	//@Test
	public void detailTest() throws Exception {
		UserDTO userDTO = new UserDTO();
		userDTO.setId("id1");
		userDTO = userDAO.detail(userDTO);
		
		assertNull(userDTO);
	}
	
	//@Test
	public void updateTest() throws Exception {
		UserDTO userDTO = new UserDTO();
		userDTO.setPw("pw11");
		userDTO.setName("name11");
		int result = userDAO.update(userDTO);
		
		assertEquals(1, result);
	}

}
