<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  
  <body>
   	<!-- 转发 -->        
   	 <jsp:forward page="bloger/fblogerlogin.do"/> 
   	<%--重定向  <% 
  	response.sendRedirect(request.getContextPath()+"/test/login.do");
   	 %> --%>
 
  </body>
</html>
