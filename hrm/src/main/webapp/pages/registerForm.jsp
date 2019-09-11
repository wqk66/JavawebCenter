<%@ page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户注册页面</title>
</head>
<body>

	<form action="register" method="post">
		<table>
			<tr><td><input type="text" name="loginName" placeholder = "登陆名" /></td></tr>
			<tr><td><input type="password" name="password" placeholder = "密码" /></td></tr>
			<tr><td><input type="text" name="userName" placeholder = "用户名" /></tr>
			<tr><td><input type="text" name="phone" placeholder = "电话" /></tr>
			<tr><td><input type="text" name="address" placeholder = "地址" /></tr>
			<tr><td><input type="submit" value="注册"/></tr>
		</table>
	</form>
</body>
</html>