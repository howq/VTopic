<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: howq
  Date: 2017/3/15
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>VTopic毕业设计选题系统</title>
    <%--<link rel="stylesheet" href="${webRoot}/css/index.css">--%>
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/index.css">
    <%--<script src="${staticFileRoot}/js/main.js"></script>--%>
</head>
<body>
    <div id="loginform">
        <div style="margin-bottom: 130px"></div>
        <div id="facebook"><i class="fa fa-facebook"></i><div id="connect">Welcome to VTopic</div></div>
        <div id="mainlogin">
            <div id="or">or</div>
            <h1>Go---->毕业设计选题系统</h1>
            <form action="<%=request.getContextPath()%>/doLogin" method="post">
                <input type="text" name="username" id="username" placeholder="工号/学号" value="" required>
                <input type="password" placeholder="密码" name="password" id="password" value="" required>
                <input id='rememberMe' name='rememberMe' type='checkbox' checked="checked" style="width:16px;float: left;margin-left: 10%;margin-top: 3px">
                <label style="width: 80%">Remember me</label><br/>
                <label style="width: 100%;color: #ff6e56;font-size: small;float: left;margin-left: 10%" <c:if test="${0!= isLogin}">hidden</c:if>>密码不正确，请您确认后再登录!</label>
                <button type="submit"><i class="fa fa-arrow-right"></i></button>
            </form>
            <%--<div id="note"><a href="#">Forgot your password?</a></div>--%>
        </div>
        <%--<ul class="mg-t-lg error-nav">--%>
            <%--<li>--%>
                <%--<a href="javascript:;">&copy;--%>
                    <%--<span id="year" class="mg-r-xs"></span>VTopic</a>--%>
            <%--</li>--%>
            <%--<li>--%>
                <%--<a href="javascript:;">About</a>--%>
            <%--</li>--%>
            <%--<li>--%>
                <%--<a href="javascript:;">Help</a>--%>
            <%--</li>--%>
            <%--<li>--%>
                <%--<a href="javascript:;">Status</a>--%>
            <%--</li>--%>
        <%--</ul>--%>
    </div>
</body>
<script type="text/javascript">

</script>
</html>
