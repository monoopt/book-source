
<%--
  Created by IntelliJ IDEA.
  User: huaiwen
  Date: 2021/3/11
  Time: 7:19 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户表单</title>
</head>
<body>
<%
    String msg =(String)request.getAttribute("msg");
    out.println(msg);
%>

<h2>提交用户信息</h2>
<form action="/userinfo" method="post">
    姓名:<input type="text" name="name"><br>
    年龄:<input type="text" name="age"><<br>
    身高:<input type="text" name="height"><br>
    <input type="checkbox" name="hobby" value="篮球">篮球
    <input type="checkbox" name="hobby" value="网球">网球
    <input type="checkbox" name="hobby" value="羽毛球">羽毛球<br>
    电子邮箱:<input type="text" name="email"><br>
    电话号码1: <input type="text" name="cellphone"> <br>
    电话号码2: <input type="text" name="cellphone"> <br>
    电话号码3: <input type="text" name="cellphone"> <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
