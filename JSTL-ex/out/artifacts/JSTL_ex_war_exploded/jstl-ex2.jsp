<%--
  Created by IntelliJ IDEA.
  User: huaiwen
  Date: 2020/10/21
  Time: 10:51 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSTL基本用法2</title>
</head>
<body>
<c:set var="score" value="85"></c:set>
<c:set var="sex" value="F"></c:set>
<h3>c:if标签的使用</h3>

<p> 1. 使用c:if标签，性别为:
    <c:if test="${sex == 'F'}">男性</c:if>
    <c:if test="${sex != 'F'}">女性</c:if>
</p>
<hr>

<h3>c:choose标签的使用</h3>
2.使用c:choose标签, 最终成绩${score},等级为:
<c:choose>
    <c:when test="${score > 100 || score < 0}">错误的分数：${score }</c:when>
    <c:when test="${score >= 90 }">优秀</c:when>
    <c:when test="${score >= 80 }">良好</c:when>
    <c:when test="${score >= 70 }">中等</c:when>
    <c:when test="${score >= 60 }">及格</c:when>
    <c:otherwise>不及格</c:otherwise>
</c:choose>

</body>
</html>
