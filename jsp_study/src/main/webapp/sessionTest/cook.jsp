<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
<%
	request.setCharacterEncoding("UTF-8");

	String food=request.getParameter("food");
	String price=request.getParameter("price");
	String rest=request.getParameter("rest");
	
	Cookie[] cooks=request.getCookies();
	for(Cookie cook: cooks){
		if(cook.getName().equals("food")) food=cook.getValue()+"-"+food;
		if(cook.getName().equals("price")) price=cook.getValue()+"-"+price;
		if(cook.getName().equals("rest")) rest=cook.getValue()+"-"+rest;
	}

	Cookie food_cook=new Cookie("food",food);
	Cookie price_cook=new Cookie("price",price);
	Cookie rest_cook=new Cookie("rest",rest);
	
	food_cook.setMaxAge(4200);
	price_cook.setMaxAge(4200);
	rest_cook.setMaxAge(4200);
	
	response.addCookie(food_cook);
	response.addCookie(price_cook);
	response.addCookie(rest_cook);
	
	response.sendRedirect("cook_read.jsp");
	


%>

    
    
<%
 
//	Cookie ck=new Cookie("name","이순신");
//	ck.setMaxAge(3600);
                                                          

	//response.addCookie(ck);
// 	Cookie[] cooks=request.getCookies();
// 	for(Cookie c:cooks){
// 		if(c.getName().equals("name")){
// 			c.setMaxAge(0);
// 			response.addCookie(c);
// 			break;
// 		}
// 	}


%>