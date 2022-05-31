<%@page import="com.login.dto.MyMemberDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<MyMemberDto> list = (List<MyMemberDto>)request.getAttribute("list");
	%>
	<h1>회원 정보 조회</h1>
	<table border="1" style="width: 1000px; text-align: left;">
		<tr>
			<th>NO</th>
			<th>ID</th>
			<th>NAME</th>
			<th>EMAIL</th>
			<th>ROLE</th>
			<th>ROLE_UPDATE</th>
		</tr>
<%
	for(MyMemberDto dto:list){
%>
	<tr>
		<td><%=dto.getMyno() %></td>
		<td><%=dto.getMyid() %></td>
		<td><%=dto.getMyname() %></td>
		<td><%=dto.getEmail() %></td>
		<td><%=dto.getMyrole() %></td>
		<td><button onclick="">변경</button></td>
	</tr>
<%		
	}
%>
		<tr>
			<td colspan="6">
				<button onclick="location.href='logincontroller.jsp?command=login&id=<%=((MyMemberDto)session.getAttribute("dto")).getMyid()%>&pw=<%=((MyMemberDto)session.getAttribute("dto")).getMypw()%>'">메인</button>
			</td>
		</tr>
	</table>
</body>
</html>