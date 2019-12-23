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
	body,
		html {
			margin: 0;
			padding: 0;
			height: 100%;
			background: #68D962 !important;
			font-family: fangsong;
		}
		.user_card {
			height: 505px;
			width: 350px;
			margin-top: auto;
			margin-bottom: auto;
			background: rgba(0,0,0,0.5);
			position: relative;
			display: flex;
			justify-content: center;
			flex-direction: column;
			padding: 10px;
			box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
			-webkit-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
			-moz-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
			border-radius: 5px;

		}
		.brand_logo_container {
			position: absolute;
			height: 50px;
			width: 200px;
			top:-100px;
			background: #68D962;
			text-align: center;
		}
		.form-control{
			border-radius: 2px;
		}
		.brand_logo {
			height: 55px;
		}
		.form_container {
			margin-top: 10px;
		}
		.login_btn {
			width: 100%;
			background: #866695 !important;
			color: white !important;
			border-radius: 2px;
		}
		.login_btn:focus {
			box-shadow: none !important;
			outline: 0px !important;
		}
		label{
			color:white;
		}
		p{
			color:white;
		}
		font{
		color:red;
		}
	
	</style>
</head>
<body>
<div class="container h-100">
		<div class="d-flex justify-content-center h-100">
			<div class="user_card">
				<div class="d-flex justify-content-center">
					<div class="brand_logo_container">
						<a href = "/"><img src="images/1.png" class="brand_logo" alt="Logo"></a>
					</div>
					<p><font><c:out value="${error}" /></font></p>
				</div>
				<div class="d-flex justify-content-center form_container">
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
		
				<div class="mt-4">
					<div class="d-flex justify-content-center links">
						<p>Don't have an account?</p>
						<a href="#" class="ml-2">Sign Up</a>
					</div>
					<div class="d-flex justify-content-center links">
						<a href="#">Forgot your password?</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>