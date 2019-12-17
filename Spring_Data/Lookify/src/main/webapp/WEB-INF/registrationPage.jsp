<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<style>
	#ag{
		margin-left: 900px;
	}
	</style>
</head>
<body>
<div class="container">
    <h1>Register</h1>
    
    <p><form:errors path="user.*"/></p>
    
    <form:form method="POST" action="/registration" modelAttribute="user">
    	<div class="form-group">
            <form:label path="name">Name:</form:label>
            <form:input class="form-control" type="text" path="name"/>
        </div>
        <div class="form-group">
            <form:label path="email">Email:</form:label>
            <form:input class="form-control" type="email" path="email"/>
        </div>
        <div class="form-group">
            <form:label path="password">Password:</form:label>
            <form:password class="form-control" path="password"/>
        </div >
        <div class="form-group">
            <form:label path="passwordConfirmation">Password Confirmation:</form:label>
            <form:password class="form-control" path="passwordConfirmation"/>
        </div>
        <input class = "btn btn-secondary" type="submit" value="Register"/>
        <a id = "ag" href = "/login">Login instead</a>
    </form:form>
</div>
</body>
</html>