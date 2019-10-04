/**  
 * hrmsys
 * com.hrm.service 
 */
package com.hrm.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.hrm.domain.User;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月8日 上午1:38:29
 * @version   
 * @see 
 */
public interface UserService {

	User login(String loginName,String password);
	boolean registerUser(User user);
	
	/**
	 * 
	 * <p>功能描述: 根据id查询用户</p>  
	 * @param id
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月1日 上午1:15:28
	 * @return: User
	 * @see
	 */
	User selectById(Integer id);
	
	/**
	 * 
	 * <p>功能描述: 插入用户信息</p>  
	 * @param user
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月1日 上午1:46:08
	 * @return: int
	 * @see
	 */
	int insertUser(User user);
	
	List<User> selectAllUser();
	PageInfo<User> selectAll(Integer page,Integer size);
	
	/**
	 * 根据userId删除用户
	 * <p>功能描述: </p>  
	 * @param id
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月4日 下午11:33:56
	 * @return: int
	 * @see
	 */
	boolean deleteUserById(Integer id);
}
