<%@ page language="java" contentType="text/html; charset=gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<form name="fm" action="param.jsp" method="post">
		�û�����<input type="text" name="username"/>
		<br/>
		���룺<input type="password" name="pass"/>
		<br/>
		������<input type="text" name="name"/>
		<br/>
		�Ա�<input type="radio" name="sex" value="��" checked="checked"/>��
		<input type="radio" name="sex" value="Ů"/>Ů
		<br/>
		���ã�
		<input type="checkbox" name="interest" value="��Ӱ"/>��Ӱ
		<input type="checkbox" name="interest" value="��Ϸ" />��Ϸ
		<input type="checkbox" name="interest" value="�˶�" />�˶�
		<br/>
		<input type="submit" value="�ύ"/>
		<input type="reset" value="����"/>		
	</form>
</body>
</html>