<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<script type="text/javascript" src="./scripts/jQuery/jquery.min.js"></script>   
<meta http-equiv="Content-Type" content="text/html; charset=utf8">  
<title>Insert title here</title>  
<script type="text/javascript">  
    function ajaxTest(){  
    	alert("ds"+$("#name").val());
        $.ajax({  
        data:"name="+$("#name").val(),  
        type:"GET",  
        dataType: 'text',/* 'json',  */ 
        url:"user2/login.do",  
        error:function(data){  
            alert("出错了！！:"+data.msg);  
        },  
        success:function(data){
        	   data="{msg:sucess-tqzhang001}";
        	alert(data);
         
        //	alert(eval(data));
            alert("success:"+data);  
            $("#result").html(data) ;  
        }  
        });  
    }  
</script>  
</head>  
<body>  
    <input type="text" name="name" id="name"/>  
    <input type="submit" value="登录" onclick="ajaxTest();"/>  
    <div id="result"></div>  
</body>  
</html> 