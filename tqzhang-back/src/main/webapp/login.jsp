<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
      <meta charset="UTF-8">
    <title>TQZHANG-cms系统登录</title>
    <link href="./styles/bootstrap/bootstrap.css" rel="stylesheet">
    <link href="./styles/login-style.css" rel="stylesheet">

</head>
<body>

<h1>系统登录</h1>

<div>
  <c:if test="${param.error != null}">
    <p>用户名密码错误！</p>
  </c:if>
  <c:if test="${param.logout != null}">
    <p>您已注销！</p>
  </c:if>
</div>
<%-- <c:url value="/login" var="loginUrl"/>
<form action="${loginUrl}" method="post" id="loginForm">
  <div>
    <input type="text" name="username" class="username" placeholder="用户名" autocomplete="off"/>
  </div>
  <div>
    <input type="password" name="password" class="password" placeholder="密码" oncontextmenu="return false" onpaste="return false"/>
  </div>
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
  <button id="submit" type="submit">登录</button>
</form> --%>

<div class="jumbotron cms-jumbotron">
    <div class="container">
        <p class="cms-login-title">鸿安CMS系统</p>
        <small>Hongan's CMS System</small>
    </div>
</div>
<div class="cms-shadow"></div>

<div class="container">
    <div class="alert alert-warning alert-dismissible state" role="alert">
        <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        <strong>Warning!</strong><span id="warning-content"></span>
    </div>
    <form class="form-horizontal wrap" role="form" action="/login" method="post" id="loginForm">
        <div class="form-group">
            <label for="mobile" class="col-sm-2 control-label cms-label">手机号</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="mobile" placeholder="手机号">
                <span class="spa spa1"></span>
            </div>
        </div>
        <div class="form-group">
            <label for="pwd" class="col-sm-2 control-label cms-label">密码</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="pwd"  placeholder="密码">
                <span class="spa spa2"></span>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn cms-login btn-default"  id="submit">Sign in</button>
            </div>
        </div>
    </form>
</div>
<script src="./scripts/jQuery/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./scripts/bootstrap/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./scripts/jQuery/jquery.cookie.min.js" type="text/javascript" charset="utf-8"></script>
<script src="./scripts/jQuery/jquery.md5.js" type="text/javascript" charset="utf-8"></script>
<script src="./scripts/js/checkLogin.js" type="text/javascript" charset="utf-8"></script>
<!--<script src="https://cdnjs.cloudflare.com/ajax/libs/trianglify/0.4.0/trianglify.min.js"></script>-->

</body>
</html>
