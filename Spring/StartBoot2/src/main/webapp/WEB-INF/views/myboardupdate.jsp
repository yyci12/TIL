<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- @getMapping 방식이므로 methode는 get 이 되어야함 -->
	<form action="update" method="get">
		<input type="hidden" name="myno" value="${dto.myno }">
		<table border="1">
			<tr>
				<th>WIRTER</th>
				<td>${dto.myname }</td>
			</tr>
			<tr>
				<th>TITLE</th>
				<td><input type="text" name="mytitle" value="${dto.mytitle }"></td>
			</tr>
			<tr>
				<th>CONTENT</th>
				<td><textarea rows="10" cols="60" name ="mycontent">${dto.mycontent }</textarea>
			</tr>
			<tr>
				<td colspan="2">
				<input type="submit" value="완료"> 
				<input type="button" value="취소" onclick="location.href='detail?myno=${dto.myno }'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>