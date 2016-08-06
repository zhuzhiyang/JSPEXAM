<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="/AddFilm" method="post">
电影标题：<input type="text" name="title" value="${film.title}"></br>
电影描述：<input type="text" name="description"value="${film.description}"></br>
电影语种:<input type="text" name="language" value="${name}"></br>
<input type="submit" name="提交">
</form>
</body>
</html>