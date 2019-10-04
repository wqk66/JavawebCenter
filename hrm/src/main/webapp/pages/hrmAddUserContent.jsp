<%@ page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		
	});
</script>
</head>
<body>
  <FORM id=form1 name=form1 action="" method="post">
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
                	<INPUT class=textbox id="endDate" style="WIDTH: 70px" name="endDate"/>
                </TD>
                </tr>
                <tr>
                <td>登录名：</td>
                <TD>
                	<INPUT class=textbox id="endDate" style="WIDTH: 70px" name="endDate"/>
                </TD>
                <td>密  码：</td>
                <TD>
                	<INPUT class=textbox type="password" id="endDate" style="WIDTH: 70px" name="endDate" placeholder="截止日期"/>
                </TD>
                </tr>
                <tr>
                <TD>
                	<INPUT class=button id=addBtn type=submit value="添加" name=addBtn>
                </TD>
                <TD>
                	<INPUT class=button id=cancelBtn type=submit value="取消" name=cancelBtn>
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