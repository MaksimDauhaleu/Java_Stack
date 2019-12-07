<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 

   
<h1><c:out value="${book.title}"/></h1>

<p>Description: <c:out value="${book.description}"/></p>

<p>Language: <c:out value="${book.language}"/></p>
	
<p>Number of pages: <c:out value="${book.numberOfPages}"/></p>

<a href="/books/${book.id}/edit">Edit Book</a>

<a href = "/books/${book.id}/delete">Delete</a>