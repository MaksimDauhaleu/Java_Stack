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
	<form:form action = "/post/createNinja" method = "post" modelAttribute="ninja">
		<form:errors path="ninja.*" />
		<div class="form-group">
		    <form:label path="firstName">First Name:</form:label>		   
			<form:select path = "dojo">
				<c:forEach items="${dojos}" var="dojo">
    				<form:option value="${dojo.id}"><c:out value="${dojo.name}"/></form:option>
    			</c:forEach>
			</form:select>  
		</div>
		<div class="form-group">
		    <form:label path="firstName">First Name:</form:label>		   
		    <form:input path="firstName" type="text" class="form-control" id="exampleFormControlInput1" placeholder="First Name" />
  		</div>
  		<div class="form-group">
		    <form:label path="lastName">Last Name:</form:label>		   
		    <form:input path="lastName" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Last Name" />   		
  		</div>
  		<div class="form-group">
		    <form:label path="age">Age:</form:label>		   
		    <form:input path="age" type="number" class="form-control" id="exampleFormControlInput1" placeholder="Age" />
  		</div>
	    <input class="btn btn-secondary" type="submit" value="Create"/>	 
	</form:form>
	</div>
</body>
</html>