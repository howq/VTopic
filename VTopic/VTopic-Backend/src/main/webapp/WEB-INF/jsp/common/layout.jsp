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

    <link rel="stylesheet" type="text/css" media="all" href="<%= request.getContextPath()%>/bootstrap/css/daterangepicker-bs3.css">
    <script src="<%= request.getContextPath()%>/vendor/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="<%= request.getContextPath()%>/bootstrap/js/moment.js"> </script>
    <script type="text/javascript" src="<%= request.getContextPath()%>/bootstrap/js/daterangepicker.js"></script>

    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/jquery-easyui-1.4.4/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/jquery-easyui-1.4.4/themes/icon.css">
    <script src="<%= request.getContextPath()%>/jquery-easyui-1.4.4/jquery.easyui.min.js"></script>

    <script src="<%= request.getContextPath()%>/vendor/modernizr.js"></script>

    <style>
        .dropdown {
            display: inline-block;
            position: relative;
            overflow: hidden;
            height: 34px;
            width: 150px;
            background: #f2f2f2;
            border: 1px solid;
            border-color: white #f7f7f7 whitesmoke;
            border-radius: 3px;
            background-image: -webkit-linear-gradient(top, transparent, rgba(0, 0, 0, 0.06));
            background-image: -moz-linear-gradient(top, transparent, rgba(0, 0, 0, 0.06));
            background-image: -o-linear-gradient(top, transparent, rgba(0, 0, 0, 0.06));
            background-image: linear-gradient(to bottom, transparent, rgba(0, 0, 0, 0.06));
            -webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, 0.08);
            box-shadow: 0 1px 1px rgba(0, 0, 0, 0.08);
        }
        .dropdown:before, .dropdown:after {
            content: '';
            position: absolute;
            z-index: 2;
            top: 9px;
            right: 10px;
            width: 0;
            height: 0;
            border: 4px dashed;
            border-color: #888888 transparent;
            pointer-events: none;
        }
        .dropdown:before {
            border-bottom-style: solid;
            border-top: none;
        }
        .dropdown:after {
            margin-top: 7px;
            border-top-style: solid;
            border-bottom: none;
        }

        .dropdown-select {
            position: relative;
            width: 130%;
            margin: 0;
            padding: 6px 8px 6px 10px;
            height: 28px;
            line-height: 14px;
            font-size: 12px;
            color: #62717a;
            text-shadow: 0 1px white;
            /* Fallback for IE 8 */
            background: #f2f2f2;
            /* "transparent" doesn't work with Opera */
            background: rgba(0, 0, 0, 0) !important;
            border: 0;
            border-radius: 0;
            -webkit-appearance: none;
        }
        .dropdown-select:focus {
            z-index: 3;
            width: 100%;
            color: #394349;
            outline: 2px solid #49aff2;
            outline: 2px solid -webkit-focus-ring-color;
            outline-offset: -2px;
        }
        .dropdown-select > option {
            margin: 3px;
            padding: 6px 8px;
            text-shadow: none;
            background: #f2f2f2;
            border-radius: 3px;
            cursor: pointer;
        }

        /* Fix for IE 8 putting the arrows behind the select element. */
        .lt-ie9 .dropdown {
            z-index: 1;
        }
        .lt-ie9 .dropdown-select {
            z-index: -1;
        }
        .lt-ie9 .dropdown-select:focus {
            z-index: 3;
        }

    </style>
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
            <%--<li class="notifications dropdown hidden-xs">--%>
                <%--<a href="javascript:;" data-toggle="dropdown">--%>
                    <%--<i class="fa fa-bell"></i>--%>
                <%--</a>--%>
            <%--</li>--%>
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
                        <a href="http://localhost:8080/VTopic/student/index">
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
                </c:choose>
            </div>
        </section>
    </section>
</div>


<script src="<%= request.getContextPath()%>/bootstrap/js/bootstrap.js"></script>
<script src="<%= request.getContextPath()%>/vendor/jquery.easing.min.js"></script>
<script src="<%= request.getContextPath()%>/vendor/jquery.placeholder.js"></script>
<script src="<%= request.getContextPath()%>/vendor/fastclick.js"></script>

<script src="<%= request.getContextPath()%>/vendor/jquery.slimscroll.js"></script>

<script src="<%= request.getContextPath()%>/js/off-canvas.js"></script>
<script src="<%= request.getContextPath()%>/js/main.js"></script>

</body>

</html>