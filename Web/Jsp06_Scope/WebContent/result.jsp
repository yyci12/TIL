<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <% request.setCharacterEncoding("UTF-8"); %>
<%response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>result</h1>
	pageId : <%=pageContext.getAttribute("pageId") %> <br>
	request : <%=request.getAttribute("reqId") %> <br>
	session : <%=session.getAttribute("sessionId") %> <br>
	application : <%= application.getAttribute("appId") %> <br>
</body>
</html>