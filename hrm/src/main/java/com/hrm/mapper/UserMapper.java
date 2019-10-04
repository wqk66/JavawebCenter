/**  
 * hrmsys
 * com.hrm.mapper 
 */
package com.hrm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import com.hrm.domain.User;
import com.hrm.utils.Constants;
import com.sun.javafx.collections.MappingChange.Map;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月8日 上午1:22:26
 * @version   
 * @see 
 */
@Mapper
public interface UserMapper {

	
	@Select("select * from "+Constants.USERTABLE)
	List<User> selectAllUser();
	
	
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
	@Select("select * from "+Constants.USERTABLE+" where id=#{id}")
	User selectById(Integer id);
	/**
	 * 
	 * <p>功能描述: 根据id删除用户 </p>  
	 * @param id
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月1日 上午1:18:48
	 * @return: int
	 * @see
	 */
	@Delete(" delete from "+Constants.USERTABLE+" where id=#{id}")
	int deleteById(Integer id);
	
	/**
	 * 
	 * <p>功能描述: 动态修改用户</p>  
	 * @param user
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月1日 上午1:27:44
	 * @return: int
	 * @see
	 */
	@UpdateProvider(type = UserDynaSqlProvider.class,method = "updateUser")
	int update (User user);
	
	/**
	 * 
	 * <p>功能描述: 动态查询用户 </p>  
	 * @param params
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月1日 上午1:30:51
	 * @return: List<User>
	 * @see
	 */
	List<User> selectByPage(Map<String, Object> params);
	
	/**
	 * 
	 * <p>功能描述:  根据参数查询用户总数</p>  
	 * @param params
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月1日 上午1:31:26
	 * @return: Integer
	 * @see
	 */
	Integer count(Map<String, Object> params);
	
	/**
	 * 
	 * <p>功能描述:  动态插入用户</p>  
	 * @param user
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月1日 上午1:32:15
	 * @return: int
	 * @see
	 */
	@InsertProvider(type = UserDynaSqlProvider.class,method = "insertUser")
	int save(User user);
}
