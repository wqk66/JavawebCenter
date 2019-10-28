/**  
 * hrm
 * com.hrm.service 
 */
package com.hrm.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.hrm.domain.Document;

/**
 * 描述：
 * @author wqk
 * @since 2019年10月6日 上午1:50:47
 * @version   
 * @see 
 */
public interface DocumentService {
	
	List<Document> getAll();
	PageInfo<Document> selectAll(Integer page,Integer size);
	
	/**
	 * 
	 * <p>功能描述:保存文档信息 </p>  
	 * @param document
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月6日 下午1:14:44
	 * @return: boolean
	 * @see
	 */
	boolean saveDocument(Document document);
}
