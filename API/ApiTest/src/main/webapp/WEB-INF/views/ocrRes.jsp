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
		console.log(res.images[0].fields[0].inferText);
		console.log(res.images[0].fields[1].inferText);
		
		for(let i=0; i<res.images[0].fields.length;i++){
			$("div").append("<p>"+res.images[0].fields[i].inferText+"</p>");
		}
		
	});
</script>
</head>
<body>
	<div></div>
</body>
</html>