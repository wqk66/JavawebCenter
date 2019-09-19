/**  
 * hrm
 * com.hrm.user 
 */
package com.hrm.user;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hrm.domain.User;
import com.hrm.mapper.UserMapper;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月13日 上午12:11:28
 * @version   
 * @see 
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

	@Autowired
	UserMapper userMapper;
	
	@org.junit.Test
	public void test() {
		User user = new User();
		user.setLoginName("wqk77");
		user.setPassword("22222");
		userMapper.registerUser(user);
		
	}
}
