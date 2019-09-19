/**  
 * hrm
 * com.hrm.mapper 
 */
package com.hrm.mapper;

import java.util.List;

import com.hrm.domain.Position;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月16日 上午12:04:56
 * @version   
 * @see 
 */
public interface PositionMapper {

	public Position queryPositionTeacherResultMapById(int id);
	
	public List<Position> queryPositionTeacherResultMap();
}
