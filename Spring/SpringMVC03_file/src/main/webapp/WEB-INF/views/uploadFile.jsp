<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	파일명 : ${fileobj.filename }
	<br>
	설명 : ${fileobj.desc }
	<br>
	<img src="stroage/${fileobj.filename }" width="50%" height="50%">
</body>
</html>