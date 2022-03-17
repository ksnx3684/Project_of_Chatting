package com.ksnx3684.chatting.user;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.ksnx3684.chatting.user.UserDAO.";
	
	public int join(UserDTO userDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"join", userDTO);
	}
	
	public int withdrawal(UserDTO userDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+"withdrawal", userDTO);
	}
	
	public UserDTO detail(UserDTO userDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"detail", userDTO);
	}
	
	public int update(UserDTO userDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"update", userDTO);
	}

}
