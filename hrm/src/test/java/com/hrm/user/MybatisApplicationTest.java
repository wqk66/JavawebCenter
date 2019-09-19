/**  
 * hrm
 * com.hrm.user 
 */
package com.hrm.user;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hrm.domain.User2;
import com.hrm.mapper.User2Mapper;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月13日 上午12:07:48
 * @version   
 * @see 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTest {

	@Autowired
	User2Mapper userMapper;
//	@Test
//	public void saveUser() {
//		User2 user2 = new User2();
//		user2.setName("wqk3");;
//		user2.setAge(12);
//		user2.setSex("男");
//		userMapper.saveUser(user2);
//	}
//	@Test
//	public void selectUser() {
//		int id = 3;
//		User2 user = userMapper.selectUser(id);
//		System.out.println(user.toString());
//	}
//	
//	@Test
//	public void modifyUser() {
//		User2 user2 = new User2();
//		user2.setName("wqk4");
//		user2.setAge(20);
//		user2.setSex("女");
//		user2.setId(3);
//		userMapper.modifyUser(user2);
//	}
//	
//	@Test
//	public void removeUser() {
//		int id = 3;
//		userMapper.removeUser(id);
//	}
	
//	@Test
//	public void resultMap() {
//		List<User2> listUser = userMapper.resultMap();
//		for(User2 user2 : listUser) {
//			System.out.println(user2.toString());
//		}
//	}
	@Test
	public void selectMap() {
		List<User2> list = userMapper.selectMap();
		for(User2 user2 : list) {
			System.out.println(user2.toString());
		}
	}
}
