<%--
  Created by IntelliJ IDEA.
  User: wangkaijie
  Date: 2023/3/7
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
<h2>注册</h2>
<form action="${pageContext.request.contextPath}/registerUser" method="post">
    <label>
        用户名：<input type="text" name="username"/>
    </label>
    <br>
    <label>
        密码：<input type="text" name="password"/>
    </label>
    <br>
    <input type="submit" value="注册"/>
</form>

</body>
</html>
