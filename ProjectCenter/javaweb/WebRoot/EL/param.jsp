<%@ page language="java" contentType="text/html; charset=gb2312"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("gb2312");
	 %>
	�û�����${param.username }<br/>
	���룺${param.pass }<br/>
	������${param.name }<br/>
	�Ա�${param.sex }<br/>
	���ã�${paramValues.interest[0] }
	${paramValues.interest[1] }
</body>
</html>