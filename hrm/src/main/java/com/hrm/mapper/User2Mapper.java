/**  
 * hrm
 * com.hrm.mapper 
 */
package com.hrm.mapper;

import java.util.List;

import com.hrm.domain.User2;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月13日 上午1:20:18
 * @version   
 * @see 
 */
public interface User2Mapper {

	public void saveUser(User2 user2);
	
	public User2 selectUser(int id);
	
	public void modifyUser(User2 user2);
	
	public void removeUser(int id);
	
	public List<User2> resultMap();
	
	public List<User2> selectMap();
}
