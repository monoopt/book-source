<%@ page import="jee.ticket.domain.Ticket" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>中山领航科技有限公司客服系统</title>
</head>
<body>

<h2>票据列表</h2>
<a href="/ticketAppDemo/ticket?action=create">添加新票据</a><br /><br />
<hr>
<table border="1" cellspacing="0">
    <tr>
        <th>序號</th>
        <th>票据Id</th>
        <th>企业名</th>
        <th>总金额</th>
        <th>主题</th>
        <th>类型</th>
        <th>提交时间</th>
        <th>主要内容</th>
        <th>操作</th>
    </tr>

</table>

<hr>@zsc 电子科技大学中山学院 计算机学院 班级:xxx, 学号:xx, 姓名:xxx  <p></p>
</body>
</html>
