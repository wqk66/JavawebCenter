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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.hrm.domain.User;
import com.hrm.service.UserService;

/**
 * 描述：用户前端控制器
 * 
 * @author wqk
 * @since 2019年9月8日 上午1:44:21
 * @version
 * @see
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 
	 * <p>
	 * 功能描述:登陆方法
	 * </p>
	 * 
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
		if (user != null) {
			session.setAttribute("user", user);
			mv.setView(new RedirectView("selectAll"));
		} else {
			mv.addObject("msg", "登陆名或者密码错误，请重新输入");
			mv.setViewName("loginForm");
		}
		return mv;
	}

	/**
	 * 
	 * <p>功能描述: </p>  
	 * @param request
	 * @param model
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月4日 下午11:42:25
	 * @return: String
	 * @see
	 */
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(HttpServletRequest request, Model model) {
		String loginName = request.getParameter("loginName");// 登陆名
		String password = request.getParameter("password");// 密码
		String userName = request.getParameter("userName");// 用户名
		User user = new User();
		user.setLoginName(loginName);
		user.setUserName(userName);
		user.setPassword(password);
		if (userService.registerUser(user)) {
			model.addAttribute("msg", "注册成功");
		} else {
			model.addAttribute("msg", "注册失败");
		}
		return "success";
	}

	/**
	 * 
	 * <p>功能描述: 通过分页的方式查询用户</p>  
	 * @param model
	 * @param page
	 * @param size
	 * @param request
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月4日 下午11:42:34
	 * @return: String
	 * @see
	 */
	@RequestMapping("/selelctUserByPage")
	public String selectUserByPage(Model model, @RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "1") Integer size,HttpServletRequest request) {

		String num = request.getParameter("pageNum");
		if (num != null) {
			page = Integer.valueOf(num);
		}
		PageInfo<User> pageInfo = userService.selectAll(page, size);
		JSONObject jb = new JSONObject();
		jb.put("pageInfo", pageInfo);
		jb.put("code", 1);
		jb.put("msg", "成功");
		String obj = jb.toJSONString();
		model.addAttribute("data", obj);
		return "hrmQueryUserContent";
	}
	
	/**
	 * 
	 * <p>功能描述: 根据用户id删除用户</p>  
	 * @param request
	 * @author: wqk   
	 * @date: 2019年10月5日 上午12:02:27
	 * @return: void
	 * @see
	 */
	@RequestMapping("/deleteUserById")
	public void deleteUserbyId(HttpServletRequest request) {
		Integer id = Integer.valueOf(request.getParameter("userId"));
		userService.deleteUserById(id);
	}
	/**
	 * 
	 * <p>功能描述: 用户信息添加页面映射</p>  
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月5日 上午12:10:10
	 * @return: String
	 * @see
	 */
	@RequestMapping("/addUserForm")
	public String addUserForm() {
		return "hrmAddUserContent";
	}
	
}
