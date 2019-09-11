/**  
 * hrmsys
 * com.hrm.controller 
 */
package com.hrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hrm.domain.Book;
import com.hrm.service.BookService;

/**
 * 描述：
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
}
