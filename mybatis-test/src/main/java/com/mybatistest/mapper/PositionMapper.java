/**  
 * hrm
 * com.hrm.mapper 
 */
package com.mybatistest.mapper;

import java.util.List;
import java.util.Map;

import com.mybatistest.domain.Position;
import com.mybatistest.domain.Teacher;


/**
 * 描述�?
 * @author wqk
 * @since 2019�?9�?16�? 上午12:04:56
 * @version   
 * @see 
 */
public interface PositionMapper {

	public Position queryPositionTeacherResultMapById(int id);
//	
	public Position queryPositionTeacherResultMap(int id);
	
	public Position queryPositionById(int id);
	
	public Teacher queryPositionByTeacherID(int id);
	
	public List<Map<String, Object>> queryPotionByTeacherid(String id);
}
