<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Title</title>
</head>
<body>
    <h1>系统主页V1.0</h1>
    <a href="${pageContext.request.contextPath}/user/logout">退出用户</a>
    <ul>
        <li><a href="">用户管理</a></li>
        <li><a href="">商品管理</a></li>
        <li><a href="">订单管理</a></li>
        <li><a href="">物流管理</a></li>
    </ul>
</body>
</html>