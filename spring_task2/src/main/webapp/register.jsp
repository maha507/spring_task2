<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="save" modelAttribute="user">
Id:<form:input path="id" />
name:<form:input path="name"/>
mobile:<form:input path="mobile"/>
mail:<form:input path="mail"/>

<input type="submit">


</form:form>
</body>
</html>