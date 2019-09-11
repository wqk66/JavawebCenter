/**  
 * hrmsys
 * com.hrm.controller 
 */
package com.hrm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.hrm.domain.User;
import com.hrm.service.UserService;

/**
 * 描述：
 * 
 * @author wqk
 * @since 2019年9月8日 上午1:44:21
 * @version
 * @see
 */
@Controller
public class UserController {

	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	/**
	 * 
	 * <p>功能描述:登陆方法 </p>  
	 * @param loginName
	 * @param password
	 * @param mv
	 * @param session
	 * @return
	 * @return: ModelAndView
	 * @author: wqk   
	 * @date: 2019年9月8日 下午4:45:15
	 * @see
	 */
	@RequestMapping("/login")
	public ModelAndView login(String loginName, String password, ModelAndView mv, HttpSession session) {
		User user = userService.login(loginName, password);
		if(user != null) {
			session.setAttribute("user", user);
			mv.setView(new RedirectView("main"));
		}else {
			mv.addObject("msg","登陆名或者密码错误，请重新输入");
			mv.setViewName("loginForm");
		}
		return mv;
	}
	/**
	 * 
	 * <p>功能描述: 动态页面跳转方法 </p>  
	 * @param loginForm
	 * @return
	 * @return: String
	 * @author: wqk   
	 * @date: 2019年9月8日 下午4:45:02
	 * @see
	 */
	@RequestMapping("/{generalPath}")
	public String loginForm(@PathVariable String generalPath) {
		return generalPath;
	}
	
	@RequestMapping("/register")
	public String register(HttpServletRequest request,Model model) {
		String loginName = request.getParameter("loginName");//登陆名
		String password = request.getParameter("password");//密码
		String userName = request.getParameter("userName");//用户名
		String address = request.getParameter("address");//地址
		String phone = request.getParameter("phone");//电话
		User user = new User();
		user.setLoginName(loginName);
		user.setUserName(userName);
		user.setPassword(password);
		user.setPhone(phone);
		user.setAddress(address);
		if(userService.registerUser(user)) {
			model.addAttribute("msg", "注册成功");
		}else {
			model.addAttribute("msg", "注册失败");
		}
		
		return "success";
	}
	
}
