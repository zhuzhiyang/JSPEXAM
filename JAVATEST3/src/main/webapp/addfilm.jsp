<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
        <%@ page import="java.util.*"  %>
    <%@ page import="com.hand.Entity.*"  %>
     <%@ page import="com.hand.Service.*"  %>
      <%@ page import="com.hand.ServiceImpl.*"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/AddFilm" method="post">
<input type="text" name="title" ></br>
<input type="text" name="description"></br>

<select name="languageid">
<% 

LanguageService ls=new LanguageServiceImpl();
List<Language> languages=ls.getLanguages();
for(int i=0;i<languages.size();i++)
{
	Language l=languages.get(i);
%>
<option value="<%=l.getLanguageid() %>"><%=l.getName()%></option>
<% 
}
%>
</select>
<input type="submit" name="提交">
</form>
</body>
</html>