<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <script src="${pageContext.request.contextPath }/js/jquery-3.1.1.min.js"></script>
    <style>
    *{
        margin:0;
        padding:0;
        list-style: none;
    }

   #conent{
       width: 80%;
       margin: 0 auto;
       margin-top: 100px;
       border: 1px solid red;
   }

   


    
    </style>

</head>

<body>
   
    <h1 style="text-align:center">博文发布系统</h1>
    <p>${sessionScope.blogerlogin}</p>
    <p>添加分类</p>
    <div id="conent"> 
     <input id="url"  value="${pageContext.request.contextPath }/bloger/addsort.do" type="hidden">
   	
   	<input type="text" name="sort_article_name" >
   	<input type="button" value="提交" id="ok1">
   	
   	
   	
   	
   	<script type="text/javascript">
		$(function() {
			$("#ok1").click(function() {
				
				$.ajax({
					type:"post",
					data:{sort_article_name:$("input[name='sort_article_name']").val()},
					url:$("#url").val(),
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
        </div>
       
        
            
           
         
</body>
</html>