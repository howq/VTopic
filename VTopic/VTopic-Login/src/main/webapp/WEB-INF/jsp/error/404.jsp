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
<html class="error-page no-js" lang="">

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
                    petok: "4585cc7e1e6141eaf9d75cbcc5aeb9d301e5f696-1419101795-1800",
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
                        "ape": "4b5b78c5ebbf273f083b97a7aea4ae5c"
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
    <link rel="stylesheet" href="<%= request.getContextPath()%>/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/font-awesome.min.css">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/animate.min.css">


    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/skins/palette.1.css" id="skin">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/fonts/style.1.css" id="font">
    <link rel="stylesheet" href="<%= request.getContextPath()%>/css/main.css">

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

<body class="bg-white center-wrapper">

<div class="center-content text-center">
    <div class="error-number">404</div>
    <div class="mg-b-lg">PAGE NOT FOUND</div>
    <p>Sorry, but the page you were trying to view does not exist.
        <br>
        <a href="<%= request.getContextPath()%>/index">Return Home</a>
    </p>
    <ul class="mg-t-lg error-nav">
        <li>
            <a href="javascript:;">&copy;
                <span id="year" class="mg-r-xs"></span>VTopic</a>
        </li>
        <li>
            <a href="javascript:;">About</a>
        </li>
        <li>
            <a href="javascript:;">Help</a>
        </li>
        <li>
            <a href="javascript:;">Status</a>
        </li>
    </ul>
</div>

<script type="text/javascript">
    var el = document.getElementById("year"),
            year = (new Date().getFullYear());
    el.innerHTML = year;
</script>
</body>

</html>