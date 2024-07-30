<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList"%>
    

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<a href="/main.jsp">로그인 및 회원가입</a><br>
<a href="/board.jsp">게시판</a><br>
<a href="/inquiry">문의</a><br>




<%-- 
<jsp:forward page=""/>
<%
	pageContext.forward("경로");
%>
--%>
<c:set var="num" value="10"/>

${num +20}
<c:set var="num" value="300" scope="session"/> 
${sessionScope.num }

<c:if test="${ 30>20}" >
	30>20 참이다
</c:if>

<c:choose>
	<c:when test="${num>5 }" >
		<h1>5보다 크다</h1>
	</c:when>
	<c:when test="${100>10 }" >
		10보다 크다
	</c:when>
	
	<c:otherwise>
		나는 위에 모든 when이 거짓일경우에 실행된다.
	</c:otherwise>
	
</c:choose>

<c:forEach begin="1" end="10" step="1">
	내가 반복된다.
</c:forEach>

<%
	ArrayList<String> list= new ArrayList<>();
	list.add("강감찬"); list.add("이순신"); list.add("장보고");
	
	request.setAttribute("list",list);
%>


<c:forEach var="name" items="${list }">
	${name }
</c:forEach>

<c:forTokens items="${'포도@딸기@수박@참외@토마토' }" var="fruit" delims="@">
	${fruit }

</c:forTokens>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>