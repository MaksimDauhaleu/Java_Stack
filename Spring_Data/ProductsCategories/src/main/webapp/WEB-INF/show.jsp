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
	<div class = "container">
	<h1>Products</h1>
    <table class = table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Description</th>
                <th>Price</th>
                <th>Category Count</th>
            </tr>
        </thead>
        <tbody>
			<c:forEach items="${products}" var="product">
       			<tr>
		        	<td><c:out value="${product.name}"/></td>
		            <td><c:out value="${product.description}"/></td>  
		            <td><c:out value="${product.price}"/></td>   
		            <td><c:out value="${product.id}"/></td>    
       			 </tr>
   			</c:forEach>
        </tbody>
    </table>
</div>
	
	<div class = "container">
		<h1>Categories</h1>
		<div>
    <table class = "table">
        <thead>
            <tr>
                <th>Category Name</th>
                <th>Product Count</th>
                
            </tr>
        </thead>
        <tbody>
         	<c:forEach items="${categories}" var="category">
       			<tr>
		        	<td><c:out value="${category.name}"/></td>
		            <td><c:out value="${category.id}"/></td>  		             
       			 </tr>
   			</c:forEach>
        </tbody>
    </table>
</div>
	</div>
</body>
</html>