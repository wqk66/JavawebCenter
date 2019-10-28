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
<script type="text/javascript">
	$(function(){
		var obj = ${data};
		var data = JSON.stringify(obj); //接收后台发送的json
		if(obj.code == 1){
			for ( var i = 0; i < obj.pageInfo.list.length; i++) {
				$("#tbody").append('<tr style=\'FONT-WEIGHT: normal; FONT-STYLE: normal; BACKGROUND-COLOR: red; TEXT-DECORATION: none\'>')
				.append('<td><input type=checkbox value='+obj.pageInfo.list[i].id+'/></td>')
				.append('<td style="text-align: center;">'+obj.pageInfo.list[i].title+'</td>')
				.append('<td style="text-align: center;">'+convertDate(obj.pageInfo.list[i].createDate)+'</td>')
				.append('<td style="text-align: center;">'+obj.pageInfo.list[i].userName+'</td>')
				.append('<td style="text-align: center;">'+obj.pageInfo.list[i].remark+'</td>')
				.append('<td style="text-align: center;"><A href="#">修改</A></td>')
				.append('<td style="text-align: center;"><INPUT class=button id="downloadBtn" type=button value="下载"  name="downloadBtn" onClick=fileDownload("'+obj.pageInfo.list[i].fileName+'")></td>')
				.append('</tr>')
			}
		}
		$("#pageLink").empty();
		$("#pageLink").append("[<B>"+obj.pageInfo.total+"</B>]条记录 共["+obj.pageInfo.pages+"]页  当前是["+obj.pageInfo.startRow+"-"+obj.pageInfo.endRow+"]条 ");
		
		//处理是否是第一页数据，如果是，则“前一页”按钮不可操作
		if(obj.pageInfo.isFirstPage == true){
			$("#pageLink").append("[首页] ");
			$("#pageLink").append("[前一页] ");
		}else{
			$("#pageLink").append("[<A href=\"/user/selelctUserByPage?pageNum=1\" >首页</A>] ");
			$("#pageLink").append("[<A href=\"/user/selelctUserByPage?pageNum="+obj.pageInfo.prePage+"\" >前一页</A>] ");
		}
		
		//处理导航页
		var navigatepageNums = obj.pageInfo.navigatepageNums;
		for(var i=0;i<navigatepageNums.length;i++){
			if(navigatepageNums[i] == obj.pageInfo.pageNum){
				$("#pageLink").append(+navigatepageNums[i]+" ");
			}else{
				$("#pageLink").append("<A class=\"\" href=\"/user/selelctUserByPage?pageNum="+navigatepageNums[i]+"\">"+navigatepageNums[i]+"</A> ");
			}
		}
		
		//处理是否是最后一页数据，如果是，则“后一页”按钮不可操作
		if(obj.pageInfo.isLastPage == true){
			$("#pageLink").append("[后一页] ");
			$("#pageLink").append("[末页] ");
		}else{
			$("#pageLink").append("[<A href=\"/user/selelctUserByPage?pageNum="+obj.pageInfo.nextPage+"\">后一页</A>] ");
			$("#pageLink").append("[<A href=\"/user/selelctUserByPage?pageNum="+obj.pageInfo.pages+"\">末页</A>] ");
		}
		
	});
	
	//将毫秒数据转换成yyyy-MM-dd
	function convertDate(millSeconds){
		var date = new Date(millSeconds);
		var year = date.getFullYear();
		var month = date.getMonth()+1;
		var day = date.getDate()+1;
		return (year+"-"+month+"-"+day);
	}
	
	//下载文件函数
	function fileDownload(id,fileName){
		$.post("/document/fileDownload",{"fileName":fileName},function(data){
			alert(JSON.stringify(data));
		},"json");
	}
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
          <TD class=manageHead>当前位置：用户管理 &gt; 查询用户</TD></TR>
        <TR>
          <TD height=2></TD></TR></TABLE>
      <TABLE borderColor=#cccccc cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
        <TBODY>
        <TR>
          <TD height=25>
            <TABLE cellSpacing=0 cellPadding=2 border=0>
              <TBODY>
              <TR>
                <td>标题：</td>
                <TD>
                	<input class=textbox id="userName" type="text" name="userName" style="width: 80px"/> 
                </TD>
                <TD>
                	<input class=button id="searchBtn" type=submit value="搜索" name="searchBtn">
                </TD>
                <TD>
                	<input class=button id="delBtn" type=submit value="删除" name="delBtn">
                </TD>
              </TR>
             </TBODY>
            </TABLE>
          </TD>
        </TR>
        <TR>
          <TD>
            <TABLE id=grid 
            style="BORDER-TOP-WIDTH: 0px; FONT-WEIGHT: normal; BORDER-LEFT-WIDTH: 0px; BORDER-LEFT-COLOR: #cccccc; BORDER-BOTTOM-WIDTH: 0px; BORDER-BOTTOM-COLOR: #cccccc; WIDTH: 100%; BORDER-TOP-COLOR: #cccccc; FONT-STYLE: normal; BACKGROUND-COLOR: #cccccc; BORDER-RIGHT-WIDTH: 0px; TEXT-DECORATION: none; BORDER-RIGHT-COLOR: #cccccc" 
            cellSpacing=1 cellPadding=2 rules=all border=0>
              <TBODY id="tbody">
              <TR style="FONT-WEIGHT: bold; FONT-STYLE: normal; BACKGROUND-COLOR: #eeeeee; TEXT-DECORATION: none">
              	<td><input type="checkbox" id="allSelect" /></td>
                <TD style="text-align: center;">标 题</TD>
                <TD style="text-align: center;">创建时间</TD>
                <TD style="text-align: center;">创建人</TD>
                <TD style="text-align: center;">描述</TD>
                <TD style="text-align: center;">操作</TD>
                <TD style="text-align: center;">下载</TD>
               </TR>
              </TBODY>
             </TABLE>
            </TD>
           </TR>
        <TR>
          <TD>
            <DIV id="pageLink" style="LINE-HEIGHT: 20px; HEIGHT: 20px; TEXT-ALIGN: right">
            </DIV>
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