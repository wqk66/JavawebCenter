/**  
 * mybatis-test
 * com.mybatistest.mapper 
 */
package com.mybatistest.mapper;

import java.util.Map;
import org.apache.ibatis.jdbc.SQL;
import com.mybatistest.domain.User2;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月22日 下午10:01:25
 * @version   
 * @see 
 */
public class UserDynaSqlProvider {

	//查询用户信息
	public String selectWithParam(Map<String, Object> param) {
		return new SQL() {
			{
				SELECT("name,sex");
				FROM("tb_user2");
				if(param.get("id") != null) {
					WHERE(" id=#{id}");
				}
				if(param.get("sex") != null) {
					WHERE(" sex = #{sex}");
				}
				if(param.get("name") != null) {
					WHERE(" name = #{name}");
				}
				if(param.get("age") != null) {
					WHERE(" age= #{age}");
				}
				
			}
			
		}.toString();
	}
	
	//查询用户信息
	public String selectWithUser(User2 user) {
		return new SQL() {
			{
				SELECT("*");
				FROM("tb_user2");
				if(user.getId() != 0) {
					WHERE("id=#{id}");
				}
				if(user.getName() != null) {
					WHERE("name=#{name}");
				}
				if(user.getAge() != 0) {
					WHERE("age=#{age}");
				}
			}
		}.toString();
	}
	
	//更新用户信息
	public String udpateUser(User2 user) {
		return new SQL() {
			{
				UPDATE("tb_user2");
				if(user.getName() != null) {
					SET("name=#{name}");
				}
				WHERE("id = #{id}");
			}
		}.toString();
	}
	
	
	//保存信息
	public String insertUser(User2 user) {
		return new SQL() {
			{
				INSERT_INTO("tb_user2");
				if(user.getAge() != 0) {
					VALUES("age", "#{age}");
				}
				if(user.getSex() != null) {
					VALUES("sex", "#{sex}");
				}
				if(user.getName() != null) {
					VALUES("name", "#{name}");
				}
				
			}
		}.toString();
	}
	
	//删除用户
	public String deleteUser(Integer id) {
		return new SQL() {
			
			{
				DELETE_FROM("tb_user2");
				WHERE("id=#{id}");
			}
		}.toString();
	}
}
