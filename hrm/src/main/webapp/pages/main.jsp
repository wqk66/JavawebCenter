<%@ page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>首页</title>
	<style type="text/css">
		table{border-collapse:collapse;border-space:0;border-left: 1px solid #888;border-top: 1px solid #888;background: #efefef}
		th,td{border-right: 1px solid #888;border-bottom: 1px solid #888; padding: 5px 15px}
		th{font-weight: bold;background: #ccc}
	</style>
</head>
<body>
	<table border="1">
		<tr>
			<th>封面</th>
			<th>书名</th>
			<th>作者</th>
			<th>价格</th>
		</tr>
		<c:forEach items="#{book_list }" var="book">
			<tr>
				<td><img src="images/${book.image}" var></td>
				<td>${book.name }</td>
				<td>${book.author}</td>
				<td>${book.price}</td>
			</tr>
		</c:forEach>
		
	</table>
	
</body>
</html>