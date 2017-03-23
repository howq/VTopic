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

    <script type="text/javascript">
        //<![CDATA[
        try {
            if (!window.CloudFlare) {
                var CloudFlare = [{
                    verbose: 0,
                    p: 0,
                    byc: 0,
                    owlid: "cf",
                    bag2: 1,
                    mirage2: 0,
                    oracle: 0,
                    paths: {
                        cloudflare: "/cdn-cgi/nexp/dok2v=1613a3a185/"
                    },
                    atok: "1668c19642567e08c574f5d9458345a2",
                    petok: "3285f1db20753df31d6fcdae6015a30e5a60a785-1419101748-1800",
                    zone: "nyasha.me",
                    rocket: "0",
                    apps: {
                        "ga_key": {
                            "ua": "UA-50530436-1",
                            "ga_bs": "2"
                        }
                    }
                }];
                CloudFlare.push({
                    "apps": {
                        "ape": "86d42e0b8c0027bb178361fce707fc15"
                    }
                });
                !function (a, b) {
                    a = document.createElement("script"), b = document.getElementsByTagName("script")[0], a.async = !0, a.src = "//ajax.cloudflare.com/cdn-cgi/nexp/dok2v=919620257c/cloudflare.min.js", b.parentNode.insertBefore(a, b)
                }()
            }
        } catch (e) {
        }
        ;
        //]]>
    </script>
    <link rel="stylesheet" href="<%= request.getContextPath()%>/vendor/offline/theme.css">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/vendor/pace/theme.css">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/vendor/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/vendor/bxslider/jquery.bxslider.css">


    <link rel="stylesheet" href="<%= request.getContextPath()%>/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/font-awesome.min.css">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/animate.min.css">

    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/panel.css">

    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/skins/palette.1.css" id="skin">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/fonts/style.1.css" id="font">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/main.css">


    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <script src="<%= request.getContextPath()%>/vendor/modernizr.js"></script>
    <script type="text/javascript">
        /* <![CDATA[ */
        var _gaq = _gaq || [];
        _gaq.push(['_setAccount', 'UA-50530436-1']);
        _gaq.push(['_trackPageview']);

        (function () {
            var ga = document.createElement('script');
            ga.type = 'text/javascript';
            ga.async = true;
            ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
            var s = document.getElementsByTagName('script')[0];
            s.parentNode.insertBefore(ga, s);
        })();

        (function (b) {
            (function (a) {
                "__CF" in b && "DJS" in b.__CF ? b.__CF.DJS.push(a) : "addEventListener" in b ? b.addEventListener("load", a, !1) : b.attachEvent("onload", a)
            })(function () {
                "FB" in b && "Event" in FB && "subscribe" in FB.Event && (FB.Event.subscribe("edge.create", function (a) {
                    _gaq.push(["_trackSocial", "facebook", "like", a])
                }), FB.Event.subscribe("edge.remove", function (a) {
                    _gaq.push(["_trackSocial", "facebook", "unlike", a])
                }), FB.Event.subscribe("message.send", function (a) {
                    _gaq.push(["_trackSocial", "facebook", "send", a])
                }));
                "twttr" in b && "events" in twttr && "bind" in twttr.events && twttr.events.bind("tweet", function (a) {
                    if (a) {
                        var b;
                        if (a.target && a.target.nodeName == "IFRAME") a: {
                            if (a = a.target.src) {
                                a = a.split("#")[0].match(/[^?=&]+=([^&]*)?/g);
                                b = 0;
                                for (var c; c = a[b]; ++b)
                                    if (c.indexOf("url") === 0) {
                                        b = unescape(c.split("=")[1]);
                                        break a
                                    }
                            }
                            b = void 0
                        }
                        _gaq.push(["_trackSocial", "twitter", "tweet", b])
                    }
                })
            })
        })(window);
        /* ]]> */
    </script>
</head>

<body>
<div class="ob_options hidden-xs">
    <div class="options">
        <h6>COLOR SKINS</h6>
        <div class="options-container color_skins">
            <a href="<%= request.getContextPath()%>/css/skins/palette.1.css" class="css_orange cs_color cs_1"></a>
            <a href="<%= request.getContextPath()%>/css/skins/palette.2.css" class="css_orange cs_color cs_2"></a>
            <a href="<%= request.getContextPath()%>/css/skins/palette.3.css" class="css_orange cs_color cs_3"></a>
            <a href="<%= request.getContextPath()%>/css/skins/palette.4.css" class="css_orange cs_color cs_4"></a>
            <a href="<%= request.getContextPath()%>/css/skins/palette.5.css" class="css_orange cs_color cs_5"></a>
            <a href="<%= request.getContextPath()%>/css/skins/palette.6.css" class="css_orange cs_color cs_6"></a>
            <a href="<%= request.getContextPath()%>/css/skins/palette.7.css" class="css_orange cs_color cs_7"></a>
            <a href="<%= request.getContextPath()%>/css/skins/palette.8.css" class="css_orange cs_color cs_8"></a>
            <a href="<%= request.getContextPath()%>/css/skins/palette.9.css" class="css_orange cs_color cs_9"></a>
            <a href="<%= request.getContextPath()%>/css/skins/palette.10.css" class="css_orange cs_color cs_10"></a>
        </div>
        <h6>FONT OPTIONS</h6>
        <div class="options-container font_options">
            <select class="input-sm">
                <option value="<%= request.getContextPath()%>/css/fonts/style.1.css">Open Sans</option>
                <option value="<%= request.getContextPath()%>/css/fonts/style.2.css">Helvetica Neue</option>
                <option value="<%= request.getContextPath()%>/css/fonts/style.3.css">Montserrat &amp; Open Sans</option>
            </select>
        </div>
        <h6>LAYOUT VARIATIONS</h6>
        <div class="options-container layout_options">
            <select class="input-sm">
                <option value="boxed.html">Boxed</option>
                <option value="horizontal.html">Horizontal menu</option>
                <option value="horizontal_boxed.html">Horizontal Boxed</option>
                <option value="small-sidebar.html">Small sidebar</option>
                <option value="right-sidebar.html">Right sidebar</option>
                <option value="right-sidebar-collapsible.html">Right Collapsed</option>
                <option value="both.html">Mixed Menus</option>
                <option value="collapsible.html">Collapsible</option>
                <option value="app.html">App</option>
                <option value="footer.html">With footer</option>
            </select>
        </div>
        <small class="ucase">This Panel is for demo purposes only</small>
    </div>
    <div class="ob_toggle bg-color"><span class="fa fa-cog"></span>
    </div>
</div>
<div class="app" data-sidebar="locked">

    <header class="header header-fixed navbar">
        <div class="brand">
            <a href="javascript:;" class="fa fa-bars off-left visible-xs" data-toggle="off-canvas" data-move="ltr"></a>
            <a href="index.html" class="navbar-brand">
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
                    +Gerald Theodore Morris
                </a>
            </li>
            <li class="notifications dropdown hidden-xs">
                <a href="javascript:;" data-toggle="dropdown">
                    <i class="fa fa-bell"></i>
                    <div class="badge badge-top bg-danger animated flash">3</div>
                </a>
                <div class="dropdown-menu dropdown-menu-right animated slideInRight">
                    <div class="panel bg-white no-border no-margin">
                        <div class="panel-heading no-radius">
                            <small>
                                <b>Notifications</b>
                            </small>
                            <small class="pull-right">
                                <a href="javascript:;" class="mg-r-xs">mark as read</a>&#8226;
                                <a href="javascript:;" class="fa fa-cog mg-l-xs"></a>
                            </small>
                        </div>
                        <ul class="list-group">
                            <li class="list-group-item">
                                <a href="javascript:;">
                                        <span class="pull-left mg-t-xs mg-r-md">
<img src="img/face4.jpg" class="avatar avatar-sm img-circle" alt="">
</span>
                                    <div class="m-body show pd-t-xs">
                                        <span>Dean Winchester</span>
                                        <span>Posted on to your wall</span>
                                        <small>2 mins ago</small>
                                    </div>
                                </a>
                            </li>
                            <li class="list-group-item">
                                <a href="javascript:;">
                                        <span class="pull-left mg-t-xs mg-r-md">
<span class="fa-stack fa-lg">
<i class="fa fa-circle fa-stack-2x text-warning"></i>
<i class="fa fa-download fa-stack-1x fa-inverse"></i>
</span>
                                        </span>
                                    <div class="m-body show pd-t-xs">
                                        <span>145 MB download in progress.</span>
                                        <div class="progress progress-xs mg-t-xs mg-b-xs">
                                            <div class="progress-bar progress-bar-primary" role="progressbar"
                                                 aria-valuenow="40" aria-valuemin="0" aria-valuemax="100"
                                                 style="width: 40%">
                                            </div>
                                        </div>
                                        <small>Started 23 mins ago</small>
                                    </div>
                                </a>
                            </li>
                            <li class="list-group-item">
                                <a href="javascript:;">
                                        <span class="pull-left mg-t-xs mg-r-md">
<img src="img/face3.jpg" class="avatar avatar-sm img-circle" alt="">
</span>
                                    <div class="m-body show pd-t-xs">
                                        <span>Application</span>
                                        <span>Where is my workspace widget</span>
                                        <small>5 days ago</small>
                                    </div>
                                </a>
                            </li>
                        </ul>
                        <div class="panel-footer no-border">
                            <a href="javascript:;">See all notifications</a>
                        </div>
                    </div>
                </div>
            </li>
            <li class="quickmenu">
                <a href="javascript:;" data-toggle="dropdown">
                    <img src="img/avatar.jpg" class="avatar pull-left img-circle" alt="user" title="user">
                    <i class="caret mg-l-xs hidden-xs no-margin"></i>
                </a>
                <ul class="dropdown-menu dropdown-menu-right mg-r-xs">
                    <li>
                        <a href="javascript:;">
                            <div class="pd-t-sm">
                                gerald@morris.com
                                <br>
                                <small class="text-muted">4.2 MB of 51.25 GB used</small>
                            </div>
                            <div class="progress progress-xs no-radius no-margin mg-b-sm">
                                <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40"
                                     aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                </div>
                            </div>
                        </a>
                    </li>
                    <li>
                        <a href="profile.html">Settings</a>
                    </li>
                    <li>
                        <a href="javascript:;">Upgrade</a>
                    </li>
                    <li>
                        <a href="javascript:;">Notifications
                            <div class="badge bg-danger pull-right">3</div>
                        </a>
                    </li>
                    <li>
                        <a href="javascript:;">Help ?</a>
                    </li>
                    <li class="divider"></li>
                    <li>
                        <a href="signin.html">Logout</a>
                    </li>
                </ul>
            </li>
        </ul>
    </header>

    <section class="layout">

        <aside class="sidebar canvas-left">

            <nav class="main-navigation">
                <ul>
                    <li class="active">
                        <a href="index.html">
                            <i class="fa fa-coffee"></i>
                            <span>Framework</span>
                        </a>
                    </li>
                    <li class="dropdown show-on-hover">
                        <a href="javascript:;" data-toggle="dropdown">
                            <i class="fa fa-ellipsis-h"></i>
                            <span>UI Elements</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="buttons.html">
                                    <span>Buttons</span>
                                </a>
                            </li>
                            <li>
                                <a href="forms.html">
                                    <span>Forms</span>
                                </a>
                            </li>
                            <li>
                                <a href="tables.html">
                                    <span>Tables</span>
                                </a>
                            </li>
                            <li>
                                <a href="calendar.html">
                                    <span>Calendar</span>
                                </a>
                            </li>
                            <li>
                                <a href="components.html">
                                    <span>Components</span>
                                </a>
                            </li>
                            <li>
                                <a href="sortable.html">
                                    <span>Sortable</span>
                                </a>
                            </li>
                            <li>
                                <a href="chart.html">
                                    <span>Charts</span>
                                </a>
                            </li>
                            <li>
                                <a href="editor.html">
                                    <span>Editor</span>
                                </a>
                            </li>
                            <li>
                                <a href="maps.html">
                                    <span>Google Maps</span>
                                </a>
                            </li>
                            <li>
                                <a href="vector.html">
                                    <span>Vector Maps</span>
                                </a>
                            </li>
                            <li>
                                <a href="widgets.html">
                                    <span>Widgets</span>
                                </a>
                            </li>
                            <li>
                                <a href="icons.html">
                                    <span>Icons</span>
                                </a>
                            </li>
                            <li>
                                <a href="grid.html">
                                    <span>Grid</span>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown show-on-hover">
                        <a href="javascript:;" data-toggle="dropdown">
                            <i class="fa fa-tasks"></i>
                            <span>Layouts</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="boxed.html">
                                    <span>Boxed</span>
                                </a>
                            </li>
                            <li>
                                <a href="horizontal.html">
                                    <span>Horizontal menu</span>
                                </a>
                            </li>
                            <li>
                                <a href="horizontal_boxed.html">
                                    <span>Horizontal Boxed</span>
                                </a>
                            </li>
                            <li>
                                <a href="small-sidebar.html">
                                    <span>Small sidebar</span>
                                </a>
                            </li>
                            <li>
                                <a href="right-sidebar.html">
                                    <span>Right Sidebar</span>
                                </a>
                            </li>
                            <li>
                                <a href="right-sidebar-collapsible.html">
                                    <span>Right Sidebar collapsible</span>
                                </a>
                            </li>
                            <li>
                                <a href="both.html">
                                    <span>Mixed menus</span>
                                </a>
                            </li>
                            <li>
                                <a href="collapsible.html">
                                    <span>Collapsible Menu</span>
                                </a>
                            </li>
                            <li>
                                <a href="footer.html">
                                    <span>With Footer</span>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="mail.html">
                            <div class="badge bg-none pull-right">8</div>
                            <i class="fa fa-envelope"></i>
                            <span>Mailbox</span>
                        </a>
                    </li>
                    <li class="dropdown show-on-hover">
                        <a href="javascript:;" data-toggle="dropdown">
                            <i class="fa fa-file"></i>
                            <span>Pages</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="tasks.html">
                                    <span>Tasks</span>
                                </a>
                            </li>
                            <li>
                                <a href="profile.html">
                                    <span>Profile</span>
                                </a>
                            </li>
                            <li>
                                <a href="invoice.html">
                                    <span>Invoice</span>
                                </a>
                            </li>
                            <li>
                                <a href="gallery.html">
                                    <span>Gallery</span>
                                </a>
                            </li>
                            <li>
                                <a href="signin.html">
                                    <span>Signin</span>
                                </a>
                            </li>
                            <li>
                                <a href="signup.html">
                                    <span>Signup</span>
                                </a>
                            </li>
                            <li>
                                <a href="lock.html">
                                    <span>Lock Screen</span>
                                </a>
                            </li>
                            <li>
                                <a href="404.html">
                                    <span>404 Page</span>
                                </a>
                            </li>
                            <li>
                                <a href="500.html">
                                    <span>500 Page</span>
                                </a>
                            </li>
                            <li>
                                <a href="blank.html">
                                    <span>Blank</span>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown show-on-hover">
                        <a href="javascript:;" data-toggle="dropdown">
                            <i class="fa fa-gift"></i>
                            <span>Extras</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="pricing.html">
                                    <span>Pricing Tables</span>
                                </a>
                            </li>
                            <li>
                                <a href="mail_alt.html">
                                    <span>Mail Alt.</span>
                                </a>
                            </li>
                            <li>
                                <a href="email.html">
                                    <span>Email Template</span>
                                </a>
                            </li>
                            <li>
                                <a href="subscription.html">
                                    <span>Subscription</span>
                                </a>
                            </li>
                            <li>
                                <a href="timeline.html">
                                    <span>Timeline</span>
                                </a>
                            </li>
                            <li>
                                <a href="feed.html">
                                    <span>Feed</span>
                                </a>
                            </li>
                            <li>
                                <a href="chat.html">
                                    <span>Chat</span>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="changelog.html">
                            <i class="fa fa-info"></i>
                            <span>Change log</span>
                        </a>
                    </li>
                </ul>
            </nav>


            <footer>
                <div class="about-app pd-md animated pulse">
                    <a href="javascript:;">
                        <img src="img/about.png" alt="">
                    </a>
                    <span>
<b>Cameo</b>&#32;is a responsive admin template powered by bootstrap 3.
<a href="javascript:;">
<b>Find out more</b>
</a>
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


        <aside class="chat-sidebar canvas-right pull-right">
            <div class="slimscroll" data-height="auto" data-size="6px" data-distance="0">
                <div class="row text-white pd-md">
                    <div class="col-xs-8">
                        <p class="mg-t-xs">Mute notifications</p>
                    </div>
                    <div class="col-xs-4">
                        <input type="checkbox" class="js-switch" checked/>
                    </div>
                </div>
                <b class="center-block text-white pd-md">
                    Activity feed
                </b>
                <div class="pd-md">
                    <a href="javascript:;" class="pull-left mg-r-md">
                            <span class="fa-stack fa-lg">
<i class="fa fa-circle fa-stack-2x text-warning"></i>
<i class="fa fa-download fa-stack-1x fa-inverse"></i>
</span>
                    </a>
                    Rose Fournier
                    <small>Posted on to your wall</small>
                    <br>
                    <small>2 mins ago</small>
                </div>
                <div class="pd-md">
                    <a href="javascript:;" class="pull-left mg-r-md">
                            <span class="fa-stack fa-lg">
<i class="fa fa-circle fa-stack-2x text-danger"></i>
<i class="fa fa-download fa-stack-1x fa-inverse"></i>
</span>
                    </a>
                    Liviu Cîndea
                    <small>Shared a photo with you.</small>
                    <br>
                    <small>13 mins ago</small>
                </div>
                <div class="pd-md">
                    <a href="javascript:;" class="pull-left mg-r-md">
                            <span class="fa-stack fa-lg">
<i class="fa fa-circle fa-stack-2x text-success"></i>
<i class="fa fa-download fa-stack-1x fa-inverse"></i>
</span>
                    </a>
                    Ane Marín
                    <small>Left the group(HR)</small>
                    <br>
                    <small>4 days ago</small>
                </div>
                <b class="center-block text-white pd-md">
                    Favourites
                </b>
                <div class="pd-md">
                    <a href="javascript:;" class="pull-left mg-r-md">
                        <img src="img/face4.jpg" class="avatar avatar-sm img-circle" alt="">
                    </a>
                    <div class="user">
                        Adi Afrom
                        <i class="fa fa-circle text-danger pull-right"></i>
                    </div>
                    <small>Offline</small>
                </div>
                <div class="pd-md">
                    <a href="javascript:;" class="pull-left mg-r-md">
                        <img src="img/face3.jpg" class="avatar avatar-sm img-circle" alt="">
                    </a>
                    <div class="user">
                        Leonie Horn
                        <i class="fa fa-circle text-danger pull-right"></i>
                    </div>
                    <small>Offline</small>
                </div>
                <b class="center-block text-white pd-md">
                    Friends Online
                </b>
                <div class="pd-md">
                    <a href="javascript:;" class="pull-left mg-r-md">
                        <img src="img/face1.jpg" class="avatar avatar-sm img-circle" alt="">
                    </a>
                    <div class="user">
                        Joshua Smart
                        <i class="fa fa-circle text-warning pull-right"></i>
                    </div>
                    <small>is thinking of bananas</small>
                </div>
                <div class="pd-md">
                    <a href="javascript:;" class="pull-left mg-r-md">
                        <img src="img/face3.jpg" class="avatar avatar-sm img-circle" alt="">
                    </a>
                    <div class="user">
                        娉 廖
                        <i class="fa fa-circle text-success pull-right"></i>
                    </div>
                    <small>Ready to chat</small>
                </div>
                <div class="pd-md">
                    <a href="javascript:;" class="pull-left mg-r-md">
                        <img src="img/face5.jpg" class="avatar avatar-sm img-circle" alt="">
                    </a>
                    <div class="user">
                        Albert Madsen
                        <i class="fa fa-circle-o text-default pull-right"></i>
                    </div>
                    <small>idle</small>
                </div>
            </div>
        </aside>

    </section>
</div>

<script src="<%= request.getContextPath()%>/vendor/jquery-1.11.1.min.js"></script>
<script src="<%= request.getContextPath()%>/bootstrap/js/bootstrap.js"></script>
<script src="<%= request.getContextPath()%>/vendor/jquery.easing.min.js"></script>
<script src="<%= request.getContextPath()%>/vendor/jquery.placeholder.js"></script>
<script src="<%= request.getContextPath()%>/vendor/fastclick.js"></script>


<script src="<%= request.getContextPath()%>/vendor/moment.js"></script>
<script src="<%= request.getContextPath()%>/vendor/skycons.js"></script>
<script src="<%= request.getContextPath()%>/vendor/jquery.blockUI.js"></script>
<script src="<%= request.getContextPath()%>/vendor/raphael.min.js"></script>
<script src="<%= request.getContextPath()%>/vendor/morris/morris.js"></script>
<script src="<%= request.getContextPath()%>/vendor/switchery/switchery.js"></script>
<script src="<%= request.getContextPath()%>/vendor/jquery.slimscroll.js"></script>
<script src="<%= request.getContextPath()%>/vendor/bxslider/jquery.bxslider.min.js"></script>
<script src="<%= request.getContextPath()%>/vendor/offline/offline.min.js"></script>
<script src="<%= request.getContextPath()%>/vendor/pace/pace.min.js"></script>


<script src="<%= request.getContextPath()%>/js/off-canvas.js"></script>
<script src="<%= request.getContextPath()%>/js/main.js"></script>

<script src="<%= request.getContextPath()%>/js/panel.js"></script>
<script src="<%= request.getContextPath()%>/js/dashboard.js"></script>
</body>

</html>