<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>WIRTER</th>
			<td>${dto.myname }</td>
		</tr>
		<tr>
			<th>TITLE</th>
			<td>${dto.mytitle }</td>
		</tr>
		<tr>
			<th>CONTENT</th>
			<td><textarea rows="10" cols="60" readonly="readonly">${dto.mycontent }</textarea>
		</tr>
		<tr>
			<td>
			<input type="button" value="목록" onclick="location.href='./list'">
			<input type="button" value="수정" onclick="location.href='./update'">
			<input type="button" value="삭제" onclick="location.href='/delete'">
			</td>
		</tr>
	</table>
</body>
</html>