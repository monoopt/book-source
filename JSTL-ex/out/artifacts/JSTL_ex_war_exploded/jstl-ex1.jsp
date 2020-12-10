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
    <title>JSTL基本用法1</title>
</head>
<body>
<%
    String item = "菜单3: c:url标签的使用";
    request.setAttribute("item3", item);
%>
<h3>c:out标签的使用</h3>
<ul>
    <li> <c:out value="菜单1：c:out标签的使用"></c:out></li>
    <li> <c:out value="菜单2: c:set标签使用"></c:out></li>
    <li> <c:out value="${item3}"></c:out></li>
</ul>
<hr>
<h3>c:set标签的使用</h3>
<c:set var="fruit" value="苹果"></c:set>
<p> 1.使用c:out的输出,水果为：<c:out value="${fruit}"></c:out></p>
<p> 2.使用EL表达式的输出,水果为：${fruit}</p>

</body>
</html>
