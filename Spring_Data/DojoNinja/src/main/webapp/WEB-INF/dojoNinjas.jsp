<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
	<table class="table table-hover table-dark">
	<h1 align = "center"><c:out value="${dojo.name}"/></h1>
	<thead>
		<tr>	
        	<th scope="col">First Name</th>
            <th scope="col">Last Name</th>
			<th scope="col">Age</th>
    	</tr>
	</thead>
	  <tbody>
	  
        <c:forEach items="${dojo.ninjas}" var="ninja">
        <tr>
        	<td><c:out value="${ninja.firstName}"/></td>
            <td><c:out value="${ninja.lastName}"/></td>   
            <td><c:out value="${ninja.age}"/></td>   
        </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>