/**  
 * mybatis-test
 * com.mybatistest.many_to_one 
 */
package com.mybatistest.many_to_one;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mybatistest.domain.User;
import com.mybatistest.mapper.UserMapper;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月19日 下午6:57:52
 * @version   
 * @see 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApplicationTest {

	@Autowired
	private UserMapper userMapper;
	@Test
	public void test() {
		User user = userMapper.queryUserbyId(1);
		System.out.println(user.toString());
	}
	
}
