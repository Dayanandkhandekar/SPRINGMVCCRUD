<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>  

<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List</title>
    <style>
    body{
        background-color: beige;
        text-align: center;
        }
        table {
            margin: auto;
            width: 100%;
            border-collapse: collapse;
            background-color: white;
            border-color: black;
            margin-top: 50px;
        }
        th, td {
            border: 1px solid Grey;
            padding: 10px;
            text-align: left;
            color: black;
            background-color: white;
            
        }
        th{
         background-color:gray;
         color:white;
         text-align: center;
         border-color: black;
        }
        h1 {
            background-color: cyan  ;
            color: black;
            padding: 20px;
            text-align: center;
            font-size: large;
            font-style:inherit;
        }
        a {
	   color: red;
}
    </style>

</head>
<body>
    <h1> List</h1>
    <table border="1">
        <tr>
            <th>UserID</th>
            <th>UserName</th>
            <th>Email</th>
            <th>Password</th>
            <th>Password_Confirm</th>
            <th>Action</th>
        </tr>
        <c:forEach var="reg" items="${reg}">
            <tr>
                <td>${reg.userID} </td>
                <td>${reg.username} </td>
                <td>${reg.email} </td>
                <td>${reg.password} </td>
                <td>${reg.password_confirm}</td>
                <td>
                    <a href="edit/${reg.userID}">Edit</a>
                    <a href="delete/${reg.userID}">Delete</a>
                                   
                 </td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>