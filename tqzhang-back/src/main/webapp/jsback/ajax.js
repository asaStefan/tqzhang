
function login(loginform){//传入表单参数
    if($("#user").val()==""){       //验证用户名是否为空
        alert("请输入用户名！");$("#user").focus();return false;
    }
    if($("#pass").val()==""){       //验证密码是否为空
        alert("请输入密码！");$("#pass").focus();return false;
    }   
    var param=getRootPath()+"/hello?action=login&username="+$("#user").val();
    var j ={"username":$("#user").val(),"password":$("#pass").val()};
  //?action=login&username="+$("#user").val()+"&password="+$("#pass").val();  //将登录信息连接成字符串，作为发送请求的参数
    $.ajax({
        type:"POST",
        url:param,
        async:false,
        data:JSON.stringify(j),
        contentType: 'application/json; charset=UTF-8',//防止乱码
       // dataType:"json",
        success:function (data)
        {
            alert("s:"+data);
            alert( getRootPath()+"/main.jsp");
            window.location.href = "http://192.168.1.110:8080/commerce-web/main.jsp";//跳转到主页
            alert("ds");
          //  callBack(data);
        },
    error:function(data){
    	alert("d");
    	//window
    }
    })
    /*
    
    $.ajax({
        url:param,//"http://192.168.1.110:8080/commerce-web/hello?action=login&username="+$("#user").val()+"&password="+$("#pass").val(),
        type:"POST", 
        dataType:"json",
        data:JSON.stringify(j),
        contentType: 'application/json; charset=UTF-8',//防止乱码 ///x-www-form-urlencoded
        success:function(data){
        	var ww="hhhh";
        	alert(ww);
        	alert(data);
            if(data == false){
                alert("您输入的用户名或密码有错！");$("#user").focus();return false;
            }else{
                window.location.href = "main.jsp";//跳转到主页
            }
        },
    error:function(){
    	var ww="hhhh";
    	alert(ww);
        alert("hehe");
    }
    });
    */
}

/** 
 * //获取当前项目根路径 
 * @return {TypeName}  
 */  
function getRootPath(){      
    //获取当前网址，如： http://localhost:8083/uimcardprj/share/meun.jsp      
    var curWwwPath=window.document.location.href;      
    //获取主机地址之后的目录，如： uimcardprj/share/meun.jsp      
    var pathName=window.document.location.pathname;      
    var pos=curWwwPath.indexOf(pathName);      
    //获取主机地址，如： http://localhost:8083      
    var localhostPaht=curWwwPath.substring(0,pos);      
    //获取带"/"的项目名，如：/uimcardprj      
    var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);      
    return(localhostPaht+projectName);  
}  
