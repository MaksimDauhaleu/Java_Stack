<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<div class = "container">
<h1>Dojos</h1>
<table class="table table-hover table-dark">
	<thead>
		<tr>	
        	<th scope="col">Name</th>
            <th scope="col">Id</th>

    	</tr>
	</thead>
	  <tbody>
        <c:forEach items="${dojos}" var="dojo">
        <tr>
        	<td><c:out value="${dojo.name}"/></td>
            <td><c:out value="${dojo.id}"/></td>   
        </tr>
        </c:forEach>
    </tbody>
</table>
</div>
</body>
</html>