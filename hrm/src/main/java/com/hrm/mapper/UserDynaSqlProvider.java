/**  
 * hrm
 * com.hrm.mapper 
 */
package com.hrm.mapper;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.hrm.domain.User;
import com.hrm.utils.Constants;

/**
 * 描述：
 * @author wqk
 * @since 2019年10月1日 上午1:20:55
 * @version   
 * @see 
 */
public class UserDynaSqlProvider {

	/**
	 * 
	 * <p>功能描述: 动态更新</p>  
	 * @param user
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月1日 上午1:26:47
	 * @return: String
	 * @see
	 */
	public String updateUser(User user) {
		return new SQL() {
			{
				UPDATE(Constants.USERTABLE);
				if(user.getUserName() != null) {
					SET(" username = #{userName}");
				}
				if(user.getLoginName() != null) {
					SET(" loginname = #{loginName}");
				}
				if(user.getPassword() != null) {
					SET(" password= #{password}");
				}
				if(user.getStatus() != null) {
					SET(" status = #{status}");
				}
				if(user.getCreateDate() != null) {
					SET(" create_date = #{createDate}");
				}
			}
		}.toString();
	}
	
	/**
	 * 
	 * <p>功能描述:  动态保存用户信息</p>  
	 * @param user
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月1日 上午1:36:16
	 * @return: String
	 * @see
	 */
	public String insertUser(User user) {
		return new SQL() {
			{
				INSERT_INTO(Constants.USERTABLE);
				if(user.getUserName() != null) {
					VALUES("username", "#{userName}");
				}
				if(user.getLoginName() != null) {
					VALUES("loginName", "#{loginName}");
				}
				if(user.getPassword() != null) {
					VALUES("password", "#{password}");
				}
				if(user.getStatus() != null) {
					VALUES("status", "#{status}");
				}
			}
		}.toString();
	}
	
	public String count(Map<String, Object> params) {
		return new SQL() {
			{
				SELECT("count(*)");
				FROM(Constants.USERTABLE);
				if(params.get("user") != null) {
					User user = (User)params.get("user");
					if(user.getUserName() != null && user.getUserName().equals("")) {
						WHERE(" username like concat ('%',#{user.userName},'%')");
					}
					if(user.getStatus() != null && user.getStatus().equals("")) {
						WHERE(" status like concat ('%',#{user.status},'%')");
					}
				}
			}
		}.toString();
	}
}
