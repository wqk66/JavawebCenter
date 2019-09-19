/**  
 * hrmsys
 * com.hrm.mapper 
 */
package com.hrm.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hrm.domain.User;

/**
 * 描述：
 * @author tsingsoft
 * @since 2019年9月8日 上午1:22:26
 * @version   
 * @see 
 */
@Mapper
public interface UserMapper {

	//@Select("select * from tb_user where loginname=#{loginName} and password=#{password}")
	User findWithLoginNameAndPassword(@Param("loginName")String loginName,@Param("password")String password);
	
	/**
	 * 
	 * <p>功能描述:用户名注册 </p>  
	 * @param user
	 * @return
	 * @return: int
	 * @author: wqk   
	 * @date: 2019年9月9日 下午8:14:28
	 * @see
	 */
	int registerUser(User user);
}
