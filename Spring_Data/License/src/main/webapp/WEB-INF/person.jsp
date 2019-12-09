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
	<form:form action = "/person" method = "post" modelAttribute="person">
  <div class="form-group">
    <form:label path="first_name" for="exampleInputEmail1">First Name</form:label>
    <form:input path="first_name" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="First name field" />
  </div>
  <div class="form-group">
    <form:label path="last_name" for="exampleInputPassword1">Last Name</form:label>
    <form:input path="last_name" type="text" class="form-control" id="exampleInputPassword1" placeholder="Last name field"/>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form:form>
</body>
</html>