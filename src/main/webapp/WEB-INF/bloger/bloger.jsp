<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <script src="${pageContext.request.contextPath }/js/jquery-3.1.1.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/tinymce.min.js"></script>
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

   #tit  {
       width: 60%;
       margin: 0 auto;
       height: 30px;
       font-size: 25px;
       text-align: center;
       background :none;
       border: 1px dotted  rgb(92, 92, 92);
   }
  #tit:hover{
    border: 1px solid rgb(92, 92, 92);
  }

   #conent ul{
       width: 100%;
       text-align: center;
   }
   .licon{

    margin-top:50px;

   }
   #container{
       min-height: 300px;
       height: auto;
       overflow: auto;
   }
    
    </style>

</head>

<body>
   
    <h1 style="text-align:center">博文发布系统</h1>
    <p>${sessionScope.blogerlogin}</p>
    <div id="conent"> 
            <ul>
                <li><input type="text" placeholder="请在这里输入博文标题" id="tit"></li>
                <li class="licon">
                 
                    <textarea  id="container"  ></textarea>
                </li>
                <li>
                   <label for="">选择</label> <select placeholder="请选择" style="width:100px">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
                        <option value="11">11</option>
                        <option value="12">12</option>
                    </select>
                </li>
                <li><input type="button" value="发布" id="ok"></li>
               
            </ul>
     
        </div>
       
        
            
            <script>tinymce.init({
                 selector:'textarea',
                 plugins: ["imagetools","image",'lists'],
                 language:"zh_CN"});
                 $("#ok").click(function(){

                    alert(tinymce.activeEditor.getContent());
                 });
                 </script>
         <a href="${pageContext.request.contextPath }/bloger/faddsort.do">addsort.jsp</a>
</body>
</html>