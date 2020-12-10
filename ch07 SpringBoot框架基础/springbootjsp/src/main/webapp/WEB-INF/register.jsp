<%--
  Created by IntelliJ IDEA.
  User: huaiwen
  Date: 2020/11/2
  Time: 3:45 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>用户注册</h1>
<form action="/register" method="post">
姓名: <input type="text" name="username" value="Lisa"><br>
年龄: <input type="text" name="age" value="23"><br>
班级: <input type="text" name="stuClass" value="18云计算"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
