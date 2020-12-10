<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>添加票据</title>
</head>
<body>
<form method="POST" action=" ">
    <h2>添加新票据</h2>
    <!--用隐藏字段传递action的类型-->
     
    客户名称<br/>
    <input type="text" name="customerName" value="电子科技大学中山学院"><br/><br/>
    票据主题<br/>
    <input type="text" name="subject" value="2018年设备采购"><br/><br/>
    总金额<br/>
    <input type="text" name="money" value="20000"><br/><br/>
    类型<br/>
    <select  name="type">
       
    </select>
    <br/><br/>
    票据内容<br/>
    <textarea name="body" rows="5" cols="30">购买办公用品、服务器1批，共10000元...
            </textarea><br/><br/>
    <input type="submit" value="提交"/>
</form>
<p>
    <a href="/ticketAppDemo/ticket">返回票据列表</a><br /><br />
<hr>@zsc 电子科技大学中山学院 计算机学院 班级:xxx, 学号:xx, 姓名:xxx  <p></p>
</body>
</html>