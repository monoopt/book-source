<%@ page import="entity.Student" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSTL基本用法3</title>
</head>
<body>

<%
    String[] names = {"张三丰", "李斯", "司马迁", "吕蒙"};
    List list = Arrays.asList(names);
    request.setAttribute("list", list);
%>
<h3>1.c:forEach标签基本用法</h3>

<c:forEach var="name" items="${list}">
    姓名: ${name}<br/>
</c:forEach>

<p> 2. c:forEach遍历Map</p>
<%
	Map<String,String> students = new HashMap<String,String>();
	students.put("2020001", "zhangSan");
	students.put("2020002", "LiSi");
	students.put("2020003", "ZhaoWu");
	students.put("2020004", "Wangliu");
	pageContext.setAttribute("students", students);
%>
    <c:forEach var="item" items="${students}">
    学号:${item.key}: 姓名: ${item.value} <br/>
    </c:forEach>
<hr>
<p> 3. c:forEach生成表格</p>
<%
    Random random = new Random();
    List studentList = new ArrayList<Student>();
    for (int i=0; i<10; ++i){
        Student student = new Student("苏珊"+i, random.nextInt()%10+20, random.nextInt()%2);
        studentList.add(student);
    }
    request.setAttribute("studentList", studentList);
%>
<table  cellspacing="0" border="1">
    <thead>
    <th>序号</th><th>姓名</th><th>年龄</th><th>性别</th>
    </thead>
<c:forEach var="student" items="${studentList}" varStatus="s">
    <tr><td>${s.count}</td><td>${student.name}</td><td>${student.age}</td>
        <td>
            ${student.sex== 1 ? '男生': '女生'}
        </td></tr>
</c:forEach>
</table>
<hr>
</body>
</html>
