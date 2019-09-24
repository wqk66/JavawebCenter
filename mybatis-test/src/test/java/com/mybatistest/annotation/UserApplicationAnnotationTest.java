/**  
 * mybatis-test
 * com.mybatis.annotation 
 */
package com.mybatistest.annotation;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mybatistest.domain.User2;
import com.mybatistest.mapper.UserMapper;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月22日 上午10:53:08
 * @version   
 * @see 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApplicationAnnotationTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void userTest() {
		
		//保存用户信息
//		User2 user2 = new User2();
//		user2.setAge(20);
//		user2.setName("aa");
//		user2.setSex("男");
//		int count =  userMapper.saveUser(user2);
//		System.out.println(count);
		
		User2 user2 = userMapper.selectUserById(1);
		System.out.println(user2.toString());
		
		//更新用户信息
//		User2 user2 = new User2();
//		user2.setId(6);
//		user2.setName("missyou2");
//		user2.setAge(33);
//		user2.setSex("女");
//		boolean count = userMapper.modifyUser(user2);
//		System.out.println(count);
		
		//删除用户信息
//		boolean bFlag = userMapper.removeUser(6);
//		System.out.println(bFlag);
		
		//查询用户的所有信息
//		List<User2> user2s = userMapper.selectAllUser();
//		System.out.println(user2s.size());
				
		
	}
}
