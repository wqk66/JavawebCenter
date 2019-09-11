<%@ page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="/statics/js/jquery-1.11.1.min.js" ></script>
<meta charset="utf-8">
<title>提示界面</title>

<script type="text/javascript">
	$(document).ready(function(){
		$("#butt").click(function(){
			window.location.href="registerForm"
		});
		
	})
</script>
</head>
<body>
	
	<div>${msg }</div>
	<div><button id="butt">注册</button></div>
</body>
</html>