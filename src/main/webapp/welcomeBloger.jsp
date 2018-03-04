<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <meta charset="UTF-8">
    <title>My JSP 'index.jsp' starting page</title>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.1.1.min.js"></script>  
  </head>
  
  <body>
  ${bloger}
  <br>
  ${sessionScope.bloger}
   	welcomeBloger page
   	
   	
   	<input id="uy"  value="${pageContext.request.contextPath }/bloger/addsort.do" type="hidden">
   	
   	<input type="text" name="sort_article_name" id="uiii">
   	<input type="button" value="提交" id="ok1">
   	
   	
   	
   	
   	<script type="text/javascript">
		$(function() {
			$("#ok1").click(function() {
				
				$.ajax({
					type:"post",
					data:{sort_article_name:$("input[name='sort_article_name']").val()},
					url:$("#uy").val(),
					scriptCharset: 'utf-8',
					success:function(data){
						
						alert(data)
					},
					error:function(){
						alert("系统异常，请稍后重试！");
					}//这里不要加","
				});
			});
		});
		</script >
  </body>
</html>
