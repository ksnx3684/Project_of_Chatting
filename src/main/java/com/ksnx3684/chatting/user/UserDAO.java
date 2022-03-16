package com.ksnx3684.chatting.user;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.ksnx3684.chatting.user.UserDAO.";
	
	@Autowired
	public UserDTO detail(UserDTO userDTO) {
		return sqlSession.selectOne(NAMESPACE+"detail", userDTO);
	}

}
