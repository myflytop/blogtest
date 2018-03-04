<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  
  <body>
    <form action="${pageContext.request.contextPath }/test/register.do" method="POST">
    	姓名：<input type="text" name="name"/><br>
    	年龄：<input type="text" name="age"/><br>
    	<input type="submit" value="注册"/>
    </form>
    <br>
     <form action="${pageContext.request.contextPath }/bloger/login.do" method="POST">
    	id：<input type="text" name="bloger_id"/><br>
    	pas：<input type="text" name="bloger_pas"/><br>
    	<input type="submit" value="登陆"/>
    </form>
    <br>
     <form action="${pageContext.request.contextPath }/test/session_test.do" method="POST">
    	id：<input type="text" name="name"/><br>

    	<input type="submit" value="登陆"/>
    </form>
  </body>
</html>
