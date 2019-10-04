<%@ page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/frameset.dtd">
<html>
<head>
<meta http-equiv=Content-Type content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<FRAMESET frameSpacing=0 rows=80,* frameBorder="no">
	<FRAME name=top src="hrmTop" frameBorder=0 noResize scrolling=no>
	<FRAMESET frameSpacing=0 frameBorder="no" cols=220,*>
		<FRAME name=menu src="hrmMenu" frameBorder=0 noResize>
		<FRAME name=dmMain src="/user/selelctUserByPage" frameBorder="0">
	</FRAMESET>
</FRAMESET>
</html>