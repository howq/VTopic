<%@ page import="com.ihowq.VTopic.service.VTConfig" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: howq
  Date: 2017/3/15
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html class="no-js" lang="">

<head>

    <meta charset="utf-8">
    <meta name="description" content="Flat, Clean, Responsive, admin template built with bootstrap 3">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1">

    <title>VTopic | 毕业设计选题系统</title>

    <link rel="stylesheet" href="<%= request.getContextPath()%>/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/font-awesome.min.css">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/animate.min.css">

    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/panel.css">

    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/skins/palette.1.css" id="skin">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/fonts/style.1.css" id="font">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/main.css">

    <script src="<%= request.getContextPath()%>/vendor/modernizr.js"></script>
</head>

<body>
<div class="app" data-sidebar="locked">

    <header class="header header-fixed navbar">
        <div class="brand">
            <a href="javascript:;" class="fa fa-bars off-left visible-xs" data-toggle="off-canvas" data-move="ltr"></a>
            <a href="<%= request.getContextPath()%>/" class="navbar-brand">
                <i class="fa fa-stop mg-r-sm"></i>
                <span class="heading-font">
                    V<b>Topic</b>
                </span>
            </a>
        </div>
        <form class="navbar-form navbar-left hidden-xs" role="search">
            <div class="form-group">
                <button class="btn no-border no-margin bg-none no-pd-l" type="submit">
                    <i class="fa fa-search"></i>
                </button>
                <input type="text" class="form-control no-border no-padding search" placeholder="Search Workspace">
            </div>
        </form>
        <ul class="nav navbar-nav navbar-right off-right">
            <li class="hidden-xs">
                <a href="javascript:;">
                    欢迎来到<b>VTopic</b>毕业设计选课系统
                </a>
            </li>
            <li class="notifications dropdown hidden-xs">
                <a href="javascript:;" data-toggle="dropdown">
                    <i class="fa fa-bell"></i>
                </a>
            </li>
            <li class="quickmenu">
                <a href="javascript:;" data-toggle="dropdown">
                    <img src="<%= request.getContextPath()%>/img/avatar.jpg" class="avatar pull-left img-circle" alt="user" title="user">
                    <i class="caret mg-l-xs hidden-xs no-margin"></i>
                </a>
                <ul class="dropdown-menu dropdown-menu-right mg-r-xs">
                    <li>
                        <a href="javascript:;"><c:out value="${userInfo.username}"></c:out></a>
                    </li>
                    <li>
                        <a href="javascript:;">Settings</a>
                    </li>
                    <li>
                        <a href="javascript:;">Upgrade</a>
                    </li>
                    <li>
                        <a href="javascript:;">Help</a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a href="${logout}">Logout</a>
                    </li>
                </ul>
            </li>
        </ul>
    </header>

    <section class="layout">

        <aside class="sidebar canvas-left">

            <nav class="main-navigation">
                <ul>
                    <c:if test="${userInfo.roleid == 0}">
                        <c:choose>
                            <c:when test="${curPage == 0}">
                                <li class="active">
                            </c:when>
                            <c:otherwise>
                                <li>
                            </c:otherwise>
                        </c:choose>
                            <a href="<%= request.getContextPath()%>/manage/index">
                                <i class="fa fa-coffee"></i>
                                <span>毕设开题</span>
                            </a>
                        </li>
                    </c:if>
                    <c:if test="${userInfo.roleid == 1}">
                        <c:choose>
                            <c:when test="${curPage == 1}">
                                <li class="active">
                            </c:when>
                            <c:otherwise>
                                <li>
                            </c:otherwise>
                        </c:choose>
                        <a href="<%= request.getContextPath()%>/teacher/index">
                                <i class="fa fa-file"></i>
                                <span>提交选题</span>
                            </a>
                        </li>
                    </c:if>
                    <c:choose>
                        <c:when test="${curPage == 2}">
                            <li class="active">
                        </c:when>
                        <c:otherwise>
                            <li>
                        </c:otherwise>
                    </c:choose>
                        <a href="<%= request.getContextPath()%>/student/index">
                            <i class="fa fa-tasks"></i>
                            <span>毕设选题</span>
                        </a>
                    </li>
                </ul>
            </nav>

            <footer>
                <div class="about-app pd-md animated pulse">
                    <a href="javascript:;">
                        <img src="<%= request.getContextPath()%>/img/about.png" alt="">
                    </a>
                    <span>
                        <b>VTopic</b>&#32;专属于高校教务系统，致力于打造毕业生与指导老师之间无缝对接
                    </span>
                </div>
                <div class="footer-toolbar pull-left">
                    <a href="javascript:;" class="pull-left help">
                        <i class="fa fa-question-circle"></i>
                    </a>
                    <a href="javascript:;" class="toggle-sidebar pull-right hidden-xs">
                        <i class="fa fa-angle-left"></i>
                    </a>
                </div>
            </footer>

        </aside>
        <section class="main-content">
            <div class="content-wrap">
                <c:choose>
                    <c:when test="${curPage == 0}">
                        <%@ include file="../manager/manage.jsp" %>
                    </c:when>
                    <c:when test="${curPage == 1}">
                        <%@ include file="../teacher/submit.jsp" %>
                    </c:when>
                    <c:when test="${curPage == 2}">
                        <%@ include file="../student/select.jsp" %>
                    </c:when>
                </c:choose>
            </div>
        </section>
    </section>
</div>

<script src="<%= request.getContextPath()%>/vendor/jquery-1.11.1.min.js"></script>
<script src="<%= request.getContextPath()%>/bootstrap/js/bootstrap.js"></script>
<script src="<%= request.getContextPath()%>/vendor/jquery.easing.min.js"></script>
<script src="<%= request.getContextPath()%>/vendor/jquery.placeholder.js"></script>
<script src="<%= request.getContextPath()%>/vendor/fastclick.js"></script>

<script src="<%= request.getContextPath()%>/vendor/jquery.slimscroll.js"></script>

<script src="<%= request.getContextPath()%>/js/off-canvas.js"></script>
<script src="<%= request.getContextPath()%>/js/main.js"></script>

</body>

</html>