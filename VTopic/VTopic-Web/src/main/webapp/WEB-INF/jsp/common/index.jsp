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
    <title>VTopic毕业设计系统</title>
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
                <input id='rememberMe' name='rememberMe' type='checkbox' style="width:16px;float: left;margin-left: 10%;margin-top: 3px">
                <label style="width: 80%">Remember me</label>
                <button type="submit"><i class="fa fa-arrow-right"></i></button>
            </form>
            <%--<div id="note"><a href="#">Forgot your password?</a></div>--%>
        </div>
    </div>
</body>
<script type="text/javascript">

</script>
</html>
