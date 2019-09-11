/**  
 * hrmsys
 * com.hrm.mapper 
 */
package com.hrm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.hrm.domain.Book;

/**
 * 描述：
 * @author wqk
 * @since 2019年9月8日 上午1:37:00
 * @version   
 * @see 
 */
@Mapper
public interface BookMapper {

	@Select("select * from tb_book")
	List<Book> findAll();
}
