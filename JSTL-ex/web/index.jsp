<%--
  Created by IntelliJ IDEA.
  User: huaiwen
  Date: 2020/10/19
  Time: 6:33 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    request.setAttribute("msg", "hello world");
    int age=40;
    request.setAttribute("age", age);
  %>
  <h2> ${msg}</h2>
  <c:out value="${msg}"></c:out>
  <c:if test="${msg eq 'hello world'}">
    <p>与字符串hello不相同!<br>
  </c:if>

  <c:if test="${age eq 40}">
    <p>age=40</p>
  </c:if>
  ${age==40?'年龄为40岁':"年龄不符合要求"}
  </body>
</html>
