/**  
 * mybatis-test
 * com.mybatistest.ADynamicSQL 
 */
package com.mybatistest.ADynamicSQL;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.mybatistest.mapper.UserMapper;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月22日 下午10:09:53
 * @version   
 * @see 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ADynamicSQLTest {

	@Autowired
	private UserMapper userMapper;
	@Test
	public void adynamicsqlTest() {
		
		//根据map查询用户信息
//		Map<String, Object> param = new HashMap<String, Object>();
//		param.put("id", 1);
//		List<User2> users = userMapper.selectWithParam(param);
//		for(User2 user2 : users) {
//			System.out.println(user2.toString());
//		}
		
//		User2 user = new User2();
//		user.setId(1);
//		user.setAge(22);
//		user.setName("aaa");
//		List<User2> users = userMapper.selectWithUser22(user);
//		for(User2 user2 : users) {
//			System.out.println(user2.toString());
//		}
//		
//		User2 user = new User2();
//		user.setId(1);
//		user.setName("jim");
//		boolean bFlag = userMapper.updateUser(user);
//		System.out.println(bFlag);
		
//		User2 user = new User2();
//		user.setAge(23);
//		user.setName("tom");
//		user.setSex("男");
//		boolean bFlag = userMapper.insertUser(user);
//		System.out.println(bFlag);
		
		//删除用户
		boolean bFlag = userMapper.deleteUser(1);
		System.out.println(bFlag);
	}
}
