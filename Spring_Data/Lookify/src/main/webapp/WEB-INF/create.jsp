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

<nav id = "nas" class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="/dashboard">Lookify</a>
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/songs/new">Add New<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/search/topTen">Top Songs</a>
      </li>
       <li class="nav-item active">
        <a class="nav-link" href="/search/topSingers">Top 1000<span class="sr-only">(current)</span></a>
      </li>
    </ul>
    
    <form action="/searchArt" method="post" class="form-inline my-2 my-lg-0">
      <input name="artist" class="form-control mr-sm-2" type="search" placeholder="Artist" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
    
  </div>
</nav>



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