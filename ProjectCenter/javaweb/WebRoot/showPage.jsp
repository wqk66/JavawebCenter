<%@ page language="java" contentType="text/html; charset=gb2312"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	int pageSize = 5;//ÿҳ�м�¼��
	int pageCount;//ҳ��
	int showPage;//��ǰҳ����ҳ��
	int recordCount;//�ܼ�¼��
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
	recordCount = arr.size();//������
	pageCount=(recordCount%pageSize==0)?(recordCount/pageSize):(recordCount/pageSize+1);
	String integer = request.getParameter("showPage");
	if(integer == null || integer.length()==0||"0".equals(integer)){
		integer = "1";
	}
	try{
		showPage = Integer.parseInt(integer);
	}catch(Exception e){
		showPage = 1;
	}
	if(showPage<=1){
		showPage = 1;
	}
	if(showPage>=pageCount){
		showPage = pageCount;
	}
	//���Ҫ��ʾ��showPageҳ����ô�α�Ӧ���ƶ�����position��ֵ
	int remainNum = recordCount%5;//���Ϊ����ҳ�����һҳ��ʾ�ļ�¼��
	if(showPage<pageCount){
	for(int i=0;i<pageSize;i++){
%>
	<table>
		<tr>
			<td><%=arr.get(i+(5*(showPage-1))) %></td>
		</tr>
	</table>

<%
}}else{
	for(int k=0;k<remainNum;k++){
 %>
 <table>
		<tr>
			<td><%=arr.get(k+(5*(showPage-1))) %></td>
		</tr>
	</table>
 <%}} %>
 <br/>
  <br>
 ��<%=showPage %>ҳ����<%=pageCount %>ҳ��
 <br>
 <a href="showPage.jsp?showPage=1">��ҳ</a>
 <a href="showPage.jsp?showPage=<%=showPage-1 %>">��һҳ</a>
<%
	for(int i=0;i<pageCount;i++){
 %>
 	<a href="showPage.jsp?showPage=<%=i+1%>"><%=(i+1) %></a>
 <%
 }
  %>
<a href="showPage.jsp?showPage=<%=showPage+1 %>">��һҳ</a>
<a href="showPage.jsp?showPage=<%=pageCount%>">ĩҳ</a>
<!-- ͨ�����ύ�û���Ҫ��ʾ��ҳ�� -->
<form method="post" action ="showPage.jsp?showPage=<%=showPage-1%>"/>
	��ת����<input type="text" name="showPage" size="4"/>ҳ
	<input type="submit" name="submit" value="��ת"/>
</form>