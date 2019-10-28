<%@ page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>

<LINK href="/statics/css/Style.css" type=text/css rel=stylesheet>
<LINK href="/statics/css/Manage.css" type=text/css rel=stylesheet>
<SCRIPT type="text/javascript" src="/statics/js/jquery-3.3.1.min.js"></SCRIPT>
<script type="text/javascript" src="/statics/js/hrmQueryUserContent.js"></script>
<script type="text/javascript">
	$(function(){
		$("#addBtn").click(function(){
			var userName = $("#userName").val();
			var loginName = $("#loginName").val();
			var password = $("#password").val();
			var status = $("#status").val();
			$.ajax({
				type:"post",
				url:"/user/addUser",
				data:{"userName":userName,"loginName":loginName,"password":loginName,"status":status},
				dataType:"json",
				success:function(data){
					if(data.code == 1){
						alert("用户添加成功！");
					}else{
						alert("用户添加失败！");
					}
				},
				error:function(XMLHttpRequest, textStatus, errorThrown){
					alert("服务器请求失败，请联系管理员："+errorThrown);
				}
			});
		});
	});
</script>
</head>
<body>
  <FORM id=form1 name=form1 method="post" action="#">
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
          <TD class=manageHead>当前位置：用户管理 &gt; 添加用户</TD></TR>
        <TR>
          <TD height=2></TD></TR></TABLE>
      <TABLE borderColor=#cccccc cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
        <TBODY>
        <TR>
          <TD height=25>
            <TABLE cellSpacing=0 cellPadding=2 border=0>
              <TBODY>
              <TR>
                <td>用户名</td>
                <td>
                	<input class=textbox id="userName" type="text" name="userName" style="width: 80px"/> 
                </td>
                <td>
                	状  态：
                </td>
                <TD>
                	<INPUT class=textbox id="status" style="WIDTH: 80px" name="status" style="width: 80px"/>
                </TD>
                </tr>
                <tr>
                <td>登录名：</td>
                <TD>
                	<INPUT class=textbox id="loginName" style="WIDTH: 80px" name="loginName"/>
                </TD>
                <td>密  码：</td>
                <TD>
                	<INPUT class=textbox type="password" id="password" style="WIDTH: 80px" name="password"/>
                </TD>
                </tr>
                <tr>
                <TD>
                	<INPUT class=button id=addBtn type="button" value="添加" name=addBtn>
                </TD>
                <TD>
                	<INPUT class=button id=cancelBtn type="reset" value="取消" name=cancelBtn>
                </TD>
              </TR>
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