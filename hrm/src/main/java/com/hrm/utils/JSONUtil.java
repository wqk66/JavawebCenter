/**  
 * hrm
 * com.hrm.utils 
 */
package com.hrm.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;

/**
 * 描述：json公用工具
 * @author wqk
 * @since 2019年10月5日 下午4:59:14
 * @version   
 * @see 
 */
public class JSONUtil {

	public final static String SUCC_CODE = "1";
	public final static String FAIL_CODE = "0";
	public final static String SUCC_MSG = "成功";
	public final static String FAIL_MSG = "失败";
	
	/**
	 * 
	 * <p>功能描述: 创建成功json</p>  
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月5日 下午5:05:04
	 * @return: String
	 * @see
	 */
	public static String createSuccJson() {
		JSONObject jb = new JSONObject();
		jb.put("code", SUCC_CODE);
		jb.put("msg",SUCC_MSG);
		return jb.toJSONString();
	}
	
	/**
	 * 
	 * <p>功能描述: 创建失败json</p>  
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月5日 下午5:05:36
	 * @return: String
	 * @see
	 */
	public static String createFailJson() {
		JSONObject jb = new JSONObject();
		jb.put("code", FAIL_CODE);
		jb.put("msg",FAIL_MSG);
		return jb.toJSONString();
	}
	
	/**
	 * 
	 * <p>功能描述: 发送后台json到前端</p>  
	 * @param response
	 * @param jsonStr
	 * @author: wqk   
	 * @date: 2019年10月17日 下午8:22:56
	 * @return: void
	 * @see
	 */
	public static void send(HttpServletResponse response,String jsonStr) {
		response.setContentType("text/html;charset=UTF-8");
		response.setHeader("Cache-Control", "no-cache");
//		response.setCharacterEncoding("UTF-8");
		try {
			response.getWriter().write(jsonStr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
