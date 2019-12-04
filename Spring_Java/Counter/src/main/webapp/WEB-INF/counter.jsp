<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Counter</title>
</head>
<body>
	<h1>Counter : <c:out value="${count}"/></h1>
	<a type = "submit" href = "/reset" >Reset</a>
	<a type = "submit" href = "/counter" >Add One</a>
	<a type = "submit" href = "/counterTwo" >Add Two</a>
</body>
</html>