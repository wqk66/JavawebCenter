<%@ page language="java" contentType="text/html; charset=gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>�ύ��</title>
</head>
<body>
	<form name="fm" action="getInformationDemo.jsp" method="post">
		������<input type="text" name="username" />
		<br/>
		���䣺<input type="password"  name="age"/>
		<br/>
		�Ա�<input type="radio" name="sex" value="Ů" checked="checked"/>Ů
		<input type="radio" name="sex" value="��"/>��
		<br/>
		���ã�<input type="checkbox" name="interest" value="��Ӱ"/>��Ӱ
		<input type="checkbox" name="interest" value="��Ϸ"/>��Ϸ
		<input type="checkbox" name="interest" value="�˶�"/>�˶�
		<br/>
		<input type="submit" value="�ύ"/>
		<input type="reset" value="����"/>
	</form>
</body>
</html>