/**  
 * hrm
 * com.hrm.controller 
 */
package com.hrm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.hrm.domain.User;
import com.hrm.service.UserService;
import com.hrm.utils.Constants;
import com.hrm.utils.MD5;

/**
 * 描述：登陆功能前端控制器
 * 
 * @author wqk
 * @since 2019年9月28日 下午12:54:40
 * @version
 * @see
 */
@Controller
public class LoginController {

	@Autowired
	@Qualifier("userService")
	private UserService userService;

	/**
	 * 
	 * <p>
	 * 功能描述: 动态页面跳转方法
	 * </p>
	 * 
	 * @param commonPath
	 * @author: wqk
	 * @date: 2019年9月28日 下午1:00:50
	 * @return: String
	 * @see
	 */
	@RequestMapping("/{commonPath}")
	public String loginForm(@PathVariable String commonPath) {
		return commonPath;
	}

	/**
	 * 
	 * <p>
	 * 功能描述: 管理系统首页
	 * </p>
	 * 
	 * @return
	 * @author: wqk
	 * @date: 2019年9月28日 下午4:28:33
	 * @return: String
	 * @see
	 */
	@RequestMapping("/index")
	public String loginMain() {
		return "index";
	}
	
	/**
	 * 
	 * <p>功能描述: 管理系统首页</p>  
	 * @return
	 * @author: wqk   
	 * @date: 2019年9月29日 下午3:14:48
	 * @return: String
	 * @see
	 */
	@RequestMapping("/")
	public String login() {
		return "loginForm";
	}

	/**
	 * 
	 * <p>
	 * 功能描述: 系统登陆请求
	 * </p>
	 * 
	 * @param mv
	 * @param loginName
	 * @param password
	 * @param testCode
	 * @author: wqk
	 * @date: 2019年9月28日 下午5:19:36
	 * @return: ModelAndView
	 * @throws Exception 
	 * @see
	 */
	@RequestMapping(value = "/loginHrm",method = RequestMethod.POST)
	public ModelAndView login(ModelAndView mv, HttpSession session,String loginName, String password,
			String checkCode) throws Exception {
		User user = userService.login(loginName, MD5.finalMD5(password));
		if (user != null) {
			Object oCode = session.getAttribute(Constants.KAPTCHA_SESSION_KEY);//系统验证码
			if(checkCode != null && String.valueOf(oCode).equals(checkCode)) {
				session.setAttribute(Constants.USER_SESSION, user);//登陆成功，将用户信息保存到session中
				mv.setView(new RedirectView("/index"));
			}else {
				mv.addObject("msg", "验证码错误，请重新输入");
				mv.setViewName("redirect:/loginForm");
			}
		} else {
			mv.addObject("msg", "登陆名或者密码错误，请重新输入");
			mv.setViewName("redirect:/loginForm");
		}
		return mv;
	}
	
	/**
	 * 
	 * <p>功能描述: 退出功能请求映射</p>  
	 * @param session
	 * @param mv
	 * @return
	 * @author: wqk   
	 * @date: 2019年9月30日 下午3:04:20
	 * @return: ModelAndView
	 * @see
	 */
	@RequestMapping("/logout")
	public ModelAndView logout(HttpSession session,ModelAndView mv) {
		session.removeAttribute(Constants.USER_SESSION);
		session.invalidate();
		mv.setViewName("forward:/loginForm");
		return mv;
	}
}
