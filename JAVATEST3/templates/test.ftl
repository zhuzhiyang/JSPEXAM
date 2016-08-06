<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="/ChangeFilm" method="post">
电影标题：<input type="text" name="title" value="${film.title}"></br>
电影描述：<input type="text" name="description"value="${film.description}"></br>
<input type="hidden" name="filmid" value="${film.film_id}">
电影语种: 
<select name="languageid">
<option value="0">${name}</option>
<option value="1">English</option>
<option value="2">Italian</option>
<option value="3">Japanese</option>
<option value="4">Mandarin</option>
<option value="5">French</option>
<option value="6">German</option>
</select>
<input type="submit" name="提交">
</form>
</body>
</html>