
<%@page import="com.studentinformation.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Information</title>
    <style>
        /* Add CSS styles to enhance appearance */
        body {
            font-family: Arial, sans-serif;
            background-color: gray;
            margin: 0;
            padding: 0;
        }
        h1 {
            background-color:black;
            color: lime;
            padding: 20px;
            text-align: center;
        }
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
            background-color: white;
            box-shadow: 0 2px 6px rgba(0, 0, 0, 0.1);
        }
        th, td {
            border: 1px solid light Grey;
            text-align: left;
            padding: 10px;
        }
        th {
            background-color: aqua;
        }
    </style>

</head>
<body>
    <h1>Student Information</h1>
    <table border="1">
        <tr>
            <th>Student ID</th>
            <th>Student Name</th>
            <th> Student Age</th>
        </tr>
        <%
        ArrayList students = (ArrayList)request.getAttribute("students");
        for (int i = 0; i < students.size(); i++) {
            Student student = (Student) students.get(i);
        %>
        <tr>
            <td><%= student.getStud_ID() %></td>
            <td><%= student.getStud_Name() %></td>
            <td><%= student.getStud_Age() %></td>
        </tr>
        <%
        }
        %> 
    </table>
</body>
</html>