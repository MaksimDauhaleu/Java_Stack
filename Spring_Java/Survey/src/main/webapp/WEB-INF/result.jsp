<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<style>
	.container{
		font-size:200%;
		
	}
	 *{
    	font-family:Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
    }
</style>
</head>
<body>
	<div class = "container" align = "center">
		<h1 class = "title">Submitted Info</h1>
	
		<div class="form-group row">
		    <label class="col-md-2 col-form-label">Name:</label>
		    <div class="col-md-10">
	      		<input type="text" readonly class="form-control-plaintext" value="<c:out value="${name}"/>">
		    </div>
		    
	     	<label class="col-md-2 col-form-label">Location:</label>
		    <div class="col-md-10">
	      		<input type="text" readonly class="form-control-plaintext" value="<c:out value="${locations}"/>">
		    </div>
		    
	    	<label class="col-md-2 col-form-label">Language:</label>
		    <div class="col-md-10">
	      		<input type="text" readonly class="form-control-plaintext" value="<c:out value="${language}"/>">
		    </div>
		    
		    <label class="col-md-2 col-form-label">Comment:</label>
		    <div class="col-md-10">
	      		<input type="text" readonly class="form-control-plaintext" value="<c:out value="${comment}"/>">
		    </div>
	  	</div>
	</div>
</body>
</html>