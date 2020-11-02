<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="hello?name=park">하이 서블릿 요청!!</a>
<form action="hello" method="post">
사람이름입력: <input type="text" name="name">
<button type="submit">하이 서블릿 요청!</button>
</form>
</body>
</html>