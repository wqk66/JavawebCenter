/**  
 * hrmsys
 * com.hrm.controller 
 */
package com.hrm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.hrm.domain.Book;
import com.hrm.service.BookService;

/**
 * 描述：
 * 
 * @author wqk
 * @since 2019年9月8日 上午1:49:14
 * @version
 * @see
 */
@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping("/main")
	public String main(Model model) {

		List<Book> book_list = bookService.getAll();
		model.addAttribute("book_list", book_list);
		return "main";

	}

	@RequestMapping("/selectAll")
	public String selectAll(@RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "2") Integer size, Model model, HttpServletRequest request,
			HttpServletResponse response) {
		String num = request.getParameter("pageNum");
		if (num != null) {
			page = Integer.valueOf(num);
		}
		PageInfo<Book> pageInfo = bookService.selectAll(page, size);
		JSONObject jb = new JSONObject();
		jb.put("pageInfo", pageInfo);
		jb.put("code", 1);
		jb.put("msg", "成功");
		String obj = jb.toJSONString();
		model.addAttribute("data", obj);
//		response.setContentType("text/html;charset=GBK");
//		response.setHeader("Cache-Control", "no-cache");
//		response.setCharacterEncoding("GBK");
//		try {
//			response.getWriter().write(jb.toString());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		return "main";
	}

}
