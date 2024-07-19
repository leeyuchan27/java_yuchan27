<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String myId=request.getParameter("id");
	String myPw=request.getParameter("pw");

	out.println(myId);
	out.println(myPw);

	if(myId.equals("lee11")&&myPw.equals("12345")){
%>
	<script>
		alert("로그인 성공");
		location.href="login.jsp";
	</script>

<% 		
		
	}


%>
    