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
<%
	//page :jsp 페이지 내에서만 객체를 공유하는 영역
	//request : 요청을 받아서 응답하기 까지 객체가 유효한 영역
	//session : 하나의 브라우저당 1개의 session 객체가 옹유
	//application :  하나의 app 당 1개의 application 객체가 공유.
	
	pageContext.setAttribute("pageId", "myPageIdVal");
	request.setAttribute("reqId", "myReqIdVal");
	session.setAttribute("sessionId", "mySessionVal");
	application.setAttribute("appId", "myAppIdVal");
	
%>

<h1>index</h1>

pageId : <%=pageContext.getAttribute("pageId") %> <br>
request : <%=request.getAttribute("reqId") %> <br>
session : <%=session.getAttribute("sessionId") %> <br>
application : <%= application.getAttribute("appId") %> <br>
<a href="result.jsp">이동(rresult.jsp)</a>
<a href="myservlet.do">이동(controller)</a>
</body>
</html>