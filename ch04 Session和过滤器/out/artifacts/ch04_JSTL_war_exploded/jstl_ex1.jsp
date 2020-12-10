<%--
  Created by IntelliJ IDEA.
  User: huaiwen
  Date: 2020/10/19
  Time: 11:21 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSLT-Ex1</title>
</head>
<body>

<h1>JSTL常用标签</h1>
<%
    String name="JSTL标签";
    request.setAttribute("name", name);
    int age = 20;
    request.setAttribute("age", age);
%>

<%--<c:out value="输出变量值为10"></c:out>--%>
<c:out value="${name}"></c:out>

<c:if test="${age>20}">你的年龄已经超过20岁，不能参加入学考试!</c:if>
<c:if test="${age<=20}">你的年龄为超过20岁，允许参加入学考试!</c:if>
</body>
</html>
