<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		let res = ${res};
		
		for(let i=0; i<res.faces.length;i++){
			$("div").append("닮은 유명인 <span>"+res.faces[i].celebrity.value+"</span><br>");
			$("div").append("유사도 <span>"+res.faces[i].celebrity.confidence+"</span><br>");
		}
		
	});
</script>
</head>
<body>
	<div></div>
</body>
</html>