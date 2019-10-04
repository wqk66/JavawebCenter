/**  
 * hrm
 * com.hrm.interceptor 
 */
package com.hrm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hrm.domain.User;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月29日 下午1:13:20
 * @version   
 * @see 
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

	//方法执行前
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       
		boolean flag = false;
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		if(user != null) {//用户已经登陆
			flag = true;
		}else {
			flag = false;
			request.getRequestDispatcher("/loginForm").forward(request, response);
			request.setAttribute("msg", "用户没有登陆，无法访问系统");
		}
		return flag;

	}
	
	//方法执行后
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
 
    }
    
    //页面渲染前
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
 
    }
}
