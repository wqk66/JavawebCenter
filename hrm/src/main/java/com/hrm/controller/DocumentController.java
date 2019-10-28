/**  
 * hrm
 * com.hrm.controller 
 */
package com.hrm.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.FileNameMap;
import java.net.URLEncoder;
import java.util.Date;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.core.util.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.hrm.domain.Document;
import com.hrm.domain.User;
import com.hrm.service.DocumentService;
import com.hrm.utils.Constants;
import com.hrm.utils.JSONUtil;

/**
 * 描述：文件上传前端控制器
 * 
 * @author wqk
 * @since 2019年10月6日 上午12:34:29
 * @version
 * @see
 */
@Controller
@RequestMapping("/document")
public class DocumentController {

	@Autowired
	@Qualifier("documentService")
	private DocumentService documentService;
	
	@Value("${upload.filePath}")
	private String filePath;

	/**
	 * 
	 * <p>
	 * 功能描述: 上传页面映射
	 * </p>
	 * 
	 * @return
	 * @author: wqk
	 * @date: 2019年10月6日 上午12:41:50
	 * @return: String
	 * @see
	 */
	@RequestMapping("/fileuploadForm")
	public String fileuploadForm() {
		return "hrmFileUploadContent";
	}

	@PostMapping("/fileupload")
	public String fileupload(@RequestParam("fileName") MultipartFile file,HttpSession session,HttpServletResponse response, HttpServletRequest request) {
		if (file.isEmpty()) {
			return "hrmFileUploadContent";
		}
		User user = (User)session.getAttribute(Constants.USER_SESSION);
		Document document = new Document();
		document.setTitle(request.getParameter("title"));
		document.setRemark(request.getParameter("remark"));
		document.setCreateDate(new Date());
		if(user != null) {
			document.setUserId(user.getId());
			document.setUserName(user.getUserName());
		}
		String fileName = file.getOriginalFilename();//文件名称
		document.setFileName(fileName);
		documentService.saveDocument(document);
		String path = filePath;
		File dest = new File(path + File.separator + fileName);
		if (!dest.getParentFile().exists()) {
			dest.getParentFile().mkdir();
		}
		try {
			file.transferTo(dest);
			JSONUtil.send(response, JSONUtil.createSuccJson());
		} catch (Exception e) {
			JSONUtil.send(response, JSONUtil.createFailJson());
			e.printStackTrace();
		}
		return "hrmFileUploadContent";
	}
	
	/**
	 * 
	 * <p>功能描述:文件下载 </p>  
	 * @param response
	 * @author: wqk   
	 * @date: 2019年10月20日 上午2:09:30
	 * @return: void
	 * @throws UnsupportedEncodingException 
	 * @see
	 */
	@PostMapping("/fileDownload")
	public void fileDownload(@RequestParam("fileName")String fileName,HttpServletResponse response) throws UnsupportedEncodingException {
		
		String jsonText = null;
		
		String filePath = "G:\\test\\";
		File file = new File(filePath +File.separator+fileName);
		if(file.exists()) {
			response.setContentType("application/x-msdownload");
			response.setCharacterEncoding("utf-8");
			response.setHeader("Content-Disposition", "attachment;fileName="+fileName);
			byte[] buffer = new byte[1024];
			FileInputStream fis = null;
			BufferedInputStream bis = null;
			OutputStream os = null;
			try {
				os = response.getOutputStream();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				int i = bis.read(buffer);
				while(i != -1) {
					os.write(buffer);
					i = bis.read(buffer);
				}
				os.flush();
//				JSONUtil.createSuccJson();
			}catch (Exception e) {
//				JSONUtil.createFailJson();
				e.printStackTrace();
			}finally {
				try {
					if(os != null) {
						os.close();
					}
					if(bis != null) {
						bis.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
//				JSONUtil.send(response, jsonText);
			}
			System.out.println("----------file download---" + fileName);
		}
	}
	
	
	/**
	 * 
	 * <p>功能描述:文件下载 </p>  
	 * @param response
	 * @author: wqk   
	 * @date: 2019年10月20日 上午2:09:30
	 * @return: void
	 * @throws UnsupportedEncodingException 
	 * @see
	 */
	@PostMapping("/fileDownload2")
	public void fileDownload2(@RequestParam("fileName")String fileName,HttpServletResponse response) throws UnsupportedEncodingException {
		
		String filePath = "G:/test/";
		File file = new File(filePath + "/"+fileName);
		if(file.exists()) {
//			System.out.println("----------file download---" + fileName);
//			HttpHeaders headers = new HttpHeaders();
//	        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
//	        headers.add("Content-Disposition", "attachment; filename="+fileName);
//	        headers.add("Pragma", "no-cache");
//	        headers.add("Expires", "0");
//	        ResponseEntity
//            .ok()
//            .headers(headers)
//            .contentLength(file.length())
//            .contentType(MediaType.parseMediaType("application/octet-stream"))
//            .body(new FileSystemResource(file));
//	        JSONUtil.send(response, JSONUtil.createSuccJson());
		}
		JSONUtil.createFailJson();
	}
	
	

	/**
	 * 
	 * <p>
	 * 功能描述:
	 * </p>
	 * 
	 * @return
	 * @author: wqk
	 * @date: 2019年10月6日 上午1:13:59
	 * @return: String
	 * @see
	 */
	@RequestMapping("/showDocument")
	public String showDocumentContent(Model model, @RequestParam(defaultValue = "1") Integer page,
			@RequestParam(defaultValue = "10") Integer size, HttpServletRequest request) {
		String num = request.getParameter("pageNum");
		if (num != null) {
			page = Integer.valueOf(num);
		}
		PageInfo<Document> pageInfo = documentService.selectAll(page, size);
		JSONObject jb = new JSONObject();
		jb.put("pageInfo", pageInfo);
		jb.put("code", 1);
		jb.put("msg", "成功");
		String obj = jb.toJSONString();
		model.addAttribute("data", obj);
		return "showDocument";
	}
}
