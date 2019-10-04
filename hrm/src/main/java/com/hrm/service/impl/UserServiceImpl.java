/**  
 * hrmsys
 * com.hrm.service.impl 
 */
package com.hrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

	/**
	 * 
	 * <p>
	 * 功能描述: 根据id查询用户
	 * </p>
	 * 
	 * @param id
	 * @return
	 * @author: wqk
	 * @date: 2019年10月1日 上午1:15:28
	 * @return: User
	 * @see
	 */
	public User selectById(Integer id) {
		return userMapper.selectById(id);
	}

	/**
	 * 
	 * <p>
	 * 功能描述: 插入用户信息
	 * </p>
	 * 
	 * @param user
	 * @return
	 * @author: wqk
	 * @date: 2019年10月1日 上午1:46:08
	 * @return: int
	 * @see
	 */
	public int insertUser(User user) {
		return userMapper.save(user);
	}

	/**
	 * 查询所有的用户
	 */
	@Override
	public List<User> selectAllUser() {
		return userMapper.selectAllUser();
	}

	/**
	 * pagehelper分页
	 */
	@Override
	public PageInfo<User> selectAll(Integer page, Integer size) {
		PageHelper.startPage(page, size);
		List<User> userList = userMapper.selectAllUser();
		PageInfo<User> pageInfo = new PageInfo<User>(userList);
		return pageInfo;
	}

	/**
	 * 根据id删除用户
	 */
	public boolean deleteUserById(Integer id) {
		return userMapper.deleteById(id) > 0;
	}
}
