<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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



<div class = "container">
		<table class="table table-hover table-dark">
  <thead>
        <tr>	
        	<th scope="col">Ranking</th>
            <th scope="col">Title</th>
            <th scope="col">Artist</th>
            <th scope="col">Options</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${songs}" var="song">
        <tr>
        	<td><c:out value="${song.rating}"/></td>
            <td><c:out value="${song.title}"/></td>
            <td><c:out value="${song.artist}"/></td>
        </tr>
        </c:forEach>
    </tbody>
</table>

</div>

</body>
</html>