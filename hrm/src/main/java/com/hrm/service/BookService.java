/**  
 * hrmsys
 * com.hrm.service 
 */
package com.hrm.service;

import java.util.List;

import com.hrm.domain.Book;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月8日 上午1:39:30
 * @version   
 * @see 
 */
public interface BookService {

	List<Book> getAll();
}
