<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
//세션-웹서버에서 생성 하고 서버에 저장하고 복사하여 클라이언트에게도 전달
//   -클라이언트와 서버의 연결 유지를 위하여 사용된다.
//   - tomcat 에서 클라이언트가 최초 요청할때 session객체를 생성한다.

// 세션 값 생성

	session.setAttribute("testUser","12389");

	Enumeration attr=session.getAttributeNames();




%>