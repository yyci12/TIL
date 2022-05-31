<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
<script type="text/javascript">
	function idChk() {
		let doc = document.getElementsByName("myid")[0];
		
		if(doc.value.trim()=="" || doc.value==null){
			alert("아이디를 입력해 주세요.");
		}else{
			let target = "logincontroller.jsp?command=idchk&id="+doc.value.trim();
			window.open(target,"","width=300,height=200");
		}
	}
	function idChkConfirm() {
		let chk = document.getElementsByName("myid")[0].title;
		
		if(chk =="n"){
			alert('아이디 중복체크를 해주세요');
			document.getElementsByName("myid")[0].focus();
		}
	}
</script>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="logincontroller.jsp" method="post">
		<input type="hidden" name="command" value="insertuser">
		<table border="1">
			<tr>
				<th>I D</th>
				<td>
					<input type="text" name="myid" title="n" required="required">
					<input type="button" value="중복체크" onclick="idChk()" >
				</td>
			</tr>
			<tr>
				<th>P W</th>
				<td><input type="text" name="mypw" required="required" onclick="idChkConfirm();"></td>
			</tr>
			<tr>
				<th>NAME</th>
				<td><input type="text" name="myname" required="required" onclick="idChkConfirm();"></td>
			</tr>
			<tr>
				<th>ADDR</th>
				<td><input type="text" name="myaddr" required="required" onclick="idChkConfirm();"></td>
			</tr>
			<tr>
				<th>PHONE</th>
				<td><input type="text" name="myphone" required="required" onclick="idChkConfirm();"></td>
			</tr>
			<tr>
				<th>EMAIL</th>
				<td><input type="text" name="myemail" required="required" onclick="idChkConfirm();"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="가입">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>