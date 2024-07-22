<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error500.jsp" buffer="1kb"
    autoFlush="false"%>
    
<%@ page import="java.util.Date" %>    
    
<% 
	String name="이순신";
	out.println(name);

%>    
    
    
<%@ include file="menu.jsp" %>
<%
	out.println("테스트");

%>

<%--
	JSP 주석- 사용자 브라우저에서는 확인되지않는다.
			 서버 컴퓨터에서만 동작하는 부분이기때문에 사용자에게 노출되지않는다.
	웹흐름
	서버컴퓨터란-서비스를 제공하는 컴퓨터이다.
	클라이언트가 주소에 의한 요청을 하면 서버컴퓨터는 요청에대한 응답을한다.
	페이지를 보기 위해 해당페이지에 대한 주소를 요청하면
	서버는 해당페이지를 찾아서 페이지 내부의 서버언어(java)를 실행시키고
	클라이언트언어(HTML,CSS,JS) 부분을 클라이언트에게 전송한다.
	클라이언트는 서버로 부터 받은 내용을 브라우저가 실행 하여 화면에 출력한다.
	
	<%@- JSP지시어 스크립트 작성 부분
		지시어는 해당 JSP페이지 설정을 하기 위한 부분이다.
		page-jsp페이지의 속성을 지정하는 역할
			 language:페이지 사용할 언어셋 설정
			 contentype:페이지의 문서타입지정
			 pageEncoding:현재 페이지의 인코딩 타입 지정
			 
	
	


 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>