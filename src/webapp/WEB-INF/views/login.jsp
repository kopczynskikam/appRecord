

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Zaloguj</title>
</head>
<body>
<form:form method="post" modelAttribute="user" cssClass="some-class">

  <form:select path="nameOrgan"><br/>
    <form:option value="-" label="--Proszę wybrać--"/>
    <form:options items="${nameOrgan}" />
  </form:select>
  <form:input path="firstName"/> <br/>
  <form:input path="lastName"/> <br/>
  <form:input path="nrEtitliments"/><br/>
  <input type="submit"/>
</form:form>
</body>
</html>
