package com.java.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		System.out.println("afdsa");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// ��ȡ�ļ���
		String filename = request.getParameter("name");
		// ��ֹ��ȡname������
		// filename=new String(filename.getBytes("iso-8859-1"),"utf-8");
		// �ڿ���̨��ӡ�ļ���
		System.out.println("�ļ�����" + filename);

		// �����ļ�MIME����
		response.setContentType(getServletContext().getMimeType(filename));
		// ����Content-Disposition
		response.setHeader("Content-Disposition", "attachment;filename=" + filename);

		// ��ȡҪ���ص��ļ�����·�����ҵ��ļ����ŵ�WebRoot/downloadĿ¼��
		ServletContext context = this.getServletContext();
		String fullFileName = context.getRealPath("/upload/" + filename);

		// ������Ϊ��Ŀ�ļ��������ָ�������
		InputStream is = new FileInputStream(fullFileName);
		ServletOutputStream os = response.getOutputStream();

		/*
		 * ���û����� is.read(b)���ļ�����ʱ����-1
		 */
		int len = -1;
		byte[] b = new byte[1024];
		while ((len = is.read(b)) != -1) {
			os.write(b, 0, len);
		}
		// �ر���
		is.close();
		os.close();

		// request.getServletContext().getRequestDispatcher("").forward(request,
		// response);
	}
}
