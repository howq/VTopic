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
    <title>VTopic | 毕业设计选题系统</title>
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/login.css">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/footer.css">
</head>
<body>
<div id="loginform">
    <div style="margin-bottom: 130px"></div>
    <div id="facebook"><i class="fa fa-facebook"></i>
        <div id="connect">Welcome to VTopic</div>
    </div>
    <div id="mainlogin">
        <div id="or">or</div>
        <h1>Go---->毕业设计选题系统</h1>
        <form role="form">
            <input type="text" name="username" id="username" placeholder="工号/学号" value="" required>
            <input type="password" placeholder="密码" name="password" id="password" value="" required>
            <input id='rememberMe' name='rememberMe' type='checkbox' checked="checked"
                   style="width:16px;float: left;margin-left: 10%;margin-top: 3px">
            <label style="width: 80%">Remember me</label><br/>
            <label id='isLogin' style="width: 100%;color: #ff6e56;font-size: small;float: left;margin-left: 10%" hidden>密码不正确，请您确认后再登录!</label>
            <button type="button" onclick="doLogin()"><i class="fa fa-arrow-right"></i></button>
        </form>
    </div>
</div>
<%@ include file="common/footer.jsp" %>

<script src="<%= request.getContextPath()%>/vendor/jquery-1.11.1.min.js"></script>
<script src="<%= request.getContextPath()%>/js/md5.js"></script>

<script type="text/javascript">
    /**
     * 登录按钮押下处理
     */
    function doLogin() {
        var UserPwd = hex_md5($("#password").val())
        var params = {
            username: $("#username").val(),
            password: UserPwd,
            rememberMe: $("#rememberMe").val()
        };
        $.ajax({
            type: "POST",
            url: "<%=request.getContextPath()%>/doLogin",
            data: params,
            dataType: "json",
            success: function (resp) {
                if (resp.code == 'SUCCESS') {
                    window.location.href = "<%= request.getContextPath()%>/"+resp.data.url;
                }
                else {
                    $("#isLogin").show();
                }
            },
            error:function(XMLHttpRequest, textStatus, errorThrown) {
                alert(XMLHttpRequest.status);
                alert(XMLHttpRequest.readyState);
                alert(textStatus);
            }
        });
    }
</script>
</body>
</html>
