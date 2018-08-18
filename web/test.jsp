<jsp:useBean id="contextPath" scope="request" type=""/>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ include file="include/header.jsp" %>

<script src="js/jquery/2.0.0/jquery.min.js"></script>
<%--<link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">--%>
<%--<script src="js/bootstrap/3.3.6/bootstrap.min.js"></script>--%>
<%--<link href="css/fore/style.css" rel="stylesheet">--%>
<meta charset="UTF-8">
<style>
    * {
        padding: 0;
        margin: 0;
        color: #c4e3f3;
        font-size: 12px;
        font-family: Arial, serif;
        /* 	width:1920px; */
        -webkit-box-sizing: border-box;
        -moz-box-sizing: border-box;
        box-sizing: border-box;
    }

    a:hover {
        text-decoration: none;
        color: #C40000;
    }

    nav {
        display: block;
    }

    nav a {
        text-decoration: none;
    }

    nav.top {
        padding-top: 5px;
        padding-bottom: 5px;
        border-bottom: 1px solid #e7e7e7;
    }

    nav.top span {
        margin-right: 20px;
    }

    nav.top span, nav.top a {
        color: #999;
        margin: 0 10px;
    }

    nav.top a:hover {
        color: #C40000;
    }

    nav.top {
        background-color: #f2f2f2;
    }

    .pull-right {
        float: right !important;
    }
</style>
<nav class="top ">
    <a href="${contextPath}">
        <span style="color:#C40000;margin:0" class=" glyphicon glyphicon-home redColor">
        </span>
        天猫首页
    </a>
    <span>喵，欢迎来天猫</span>

    <c:if test="${!empty user}">
        <a href="login.jsp">${user.name}</a>
        <a href="forelogout">退出</a>
    </c:if>
    <c:if test="${empty user}">
        <a href="login.jsp">请登录</a>
        <a href="register.jsp">免费注册</a>
    </c:if>

    <span class="pull-right">
			<a href="forebought">我的订单</a>
			<a href="forecart">
			<span style="color:#C40000;margin:0"
                  class=" glyphicon glyphicon-shopping-cart redColor">
            </span>
			购物车<strong>${cartTotalItemNumber}</strong>件
            </a>
		</span>
</nav>
