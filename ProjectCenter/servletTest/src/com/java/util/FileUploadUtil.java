package com.java.util;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUploadUtil {

	//�ϴ��ļ�����Ŀ¼
	private static final String UPLOAD_DIRECTORY="upload";
	//�ϴ�����
	private static final int MEMORY_THRESHOLD   = 1024 * 1024 * 3;  // 3MB
	private static final int MAX_FILE_SIZE      = 1024 * 1024 * 40; // 40MB
	private static final int MAX_REQUEST_SIZE   = 1024 * 1024 * 50; // 50MB
	
	/**
	 * @param request
	 * @param respon
	 * @return
	 */
	public static boolean isFileUPload(HttpServletRequest request,HttpServletResponse response) throws Exception{ 
		//���ò���
		DiskFileItemFactory factory = new DiskFileItemFactory();
		//�ڴ��ٽ�ֵ--�����󽫲�����ʱ�ļ��洢�ڴ�����
		factory.setSizeThreshold(MEMORY_THRESHOLD);
		//������ʱĿ¼
		factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
		
		ServletFileUpload upload = new ServletFileUpload(factory);
		//��������ļ��ϴ�ֵ
		upload.setFileSizeMax(MAX_FILE_SIZE);
		//�����������ֵ
		upload.setSizeMax(MAX_REQUEST_SIZE);
		//���Ĵ���
		upload.setHeaderEncoding("UTF-8"); 
		String uploadPath = request.getServletContext().getRealPath("/WebContent/upload");
		System.out.println("uploadpath:"+uploadPath);
		//���Ŀ¼�������򴴽�
		File uploadDir = new File(uploadPath);
		if(!uploadDir.exists()){
			uploadDir.mkdir();
		}
		try {
			
			//��������������ȡ�ļ�����
			List<FileItem> formItems = upload.parseRequest(request);
			if(formItems != null && formItems.size()>0){
				
				String name = formItems.get(0).getName();
				String fieldName=  formItems.get(0).getFieldName();
				System.out.println("name:"+name);
				System.out.println("fieldName:"+fieldName);
				for(FileItem item:formItems){
					if(!item.isFormField()){
						String fileName = item.getName();
						String filePath = uploadPath+File.separator+fileName;
						File storFile = new File(filePath);
						System.out.println("filepath:"+filePath);
						item.write(storFile);
						request.setAttribute("msg", "�ϴ��ɹ�");
					}
				}
			}
		} catch (Exception e) {
			request.setAttribute("message",
                    "������Ϣ: " + e.getMessage());
		}
		return true;
	}
	 
}
