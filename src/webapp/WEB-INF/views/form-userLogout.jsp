<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wyloguj</title>
</head>
<body>
    <form action="<c:url value="user/logout"/>" method="post">
        <input  type="submit" value="Logout">
    </form>
</body>
</html>


