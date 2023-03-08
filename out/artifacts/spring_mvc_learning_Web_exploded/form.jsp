<%--
  Created by IntelliJ IDEA.
  User: wangkaijie
  Date: 2023/3/7
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>调查问卷</title>
</head>
<body>

<form style="width: 600px;margin: 200px auto 0;" method="post" action="/form">
    <h3>您的姓名：</h3><br>
    <input type="text" name="name"/><br>
    <h3>您正在学习的技术方向：</h3><br>
    <label>
        <select name="course" style="width: 150px">
            <option value="java">Java</option>
            <option value="h5">HTML5</option>
            <option value="python">Python</option>
            <option value="php">PHP</option>
        </select>
    </label>

    <div>
        <h3>您学习的目的：</h3>
        <label>
            <input type="checkbox" name="purpose" value="就业">
            就业
        </label>
        <label>
            <input type="checkbox" name="purpose" value="工作需求">
            工作需求
        </label>
        <label>
            <input type="checkbox" name="purpose" value="能力提升">
            能力提升
        </label>
        <label>
            <input type="checkbox" name="purpose" value="兴趣爱好">
            兴趣爱好
        </label>
        <label>
            <input type="checkbox" name="purpose" value="其他">
            其他
        </label>
    </div>

    <input type="submit" name="提交">
</form>

</body>
</html>
