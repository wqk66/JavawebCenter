/**  
 * hrmsys
 * com.hrm.service.impl 
 */
package com.hrm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrm.domain.User;
import com.hrm.mapper.UserMapper;
import com.hrm.service.UserService;

/**
 * 描述：
 * 
 * @author wqk
 * @since 2019年9月8日 上午1:40:47
 * @version
 * @see
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(String loginName, String password) {
		return userMapper.findWithLoginNameAndPassword(loginName, password);
	}

	@Override
	public boolean registerUser(User user) {
		return userMapper.registerUser(user) > 0;
	}

}
