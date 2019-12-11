<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action = "/post/createDojo" method = "post" modelAttribute="name">
		<div class="form-group">
		    <form:label path="name">Name:</form:label>		   
		    <form:input path="name" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Dojo Name" />
   		    <input id="btn" type="submit" value="Create"/>	 
  		</div>
	</form:form>
</body>
</html>