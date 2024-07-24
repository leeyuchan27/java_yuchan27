<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="cook.jsp">
		<input type="text" name="food" placeholder="점심메뉴"><br>
		<input type="text" name="price" placeholder="가격"><br>
		<input type="text" name="rest" placeholder="식당명"><br>
		<button>등록</button>
	</form>
	
	<hr>
	
	<h3>점심메뉴 선택</h3>
	<ol>
	<%
		Cookie[] cooks=request.getCookies();
		String food="", price="",rest="";
		for(Cookie cook:cooks){
			if(cook.getName().equals("food")) food=cook.getValue();
			if(cook.getName().equals("price")) price=cook.getValue();
			if(cook.getName().endsWith("rest")) rest=cook.getValue();
		}	
		
		for(int i=0;i<0; i++){
	%>
		<li> <b> </b>  <button class="selBt">선택</button></li>
	<%
	    }
	%>
	</ol>
</body>
</html>