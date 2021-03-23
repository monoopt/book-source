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
    <title>Title</title>
</head>
<body>

<h2>使用c:if标签</h2>

<%
    Double f =(Double) request.getAttribute("score");
    out.print(f);
%>

${requestScope.score}
<c:if test="${score >60}">
   成绩及格！
</c:if>

${score}
<c:if test="${score>70 && score < 80}">
    成绩中等！
</c:if>
</body>
</html>
