/**  
 * hrm
 * com.hrm.user 
 */
package com.hrm.user;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hrm.domain.Position;
import com.hrm.mapper.PositionMapper;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月16日 下午7:02:48
 * @version   
 * @see 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostionApplicationTest {

	@Autowired
	private PositionMapper positionMapper;
	
	@org.junit.Test
	public void postionTest() {
		
		Position position = positionMapper.queryPositionTeacherResultMapById(1);
		System.out.println(position.toString());
	}
}
