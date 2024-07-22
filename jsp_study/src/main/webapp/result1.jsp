<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name=request.getParameter("name");
	int kor=Integer.parseInt(request.getParameter("kor"));
	int mat=Integer.parseInt(request.getParameter("mat"));
	int sci=Integer.parseInt(request.getParameter("sci"));
	
	int total=kor+mat+sci;
	int avg=total/3;
	
	String print="이름:"+name;
	
	if(avg>=90)
		print+=" 참 잘했어요";
	else if(avg>=80)
		print+=" 참 잘했어요";
	else if(avg>=70)
		print+=" 노력하세요";
	else 
		print+=" 이게 점수야!";
	

%>

<%=print%>

