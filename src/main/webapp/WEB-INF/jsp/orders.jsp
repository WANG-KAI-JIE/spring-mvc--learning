<%--
  Created by IntelliJ IDEA.
  User: wangkaijie
  Date: 2023/3/8
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/findOrdersWithUser" method="post">
    <label>
        订单编号：
        <input type="text" name="orderId"/>
    </label>
    <br>
    <label>
        所属用户：
        <input type="text" name="user.username"/>
    </label>
    <br>
    <input type="submit" name="查询"/>
</form>
</body>
</html>
