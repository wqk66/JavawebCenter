<%@ page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8" />
<title>Insert title here</title>

<LINK href="/statics/css/Style.css" type=text/css rel=stylesheet>
<LINK href="/statics/css/Manage.css" type=text/css rel=stylesheet>
<SCRIPT type="text/javascript" src="/statics/js/jquery-3.3.1.min.js"></SCRIPT>
<script type="text/javascript" src="/statics/js/hrmQueryUserContent.js"></script>
<script type="text/javascript">
// 	$(function(){
// 		var formdata= new FormData($("#form1")[0]);
		
// 		$("#submitBtn").click(function(){
// 			$.ajax({
// 				url:"/document/fileupload",
// 				type:"post",
// 				data:formdata,
// 				processData: false,
// 				contentType: false,
// 				success:function(data){
// 					alert(11111);
// 				}
// 			})
// 		});
		
// 	});
	
</script>
</head>
<body>
  <FORM id=form1 name=form1  method="post" action="/document/fileupload" enctype="multipart/form-data">
	<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
  	<TBODY>
  <TR>
    <TD width=15><IMG src="/statics/images/hrmContent/new_019.jpg" border=0></TD>
    <TD width="100%" background=/statics/images/hrmContent/new_020.jpg height=20></TD>
    <TD width=15><IMG src="/statics/images/hrmContent/new_021.jpg" 
  border=0></TD></TR></TBODY></TABLE>
<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
  <TBODY>
  <TR>
    <TD width=15 background=/statics/images/hrmContent/new_022.jpg><IMG 
      src="/statics/images/hrmContent/new_022.jpg" border=0> </TD>
    <TD vAlign=top width="100%" bgColor=#ffffff>
      <TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
        <TR>
          <TD class=manageHead>当前位置：下载中心 &gt; 文档上传</TD></TR>
        <TR>
          <TD height=2></TD></TR></TABLE>
      <TABLE borderColor=#cccccc cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
        <TBODY>
        <TR>
          <TD height=25>
            <TABLE cellSpacing=0 cellPadding=2 border=0>
              <TBODY>
              		<tr>
              			<td>
              				文档标题：
              				<input type="text" id="title" name="title" />
              			</td>
              		</tr>
              		<tr><td>文档描述：</td></tr>
              		<tr>
              			<td>
              				<textarea rows="5" cols="30" id="remark" name="remark"></textarea>
              			</td>
              		</tr>
              		<tr>
              			<td>选择文件: <input type="file" name="fileName" id="fileName"/></td>
              		</tr>
              		<tr>
              			<td><input type="submit" id="submitBtn" value="提交"/></td>
              		</tr>
             </TBODY>
            </TABLE>
          </TD>
        </TR>
       </TBODY>
     </TABLE>
    </TD>
    <TD width=15 background=/statics/images/hrmContent/new_023.jpg><IMG 
      src="/statics/images/hrmContent/new_023.jpg" border=0> </TD></TR></TBODY></TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
		  <TBODY>
		 	<TR>
		    	<TD width=15><IMG src="/statics/images/hrmContent/new_024.jpg" border=0></TD>
		    	<TD align=middle width="100%" background=/statics/images/hrmContent/new_025.jpg height=15></TD>
		    	<TD width=15><IMG src="/statics/images/hrmContent/new_026.jpg" border=0></TD>
		    </TR>
		   </TBODY>
		</TABLE>
	</FORM>
</body>
</html>