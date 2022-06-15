<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#loginChk").hide();
	});
	
	function login() {
		let memberid = $("#memberid").val().trim();
		let memberpw = $("#memberpw").val().trim();
		console.log(memberid);
		console.log(memberpw);
		
		let loginVal = {
				"memberid" : memberid,
				"memberpw" : memberpw
		};
		
		if(memberid==null||memberid==""||memberpw==null||memberpw==""){
			alert("ID및 PW를 확인해 주세요.");
		}else{
			$.ajax({
				url:"ajaxlogin.do",
				type:"post",
				data: JSON.stringify(loginVal),
				dataType: "json",
				contentType:"application/json",
				success:function(msg){
					if(msg.check == true){
						location.href='list.do';
					}
					else{
						$("#loginChk").show();
						$("#loginChk").html("ID혹은 PW가 잘못되었습니다.");
					}
				},
				error:function(){
					alert("통신실패");
				}
			});
		}
	}
	

</script>
<body>
	<table>
		<tr>
			<th>ID</th>
			<td><input type="text" id="memberid"></td>
		</tr>
		<tr>
			<th>PW</th>
			<td><input type="password" id="memberpw"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="button" value="login" onclick="login();"></td>
		</tr>
		<tr>
			<td colspan="2" align="center" id="loginChk"></td>
		</tr>
	</table>
</body>
</html>