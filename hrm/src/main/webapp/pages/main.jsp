<%@ page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>首页</title>
	
	<style type="text/css">
		table{border-collapse:collapse;border-space:0;border-left: 1px solid #888;border-top: 1px solid #888;background: #efefef}
		th,td{border-right: 1px solid #888;border-bottom: 1px solid #888; padding: 5px 15px}
		th{font-weight: bold;background: #ccc}
	</style>
	<script type="text/javascript" src="/statics/js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript">
	
		$(function(){
			initData();
		});
		
		function initData(){
			var obj = ${data};
			
			var data = JSON.stringify(obj); //接收后台发送的json
			$("#tbody").empty();
			if(obj.code == 1){
				for ( var i = 0; i < obj.pageInfo.list.length; i++) {
					$("#tbody").append('<tr>')
					.append('<td>'+obj.pageInfo.list[i].author+'</td>')
					.append('<td>'+obj.pageInfo.list[i].name+'</td>')
					.append('<td>'+obj.pageInfo.list[i].price.toFixed(2)+'</td>')
					.append('<td>'+obj.pageInfo.list[i].publication+'</td>')
					.append('<td>'+obj.pageInfo.list[i].remark+'</td>')
					.append('</tr>')
				}
				$("#tbody").append('<tr>')
				.append('<td>当前页：'+obj.pageInfo.pageNum+'</td>')
				.append('<td>条数：'+obj.pageInfo.size+'</td>')
				.append('<td>'+(obj.pageInfo.hasPreviousPage==true ? checkPrePage(true,obj.pageInfo.pageNum - 1) : checkPrePage(false,1))+'</td>')
				.append('<td>'+(obj.pageInfo.hasNextPage == true ? checkNextPage(true,obj.pageInfo.pageNum + 1) : checkNextPage(false,0))+'</td>')
				.append('</tr>');
			}
		}
	
		//处理下一页
		function checkNextPage(obj,nextPageNum){
			var content;
			if(obj == true){
				content = "<div style='cursor:hand;color:red' onclick='handleData(\""+nextPageNum+"\");'>下一页</div>";
			}else{
				content = '<div>下一页</div>';
			}
			
			return content;
		}
		//处理上一页
		function checkPrePage(obj,prePageNum){
			var content;
			if(obj == true){
				content = "<div style=\"cursor:hand;color:red\" onclick='handleData(\""+prePageNum+"\");'>上一页</div>";
			}else{
				content = '<div>上一页</div>';
			}
			
			return content;
		}
		
		function handleData(pageNums){
			$.ajax({
				type:"post",
				url:"selectAll",
				dataType : "Json",
				data:{
					"pageNum":pageNums
				},
				success : function(data) {
					alert(data);
				},
				error : /* function(XMLHttpRequest, textStatus, errorThrown) {
					alert(errorThrown);
					alert(XMLHttpRequest.readyState); */
					function(e){
						console.log(e);
					
				}
			});
		}
		
	</script>
</head>
<body id="tbody">
</body>
</html>