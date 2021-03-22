<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>

<%
    String msg = (String) request.getAttribute("msg");
    if (msg != null)
        out.println(msg);
%>

</body>
</html>
