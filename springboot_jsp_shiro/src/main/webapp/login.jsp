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
    <h1>用户登录</h1>
    <form action="${pageContext.request.contextPath}/user/login" method="post">
        用户名：<input type="text" name="username"><br/>
        密码：<input type="text" name="password"><br/>
        请输入验证码：<input type="text" name="code"><img src="${pageContext.request.contextPath}/user/getImage" alt=""><br/>
        <input type="submit" value="登录">
    </form>
</body>
</html>