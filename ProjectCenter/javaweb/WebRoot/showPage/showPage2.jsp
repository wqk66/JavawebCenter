<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>��ҳ</title>
<%
	int recordCount;//�ܼ�¼��
	int pageCount;//��ҳ��
	int showPage;//ҳ��
	int pageSize=5;//ÿҳ��ʾ�ļ�¼��
	int remainCount;
	ArrayList<String> arr = new ArrayList<String>();
	arr.add("1");
	arr.add("2");
	arr.add("3");
	arr.add("4");
	arr.add("5");
	arr.add("6");
	arr.add("7");
	arr.add("8");
	arr.add("9");
	arr.add("10");
	arr.add("11");
	recordCount = arr.size();//ȡ�ܼ�¼��
	pageCount = (recordCount%pageSize==0)?(recordCount/pageSize):(recordCount/pageSize+1);//ȡ��ҳ��
	String integer = request.getParameter("showPage");//ȡҳ��
	//ҳ��Ϊ�ջ�Ϊ0ʱȡ��ҳ
	if(integer == null ||integer.length()==0 ||"0".equals(integer)){
		integer="1";
	}
	try{
		showPage = Integer.parseInt(integer);
	}catch(Exception e){
		showPage = 1;
	}
	//��ҳ�������ҳ����ҳ��ȡ��ҳ��
	if(showPage>pageCount){
		showPage = pageCount;
	}
	remainCount = recordCount%5;//���Ϊ����ҳ�����һҳ��ʾ�ļ�¼��
 %>
</head>
<body>
	<%
		if(showPage<pageCount){
			for(int i=0;i<pageSize;i++){
	 %>
	 		<table>
	 			<tr>
	 				<td><%=arr.get(i+5*(showPage-1))%></td>
	 			</tr>
	 		</table>
	 <%
		}}else{ 
			for(int k=0;k<remainCount;k++){
	 %>
	 		<table>
	 			<tr>
	 				<td><%=arr.get(k+5*(showPage-1))%></td>
	 			</tr>
	 		</table>
	 <%
	 	}}
	  %>
	  <span>
	  	<a href="showPage2.jsp?showPage=1">��ҳ</a>
	  	<a href="showPage2.jsp?showPage=<%=showPage-1 %>">��һҳ</a>
	  </span>
	  <span>
	  	<%
	  		for(int m=0;m<pageCount;m++){
	  		System.out.println("m+1:"+(m+1));
	  	 %>
	  	 	<a href="showPage2.jsp?showPage=<%=(m+1)%>"><%=(m+1) %></a>
	  	 <%
	  	 	}
	  	  %>
	  </span>
	  <span>
	  	<a href="showPage2.jsp?showPage=<%=(showPage+1) %>">��һҳ</a>
	  	<a href="showPage2.jsp?showPage=<%=pageCount %>">ĩҳ</a>
	  </span>
	  <form name="fm" action="showPage2.jsp" method="post">
	  	��ת����<input type="text" name="showPage" size="2"/>ҳ
	  	<input type="submit" name="butName" value="��ת" />
	  </form>
	  <div>��<%=showPage %>ҳ����<%=pageCount %>ҳ��</div>
</body>
</html>