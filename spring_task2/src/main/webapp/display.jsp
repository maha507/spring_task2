<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
<tr>
<th>Id</th>
<th>Name</th>
<th>Mobile</th>
<th>Mail</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<c:forEach var="user" items="${list}">
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.mobile}</td>
        <td>${user.mail}</td>
        
        
		<td><a href="edit?id=${user.id}">edit</a>
		
		<td><a href="delete?id=${user.id}">delete</a>
    </tr>
</c:forEach>



</table>
</body>
</html>