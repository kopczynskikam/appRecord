<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Rejestracja nowego użytkownika</title>
</head>
<body>
Dodawanie nowego użytkownika:<br>

<form:form method="POST" modelAttribute="user">
    Imię: <form:input path="name"/><br>
    <form:errors path="name" /><br>
    Nazwisko: <form:input path="surname"/><br>
    <form:errors path="surname" /><br>
    Email: <form:input path="email"/><br>
    <form:errors path="email" /><br>
    Numer ligitymacji: <form:password type="number" path="nrEtitliments"/><br>
    <form:errors path="nrEtitliments" /><br>
    Nazwa organu: <form:input path="nameOrgan"/><br>
    <form:errors path="nameOrgan" /><br>

    <button type="submit">Stwórz konto</button>
</form:form>
</body>
</html>