<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="music" class="test.Music" />    
<jsp:setProperty name="music" property="title" value="비가오는날엔" />
<jsp:setProperty name="music" property="singer" value="헤이즈"/>
<jsp:setProperty name="music" property="year" value="2021"/>


<jsp:getProperty name="music" property="year"/>

    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>