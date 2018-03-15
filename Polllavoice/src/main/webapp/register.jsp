<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form:form id="regForm" modelAttribute="user" action="registerProcess" method="post">
<table align="center">
<tr>
  <td>
  <form:label path="username">Username</form:label>
  </td>
  <td>
  <form:input path="username" name="username" id="username" />
  </td>
</tr>
<tr>
  <td>
  <form:label path="firstname">FirstName</form:label>
  </td>
  <td>
  <form:input path="firstname" name="firstname" id="firstname" />
  </td>
</tr>
<tr>
  <td>
  <form:label path="lastname">LastName</form:label>
  </td>
  <td>
  <form:input path="lastname" name="lastname" id="lastname" />
  </td>
</tr>
<tr>
  <td>
  <form:label path="password">Password</form:label>
  </td>
  <td>
  <form:password path="password" name="password" id="password" />
  </td>
</tr>
<tr>
  <td>
  <form:label path="confirmpassword">ConfirmPassword</form:label>
  </td>
  <td>
  <form:input path="confirmpassword" name="confirmpassword" id="confirmpassword" />
  </td>
</tr>
<tr>
  <td>
  <form:label path="email">Email</form:label>
  </td>
  <td>
  <form:input path="email" name="email" id="email" />
  </td>
</tr>

<tr>
  <td>
  <form:label path="phone">Phone</form:label>
  </td>
  <td>
  <form:input path="phone" name="phone" id="phone" />
  </td>
</tr>
<tr>
  <td>
  <form:button id="register" name="register">Register</form:button>
  </td>
</tr>
<tr>
 <td><a href="home.jsp">Home</a>
 </td>
</tr>
</table>
</form:form>
</body>
</html>