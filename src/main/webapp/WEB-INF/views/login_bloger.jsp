<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
 String path = request.getContextPath();
 String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="<%=path %>/js/gVerify.js"></script>
    <title>Document</title>
    <style>
        *{
margin: 0;
padding:0;
list-style: none
        }
        body{
            height: 100%;
  background: -webkit-linear-gradient(left,rgb(139, 139, 139), rgb(223, 223, 243)); /* Safari 5.1 - 6.0 */
  background: -o-linear-gradient(left,rgb(139, 139, 139), rgb(223, 223, 243)); /* Opera 11.1 - 12.0 */
  background: -moz-linear-gradient(left,rgb(139, 139, 139), rgb(223, 223, 243)); /* Firefox 3.6 - 15 */
  background: linear-gradient(left,rgb(139, 139, 139), rgb(223, 223, 243)); /* 标准的语法 */
        }
    div{
    width: 300px;
    margin: 0 auto;
    margin-top: 170px;
    height: auto;
    padding-top: 10px;
    padding-bottom: 20px;
    background-color: rgba(238, 238, 238, 0.8);
    }
    div>form{
        width: 300px;
        margin: 0 auto;
    }
    h2{

        margin-top: 30px;
        text-align: center;
    }
   
   form input{
       font-size: 20px;
   height: 28px;
   width: 250px;
   margin-top: 15px;
   }

ul>li{
    margin: 0 auto;
    text-align: center;
}
    .vcod >*{
float: left;
text-align: center;
    }

    .vcod>input{    
    width: 100px;
    margin-left: 5px;
    margin-top: 22px;
   

    }
    
    .vcod{
        
       
       margin-left: 22px;
       overflow: auto;
       overflow-y: hidden;
    }
  
    </style>
</head>
<body>

    <h2>花小花个人网站登录系统</h2>

    <div>

        
        <form action="">
<ul>
    <li><h3>Login</h3></li>
    <li><input type="text" ></li>
    <li><input type="password"></li>
    <li class="vcod"><div id="v_container" style="width: 150px;height: 30px;margin-top:15px;padding-top:0" ></div>
    <input type="text" id="code_input" placeholder="验证码"   />
    </li>
    <li id="error" style="color:red"></li>
    <li><input type="submit" value="登录" style="width:80px;margin-top:15px;font-size:18px" id="my_button"></li>
   
</ul>

  
  
        </form>
    </div>
    <script>
            var verifyCode = new GVerify("v_container");
            var code_input=document.getElementById("code_input");
            document.getElementById("my_button").onclick = function(){
            var res = verifyCode.validate(code_input.value);
            var error1=document.getElementById("error");
			if(res){
				/* alert("验证正确"); */
				error1.innerHTML="";
				return true;
			}else{
               
                error.innerHTML="验证码错误" ;
                return false;
			}
        }
       code_input.onfocus=function(){
    
        error1.innerHTML="";
                
            }
        </script>
</body>
</html>
