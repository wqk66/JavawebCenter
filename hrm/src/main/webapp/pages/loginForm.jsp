<%@ page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登陆页面</title>
</head>
<body>

	<form action="login">
		<font color="red">${msg }</font>
		<table>
			<tr>
				<td><label>登陆名：</label></td>
				<td><input type="text" id="loginName" name="loginName"/></td>
			</tr>
			<tr>
				<td><label>密码：</label></td>
				<td><input type="password" id="password" name="password"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="登陆"/></td>
			</tr>
		</table>
	</form>

</body>
</html>