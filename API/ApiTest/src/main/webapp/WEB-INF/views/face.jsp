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
			console.log(res);
			
			$("div").append("<h3>"+res.info.faceCount+"명 인식</h3><br>");
		for(let i =0; i<res.faces.length;i++){
			$("div").append("<p> 예상나이 : "+res.faces[i].age.value);
			$("div").append("<p>성별:"+res.faces[i].gender.value+"</p>");
			$("div").append("<p>감정:"+res.faces[i].emotion.value+"</p><br><br>");
		}
		
	});
</script>
</head>
<body>
	<img alt="" src="/resources/img05.jpg">
	<div></div>
</body>
</html>