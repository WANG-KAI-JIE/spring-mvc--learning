<%--
  Created by IntelliJ IDEA.
  User: wangkaijie
  Date: 2023/3/7
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>

<form style="width: 300px;margin: 200px auto 0;" method="post" action="/login">
    账号：<input type="text" name="username" value="">
    <br>
    密码：<input type="password" name="password" value="">
    <br>
    <input type="submit" value="登录">
</form>
</body>
</html>
