/**  
 * hrmsys
 * com.hrm.service 
 */
package com.hrm.service;

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
}
