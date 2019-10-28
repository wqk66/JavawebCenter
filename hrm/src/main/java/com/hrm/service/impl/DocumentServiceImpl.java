/**  
 * hrm
 * com.hrm.service.impl 
 */
package com.hrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hrm.domain.Document;
import com.hrm.mapper.DocumentMapper;
import com.hrm.service.DocumentService;

/**
 * 描述：
 * @author wqk
 * @since 2019年10月6日 上午1:51:13
 * @version   
 * @see 
 */
@Service("documentService")
public class DocumentServiceImpl implements DocumentService {
	
	@Autowired
	DocumentMapper documentMapper;

	@Override
	public List<Document> getAll() {
		return documentMapper.selectAllDocument();
	}

	/**
	 * 文档分页查询
	 */
	@Override
	public PageInfo<Document> selectAll(Integer page, Integer size) {
		PageHelper.startPage(page, size);;
		List<Document> documentList = documentMapper.selectAllDocument();
		PageInfo<Document> pageInfo = new PageInfo<Document>(documentList);
		return pageInfo;
	}
	
	/**
	 * 
	 * <p>功能描述:保存文档信息 </p>  
	 * @param document
	 * @return
	 * @author: wqk   
	 * @date: 2019年10月6日 下午1:14:44
	 * @return: int
	 * @see
	 */
	public boolean saveDocument(Document document) {
		
		return documentMapper.saveDoucment(document) > 0;
	}

}
