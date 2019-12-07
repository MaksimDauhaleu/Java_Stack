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
	span{
		color:black;
		font-size:100%;
	}
	
	.table{
		margin-top:20px;
	}
</style>
</head>
<body>
	<table class="table">
    <thead class="thead-dark">
        <tr>
            <th scope="col">Title</th>
            <th scope="col">Artist</th>
            <th scope="col">Ranking</th>
            <th scope="col">Options</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${songs}" var="song">
        <tr>
            <td><c:out value="${song.title}"/></td>
            <td><c:out value="${song.artist}"/></td>
            <td><c:out value="${song.rating}"/></td>
  			<td>
  				<a href="#">
          			<span class="glyphicon glyphicon-backward"></span>
        		</a>
  				<a href="#">
          			<span class="glyphicon glyphicon-stop"></span>
        		</a>
  				<a href="#">
          			<span class="glyphicon glyphicon-play"></span>
        		</a>
        		<a href="#">
          			<span class="glyphicon glyphicon-next"></span>
        		</a>
  			</td>
        </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>