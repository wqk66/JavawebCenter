<%@ page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<script type="text/javascript" src="/statics/js/jquery-3.3.1.min.js" ></script>
<STYLE type=text/css>BODY {
	FONT-SIZE: 12px; COLOR: #ffffff; FONT-FAMILY: 宋体
}
TD {
	FONT-SIZE: 12px; COLOR: #ffffff; FONT-FAMILY: 宋体
}
</STYLE>
<SCRIPT src="/statics/images/WebResource.axd" type=text/javascript></SCRIPT>
<SCRIPT src="/statics/images/WebResource_2.axd" type=text/javascript></SCRIPT>
<SCRIPT src="/statics/images/ScriptResource.axd" type=text/javascript></SCRIPT>
<SCRIPT src="/statics/images/ScriptResource_2.axd" type=text/javascript></SCRIPT>
<SCRIPT type="text/javascript"> 
// var speed=20;
// var temp=new Array(); 
// var clipright=document.body.clientWidth/2,clipleft=0 
// for (i=1;i<=2;i++){ 
// 	temp[i]=eval("document.all.div"+i+".style");
// 	temp[i].width=document.body.clientWidth/2;
// 	temp[i].height=document.body.clientHeight;
// 	temp[i].left=(i-1)*parseInt(temp[i].width);
// } 
// function openit(){ 
// 	clipright-=speed;
// 	temp[1].clip="rect(0 "+clipright+" auto 0)";
// 	clipleft+=speed;
// 	temp[2].clip="rect(0 auto auto "+clipleft+")";
// 	if (clipright<=0)
// 		clearInterval(tim);
// } 
// tim=setInterval("openit()",100);
	
// 	$(function(){
// 		$("#loginBtn121").click(function(){
// 			alert(111);
// 			$.ajax(function(){
// 				type:"post",
// 				url:"loginHrm",
// 				dataType:"json",
// 				success:function(data){
// 					alert(data);
// 				}
// 			});
// 		});
// 	});
	
</SCRIPT>
</head>
<body>
<DIV id=div1 
style="LEFT: 0px; POSITION: absolute; TOP: 0px; BACKGROUND-COLOR: #0066ff"></DIV>
<DIV id=div2 
style="LEFT: 0px; POSITION: absolute; TOP: 0px; BACKGROUND-COLOR: #0066ff"></DIV>
<FORM id=form1 name=form1 action="/loginHrm"  method="post">
<TABLE cellSpacing=0 cellPadding=0 width=900 align=center border=0>
  <TBODY>
  <TR>
    <TD style="HEIGHT: 105px"><IMG src="/statics/images/login_1.gif" 
  border=0></TD></TR>
  <TR>
    <TD background=/statics/images/login_2.jpg height=300>
      <TABLE height=300 cellPadding=0 width=900 border=0>
        <TBODY>
        <TR>
          <TD colSpan=2 height=35></TD></TR>
        <TR>
          <TD width=360></TD>
          <TD>
            <TABLE cellSpacing=0 cellPadding=2 border=0>
            <tr style="color:red">
                 <TD style="HEIGHT: 15px;width: 60px" colspan="2"><div id=RequiredFieldValidator1 
                 	style="FONT-WEIGHT: bold;  COLOR: red"><%=request.getParameter("msg")==null?"":request.getParameter("msg") %></div>
                 </TD>
              </tr>
              <TBODY>
              <TR>
                <TD style="HEIGHT: 35px" width=80>登 录 名：</TD>
                <TD style="HEIGHT: 35px" width=150><INPUT id="loginName" 
                  style="WIDTH: 130px;height: 25" name="loginName"></TD>
                <TD style="HEIGHT: 35px" width=370><SPAN 
                  id=RequiredFieldValidator3 
                  style="FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white">请输入登录名</SPAN></TD></TR>
                  	
              <TR>
              	
                <TD style="HEIGHT: 35px">登录密码：</TD>
                <TD style="HEIGHT: 35px"><INPUT id=password style="WIDTH: 130px;height: 25" 
                  type=password name=password></TD>
                <TD style="HEIGHT: 35px"><SPAN id=RequiredFieldValidator2 
                  style="FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white">请输入密码</SPAN></TD></TR>
              <TR>
                <TD style="HEIGHT: 35px">验 证 码：</TD>
                <TD style="HEIGHT: 35px;"><INPUT id=testCode 
                  style="WIDTH: 130px;height: 25" name=checkCode></TD>
                <TD style="HEIGHT: px;width: 10px;cursor: hand;">
                	<img id="generateCode" src="/code/generateCode" onclick="this.src='/code/generateCode'">
               	</TD>
               	</TR>
               	<tr><td></td></tr>
              <TR>
                <TD colspan="3"><INPUT id=loginBtn 
                  style="BORDER-TOP-WIDTH: 0px; BORDER-LEFT-WIDTH: 0px; BORDER-BOTTOM-WIDTH: 0px; BORDER-RIGHT-WIDTH: 0px;margin-left: 70px" 
                  type=image src="/statics/images/login_button.gif"  name=loginBtn> 
              </TD></TR></TBODY></TABLE></TD></TR></TBODY></TABLE></TD></TR>
  <TR><TD><IMG src="/statics/images/login_3.jpg" 
border=0></TD></TR></TBODY></TABLE>
</FORM>

</body>
</html>