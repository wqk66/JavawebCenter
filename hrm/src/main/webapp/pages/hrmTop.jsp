<%@ page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
	<STYLE type=text/css>
		BODY {
			PADDING-RIGHT: 0px;
			PADDING-LEFT: 0px;
			PADDING-BOTTOM: 0px;
			MARGIN: 0px;
			PADDING-TOP: 0px;
			BACKGROUND-COLOR: #2a8dc8
		}
		
		BODY {
			FONT-SIZE: 12px;
			COLOR: #003366;
			FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif
		}
		
		TD {
			FONT-SIZE: 12px;
			COLOR: #003366;
			FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif
		}
		
		DIV {
			FONT-SIZE: 12px;
			COLOR: #003366;
			FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif
		}
		
		P {
			FONT-SIZE: 12px;
			COLOR: #003366;
			FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif
		}
	</STYLE>
</head>
<body>
<FORM id=form1 name=form1 method="post">
		<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
			<TBODY>
				<TR>
					<TD width=10><IMG src="/statics/images/hrmTop/new_001.jpg"
						border=0></TD>
					<TD background=/statics/images/hrmTop/new_002.jpg><FONT size=4><B>人事信息管理系统
								管理中心</B></FONT></TD>
					<TD background=/statics/images/hrmTop/new_002.jpg>
						<TABLE cellSpacing=0 cellPadding=0 width="100%" border=0>
							<TBODY>
								<TR>
									<TD align=right height=35></TD>
								</TR>
								<TR>
									<TD height=35><A href="/logout" target=_top><FONT
											color=red><B>安全退出</B></FONT></A></TD>
								</TR>
							</TBODY>
						</TABLE>
					</TD>
					<TD width=10><IMG src="/statics/images/hrmTop/new_003.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
</FORM>
</body>
</html>