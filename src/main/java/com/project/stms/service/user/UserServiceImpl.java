package com.project.stms.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.stms.command.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int join(UserVO userVO) {
		return userMapper.join(userVO);
	}


	@Override
	public int changePW(UserVO userVO) {
		return userMapper.changePW(userVO);
	}


	@Override
	public UserVO userInfo(String user_email) {
		return userMapper.userInfo(user_email);
	}


	@Override
	public UserVO checkId(String user_email) {
		
		return userMapper.checkId(user_email);
	}


	@Override
	public UserVO changePE(String user_email) {
		return userMapper.changePE(user_email);
	}


	@Override
	public int delete(String user_id) {
		return userMapper.delete(user_id);
	}




	


}
