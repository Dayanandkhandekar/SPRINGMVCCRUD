<%@page import="java.util.ArrayList"%>
<%@page import="com.employeelist.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Information List</title>
<style >
body {
            font-family: Arial, sans-serif;
            background-color: gray;
            margin: 10px;
            padding: 10px;
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
            border-color:black;
            background-color: olive;
            
        }
        th, td {
            border: 1px solid light Grey;
            text-align: center;
            padding: 10px;
        }
        th {
            background-color: aqua;
        }

</style>
</head>
<body>
<h1>Employee Information List</h1>
    <table border="1">
        <tr>
            <th>Employee ID</th>
            <th>Employee Name</th>
            <th> Employee Salary</th>
            <th>Action</th>
            
        </tr>
        <%
        ArrayList employees = (ArrayList)request.getAttribute("employees");
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = (Employee) employees.get(i);
        %>
        <tr>
            <td><%= employee.getEmpID() %></td>
            <td><%= employee.getEmpName() %></td>
            <td><%= employee.getEmpSalary() %></td>
          
            
        </tr>
        <%
        }
        %> 
    </table>
</body>
</html>