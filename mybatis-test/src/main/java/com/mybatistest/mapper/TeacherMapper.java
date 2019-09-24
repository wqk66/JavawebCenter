/**  
 * hrm
 * com.hrm.mapper 
 */
package com.mybatistest.mapper;

import java.util.List;
import java.util.Map;

import com.mybatistest.domain.Student;
import com.mybatistest.domain.Teacher;

/**
 * 
 * 描述：
 * @author wqk
 * @since 2019年9月20日 上午11:32:47
 * @version   
 * @see
 */
public interface TeacherMapper {

	/**
	 * 
	 * <p>功能描述:返回值为map的多对多查询 </p>  
	 * @param id
	 * @return
	 * @return: List<Map<String,Object>>
	 * @author: wqk   
	 * @date: 2019年9月20日 下午1:03:25
	 * @see
	 */
	public List<Map<String, Object>>queryStudentByTeacherID(int id);
	
	/**
	 * 
	 * <p>功能描述: 返回值为领域模型的多对多查询</p>  
	 * @param id
	 * @return
	 * @return: List<Map<String,Object>>
	 * @author: wqk   
	 * @date: 2019年9月20日 下午1:51:42
	 * @see
	 */
	public Teacher queryStudentByTeacherID2(int id);
	
	/**
	 * 
	 * <p>功能描述: 根据学生id查询教师信息</p>  
	 * @param id
	 * @return
	 * @return: Student
	 * @author: wqk   
	 * @date: 2019年9月20日 下午2:06:41
	 * @see
	 */
	public Student queryteacherByStudentId(int id);
	
	/**
	 * 
	 * <p>功能描述: 保存教师信息</p>  
	 * @param teacher
	 * @return: void
	 * @author: wqk   
	 * @date: 2019年9月20日 下午5:12:08
	 * @see
	 */
	public void insertTeacher(Teacher teacher);
	
	/**
	 * 
	 * <p>功能描述: 更新教师信息</p>  
	 * @param teacher
	 * @return: void
	 * @author: wqk   
	 * @date: 2019年9月20日 下午5:13:37
	 * @see
	 */
	public void updateTeacher(Teacher teacher);
	
	/**
	 * 
	 * <p>功能描述:  删除教师信息</p>  
	 * @param id
	 * @author: wqk   
	 * @date: 2019年9月20日 下午5:22:58
	 * @return: void
	 * @see
	 */
	public void deleteTeacher(int id);
}
