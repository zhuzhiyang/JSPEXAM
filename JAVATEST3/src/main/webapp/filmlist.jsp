<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.*"  %>
    <%@ page import="com.hand.Entity.*"  %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title></title>
</head>
<style type="text/css">
	#tb,tr,th,td{
   border: 1px solid aqua;
}

#tb{
	 border-collapse: collapse; /*去掉表格外部的线*/
	 width: 1000px;
	 height: 800px;
	 margin-left:200px;
}
#tb th{
	color:white;
	background-color: aqua;
	text-align: center;
	font-size: 20px;
	padding: 5px;
}

#tb td{
	color:black;
	text-align: center;
	font-size: 20px;
	padding: 5px;
}
#tb td a{
text-decoration: none;
} 
#tb .alt td{
	color: black;
	background-color:yellow ;
	text-align: center;
	font-size: 20px;
}
#tb .alt td a{
	text-decoration: none;
}
#tb td p
{
width: 500px;
}
	p{
margin-left:580px;
font-size:20px;


}
p a{
text-decoration: none;
}


</style>
<% 
int pagesize=10;
int pageindex=1;
String Pageindex=request.getParameter("pageindex");
if(Pageindex!=null)
{
	pageindex=Integer.parseInt(Pageindex);
	if(pageindex==0)
	{
		pageindex=1;

	}
}
%>
<body>
<p style="float:right;margin-right:150px;"><a href="addfilm.jsp">新增电影</a></p>
<table id="tb">
	<tr>
	<th>电影编号</th>
    <th>电影名</th>
    <th>电影描述</th>  
    <th>语言</th>  
    <th style="width:100px;">操作</th>
	</tr>
	<% 
    List<Film> films=(List<Film>)request.getAttribute("films");
	
	 for(int i=0;i<films.size();i++)
	 {
		 Film f=films.get(i);
		 if(i%2==0)
		 {
	%>
	<tr class="alt">
		<td><%=f.getFilm_id()%></td>
		<td><%=f.getTitle() %></td>
		<td><%=f.getDescription()%></td>
		<td><%=f.getLanguage().getName()%></td>
		<td><a href="/DeleteFilm?filmid=<%=f.getFilm_id() %>">删除</a> <a href="/UpdateFilm?filmid=<%=f.getFilm_id()%>">编辑</a></td>
	</tr>
	<%
	 }
		 else
		 {
	%>
	<tr>
	   <td><%=f.getFilm_id()%></td>
		<td><%=f.getTitle() %></td>
		<td><%=f.getDescription()%></td>
		<td><%=f.getLanguage().getName()%></td>
		<td><a href="/DeleteFilm?filmid=<%=f.getFilm_id() %>">删除</a> <a href="/UpdateFilm?filmid=<%=f.getFilm_id()%>">编辑</a></td>
	</tr>
	<% 
	}
}
	%>


<%-- 	<c:forEach var="actor"  items="${actors}" > --%>
<!-- 	<tr> -->
<%-- 		<td>${actor.actorid}</td> --%>
<%-- 		<td>${actor.firstname}</td> --%>
<%-- 		<td>${actor.lastname}</td> --%>
<%-- 		<td>${actor.lastupdate}</td> --%>
<!-- 	</tr> -->
<%-- 	</c:forEach> --%>


</table>
<p ><a href="/FilmServlet?pageindex=<%=pageindex-1%>">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=pageindex%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="/FilmServlet?pageindex=<%=pageindex+1%>">下一页</a></p>

<form action="/FilmServlet" method="post">
<p class="p2"><input type="text" name="pageindex">
<input type="submit" name="跳转" value="跳转"></p>

</form>
</body>
</html>