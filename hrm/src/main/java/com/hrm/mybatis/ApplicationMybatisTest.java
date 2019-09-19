/**  
 * hrm
 * com.hrm.mybatis 
 */
package com.hrm.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hrm.domain.User;
import com.hrm.mapper.UserMapper;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月12日 下午4:29:36
 * @version   
 * @see 
 */
@RunWith(SpringRunner.class)
public class ApplicationMybatisTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void test() {
		
		User user = new User();
		user.setLoginName("aaa");
		user.setPassword("111111");
		user.setUserName("bbbbb");
		user.setPhone("111111");
		user.setAddress("bbbb");
		userMapper.registerUser(user);
	}
}
