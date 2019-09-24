/**  
 * mybatis-test
 * com.mybatistest.mapper 
 */
package com.mybatistest.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;

import com.mybatistest.domain.User;
import com.mybatistest.domain.User2;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月19日 下午6:52:47
 * @version   
 * @see 
 */
public interface UserMapper {

	public User queryUserbyId(int id);
	
	@Insert("insert into tb_user2(name,sex,age) values(#{name},#{sex},#{age})")
	@Options(useGeneratedKeys = true,keyProperty = "id")
	int saveUser(User2 user);
	
	@Delete("delete from tb_user2 where id = #{id}")
	boolean removeUser(@Param("id") Integer id);
	
	@Update("update tb_user2 set name=#{name},sex=#{sex},age=#{age} where id=#{id}")
	boolean modifyUser(User2 user);
	
	@Select("select * from tb_user2 where id=#{id}")
	@Results({
		
		@Result(id=true,column = "id",property = "id"),
		@Result(property = "name",column = "name"),
		@Result(property = "sex",column = "sex"),
		@Result(property = "age",column = "age")
	})
	User2 selectUserById(Integer id);
	 
	@Select("select * from tb_user2")
	List<User2> selectAllUser();
	
	@SelectProvider(type = UserDynaSqlProvider.class,method = "selectWithParam")
	List<User2> selectWithParam(Map<String, Object> param);
	
	@SelectProvider(type = UserDynaSqlProvider.class,method = "selectWithUser")
	List<User2> selectWithUser22(User2 user);
	
	@UpdateProvider(type = UserDynaSqlProvider.class,method = "udpateUser")
	boolean updateUser(User2 user);
	
	@InsertProvider(type = UserDynaSqlProvider.class,method = "insertUser")
	boolean insertUser(User2 user);
	
	@DeleteProvider(type = UserDynaSqlProvider.class,method = "deleteUser")
	boolean deleteUser(Integer id);
}
