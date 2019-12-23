
<!DOCTYPE html>
<html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<head>
	<title>My Awesome Login Page</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP" crossorigin="anonymous">
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
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
			height: 400px;
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
					<form method="post" action="/login">
						<div class="form-group mb-3">	
							<label for="exampleInputEmail1">Email</label>				
						  	<input class="form-control" type="text" id="email" name="email"/>
						</div>
						<div class="form-group mb-2">
							<label for="exampleInputEmail1">Password</label>	
					        <input class="form-control" type="password" id="password" name="password"/>
						</div>				
						<div class="d-flex justify-content-center mt-3 login_container">
				 			<input type="submit"  class="btn login_btn" value = 'Login'>
			   			</div>
					</form>
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
	<footer class="page-footer">
  <!-- Copyright -->
  <div class="footer-copyright text-center py-3"><font>© 2018 Copyright:</font>
    <a href="https://mdbootstrap.com/education/bootstrap/"> maks-projects.com</a>
  </div>
  <!-- Copyright -->

</footer>
</body>
</html>
