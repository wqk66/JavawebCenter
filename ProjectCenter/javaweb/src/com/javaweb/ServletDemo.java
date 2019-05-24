package com.javaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet {

	
	public ServletDemo() {
		super();
	}

	
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		//���ñ����ʽ
		request.setCharacterEncoding("gb2312");
		//���username����
		String username = request.getParameter("username");
		//���password ����
		String password = request.getParameter("password");
		out.println("<html>");
		out.println("<body>");
		out.println("�û�����"+username+"<br>");
		out.println("���룺"+password+"<br>");
		out.println("</body>");
		out.println("</html>");
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void init() throws ServletException {
	}

}
