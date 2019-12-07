<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<style>
	body{
		background-color: #68D962;
		font-family:Candara;
	}
</style>
</head>
<body>
<div class = "container" align = "center">
<form:form action="/songs" method="post" modelAttribute="song">
  <div class="form-group">
    <form:label path="title">Title</form:label>
    <form:input path="title" type="text" class="form-control" id="exampleFormControlInput1" placeholder="RockStar" />
  </div>
    <div class="form-group">
    <label for="exampleFormControlInput1">Artist</label>
    <form:input path = "artist" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Post Malone" />
  </div>
  <div class="form-group">
    <label for="exampleFormControlSelect1">Rating</label>
    <form:select path ="rating" class="form-control" id="exampleFormControlSelect1">
      <option>1</option>
      <option>2</option>
      <option>3</option>
      <option>4</option>
      <option>5</option>
      <option>6</option>
      <option>7</option>
      <option>8</option>
      <option>9</option>
      <option>10</option>
    </form:select>
  </div>
	<button type="submit" class="btn btn-secondary">Submit</button>
</form:form>

</div>

</body>
</html>