<%@ page language="java" contentType="text/html; charset=gb2312"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>ȫѡ</title>
<script type="text/javascript" src="/javaweb/common/js/common.js"></script>
<script type="text/javascript">
	function checkAll(){
		var checkAll = document.getElementsByName("check");
		var checkA = document.getElementById("checkA");
		for(var i=0;i<checkAll.length;i++){	
			if(checkA.checked==true){		
				checkAll[i].checked = true;
			}else{
				checkAll[i].checked = false;
			}
		}
		checkToColor();
	}
	function checkToColor(){
		var checkAll = document.getElementsByName("check");
		
		for(var i=0;i<checkAll.length;i++){	
			if(checkAll[i].checked){	
				checkAll[i].style.background="yellow";
			}else{
				checkAll[i].style.background="";
			}
		}
	}
</script>
</head>
<body>
	<form name="fm">
		<input type="checkbox" name="check" />��Ӱ
		<br/>
		<input type="checkbox" name="check"  />��Ϸ
		<br/>
		<input type="checkbox" name="check" />�鼮
		<br/>
		<input type="checkbox" name="check"  />����
		<hr/>
		<button>�ύ</button>
		<input type="checkbox" id="checkA" onclick="checkAll()" />ȫѡ
	</form>
</body>
</html>