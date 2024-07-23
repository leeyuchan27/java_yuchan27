<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String part=request.getParameter("part");
	if(part !=null){
		if(part.equals("notify")&& session.getAttribute("user")==null){
%>
			<jsp:forward page="login.jsp"/>
<% 		
		}
	}
%>   


    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="main.css">
</head>
<body>
<div id="loginBox">
	<a href="login.jsp">로그인</a>
</div>
	<h2>내가 main이야!!</h2>
	<jsp:include page="header.jsp"/>
		<jsp:param value="<%=part%>" name="select" />
	
	<div id="main">
	<%
		if(part==null){
	%>
		첫페이지 내용
	<% } else{
		part+=".jsp";
		%>	
			<jsp:include page=<%=part+".jsp" %>/>
	<% } %>		
	</div>
	
	<jsp:include page="footer.jsp"/>
	
</body>
</html>