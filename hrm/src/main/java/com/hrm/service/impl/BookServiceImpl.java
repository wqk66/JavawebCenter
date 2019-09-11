/**  
 * hrmsys
 * com.hrm.service.impl 
 */
package com.hrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrm.domain.Book;
import com.hrm.mapper.BookMapper;
import com.hrm.service.BookService;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月8日 上午1:42:39
 * @version   
 * @see 
 */
@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public List<Book> getAll() {
		
		return bookMapper.findAll();
	}
	
}
