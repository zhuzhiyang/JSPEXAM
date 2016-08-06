<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String result=(String)session.getAttribute("result");
if(result.equals("loginsuccess"))
{
	%>
	<p style="align:center;font-size:20px">登录成功</p>
	<a href="index.jsp">返回主界面</a>
	<% 
	}
else
{
	%>
	<p style="align:center;font-size:20px">登录失败</p>
	<a href="login.jsp">重新登录</a>
	<a href="index.jsp">返回主界面</a>
	<% 
	}
%>
</body>
</html>