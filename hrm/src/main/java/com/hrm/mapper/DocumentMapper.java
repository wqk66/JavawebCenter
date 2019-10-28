/**  
 * hrmsys
 * com.hrm.mapper 
 */
package com.hrm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.hrm.domain.Document;
import com.hrm.utils.Constants;

/**
 * 描述：文档持久层
 * @author wqk
 * @since 2019年9月8日 上午1:22:26
 * @version   
 * @see 
 */
@Mapper
public interface DocumentMapper {

	
	/**
	 * 
	 * <p>功能描述: 通过分页查询文档信息</p>  
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月6日 下午1:03:01
	 * @return: List<Document>
	 * @see
	 */
	@Select("select id,title,filename,remark,user_id as userId,createDate,userName from "+Constants.DOCUMENTTABLE)
	List<Document> selectAllDocument();
	
	int saveDoucment(Document document);
	
}
