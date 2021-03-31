<%--
  Created by IntelliJ IDEA.
  User: huaiwen
  Date: 2021/3/21
  Time: 10:35 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>使用EL和JSTL显示数据</title>
</head>
<body>

<div style="padding: 20px">
    <h2>使用EL和JSTL完成数据渲染</h2>
    <hr>
    <h3>1.使用JSTL的c:if条件判断</h3>

    成绩:${score},
    <c:if test="${score >=60 && score <90}">
        <span style="color: red"> 及格！</span>
    </c:if>
    <c:if test="${score >90}">
        <span style="color: green"> 优秀！</span>
    </c:if>

    <h3>2.显示对象属性</h3>
    用户名: ${user.username} <br>
    年龄: ${user.age} <br>
    城市: ${user.city} <br>
    Email地址: ${user.email} <p>


    <h3>3.显示列表</h3>
    <table border="1" cellspacing="0">
        <tr>
            <th>序号</th>
            <th>用户名</th>
            <th>email</th>
            <th>年龄</th>
            <th>城市</th>
        </tr>
        <c:forEach items="${userList}" var="user" varStatus="s">
            <tr>
                <td>${s.count}</td>
                <td>${user.username}</td>
                <td>${user.email}</td>
                <td>${user.age}</td>
                <td>
                        <%--       使用不同颜色显示城市--%>
                    <c:if test="${user.city eq '广州'}">
                        <span style="color:blue"> ${user.city}</span>
                    </c:if>
                    <c:if test="${user.city != '广州'}">
                        <span style="color:black"> ${user.city}</span>
                    </c:if>
                </td>
            </tr>
        </c:forEach>
    </table>

    <h3>4.显示集合</h3>
    商品总量为: ${productMap.size()}
    <ul>
        <c:forEach items="${productMap}" var="product" varStatus="s">
            <li>商品ID: ${product.key}, 名称：${product.value}</li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
