<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 .red-text {
    color: red;
  }
</style>
</head>

<body>
<h3>User Details Form</h3>
<form:form action="user" modelAttribute="user" method="post">
<table>
<tr>
    <td>User Name </td>
    <td><form:input path="userName"/> <form:errors path="userName" cssClass="red-text"/> </td>
</tr>
<tr>
    <td>Password </td>
    <td><form:password path="password"/> <form:errors path="password" class="red-text"/> </td>
</tr>
<tr>
    <td>Email </td>
    <td><form:input path="email"/> <form:errors path="email" class="red-text"/></td>
</tr>
<tr>
    <td>Contact </td>
    <td><form:input path="contact" min="10" max="10"/> <form:errors path="contact" class="red-text"/></td>
</tr>
<tr>
    <td>Age </td>
    <td><form:input path="age"/> <form:errors path="age" class="red-text"/></td>
</tr>
<tr>
<td></td>
<td><form:button type="submit">Submit</form:button> </td>
</tr>
</table>

</form:form>
</body>
</html>