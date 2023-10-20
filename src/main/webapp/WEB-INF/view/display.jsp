
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<style>
  body {
    background-color: olive;
    text-align: center;
  }

  table {
    margin: auto;
    margin-top: 50px;
    border-collapse: collapse;
    width: 50%;
    background-color: white;
    border-color: black;
  }

  th, td {
    padding: 15px;
    text-align: left;
   color: black;
  }

  th {
    background-color:Gray;
  }
</style>
</head>
<body>
  <h1>Registration Details</h1>
  <table>
    <tr>
      <th>Field</th>
      <th>Value</th>
    </tr>
    <tr>
      <td>userID</td>
      <td>${userID}</td>
    </tr>
    <tr>
      <td>Username</td>
      <td>${username}</td>
    </tr>
    <tr>
      <td>Email</td>
      <td>${email}</td>
    </tr>
    <tr>
      <td>Password</td>
      <td>${password}</td>
    </tr>
    <tr>
      <td>Password Confirm</td>
      <td>${password_confirm}</td>
    </tr>
  </table>
</body>
</html>
