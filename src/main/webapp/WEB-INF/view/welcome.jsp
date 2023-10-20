
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>  

<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <%  int id = (int)request.getAttribute("ID");
String name =(String)request.getAttribute("name");

%> --%>

<h1>
 ${name}
 ${ID}
 <c:forEach var = "i" items="${list }">
         Item <c:out value = "${i}"/><p>
      </c:forEach>
</h1>
</body>
</html>