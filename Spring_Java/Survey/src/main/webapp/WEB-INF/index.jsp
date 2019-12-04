<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>Document</title>
    <style>
    *{
    	font-family:Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
    }
    body{
        font-size: 250%;
    }
    #container{
        padding-left: 650px;
    }
    #buttom{
        width: 400px;
        height: 50px;
    }
    #Commit{
        width: 500px;
        height: 100px;
        position:relative;
        margin-top: 10px;
        border:1px solid black;
    }
    #com{
        width: 500px;
        height: 200px;
    }
    select{
        width: 150px;
        height: 30px;
    }
    #l_d{
        padding-top: 40px;
    }
    input{
        border: none;
    }
    </style>
</head>
<body>
    <div class="container">
        <h1>DoJo Survey</h1>
        <h3>Create a User</h3>
            <form action='/proccess' method='POST'>
	            <p>Your name: <input class="form-control" type='text' name='name'></p>
	            	            
	            <div class = "form-group">
	               <label>DoJo locations:</label>
	                <select class="form-control" type='text' name='locations'>
	                    <option value="San Jose">San Jose</option>
	                    <option value="Oakland">Oakland</option>
	                    <option value="Denver">Denver</option>
	                    <option value="Seattle">Seattle</option>
	                </select>
	            </div>	        
	            
	            <div id="l_d">
                    <label>Favorite language:</label>
                     <select class="form-control" type='text' name='language'>
                         <option value="Python">Python</option>
                         <option value="JavaScript">JavaScript</option>
                         <option value="Objective">Objective</option>
                         <option value="C++">C++</option>
                     </select>
                 </div>
                 
	            <div id="com">
	            	<p>Comment(Optional):</p>
	            	<textarea class="form-control" id="exampleFormControlTextarea1" name='comment' rows="3"></textarea>
	            </div>
	            
	            <input id ="buttom" type="submit" class="btn btn-dark" value = "Create">
        	</form>
    </div>
</body>
</html>