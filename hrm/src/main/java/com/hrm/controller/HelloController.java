/**  
 * hrmsys
 * com.hrm.controller 
 */
package com.hrm.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 描述：
 * @author tsingsoft
 * @since 2019年9月8日 上午12:43:28
 * @version   
 * @see 
 */
@Controller
public class HelloController {

	Log log = LogFactory.getLog(HelloController.class);
	@RequestMapping("/hello")
	public ModelAndView hello() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "44443333");
		mv.setViewName("success.jsp");
		return mv;
	}
	
	
	@RequestMapping("/hello2")
	public String hello2() {
		System.out.println("hello,1111111");
		return "success";
	}
	
}
