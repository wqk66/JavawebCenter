/**  
 * hrmsys
 * com.hrm.service.impl 
 */
package com.hrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

	/**
	 * @param page 当前页页码，即第几页
	 * @param size 当前页数据条数
	 */
	@Override
	public PageInfo<Book> selectAll(Integer page, Integer size) {
		PageHelper.startPage(page, size);
		List<Book> bookList = bookMapper.findAll();
		PageInfo<Book> pageInfo = new PageInfo<Book>(bookList);
		return pageInfo;
	}
	
}
