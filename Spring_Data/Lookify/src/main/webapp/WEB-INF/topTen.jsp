<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script><style>
	body{
		background-color: #68D962;
		font-family:Candara;
	}
	#links{
		margin-left:70%;
	}
	a{
		font-size:140%;
		color:white;
	}
	#a-color{
	color:black;
	}
	#black{
		background-color: black;
	}
	@import url('https://fonts.googleapis.com/css?family=Gothic+A1|Kaushan+Script|Libre+Baskerville|Lobster');
.body{
	font-family: 'Gothic A1', sans-serif;
	font-size:16px;
	}
	p{
	color:#6c6c6f;
	font-size:1em;
	}
	h1,h2,h3,h4,h5,h6{color:#323233;text-transform:uppercase;}.navbar-brand  span{
	color: white;
	font-size:25px;font-weight:700;letter-spacing:0.1em;
    font-family: Candara;
}
.navbar-brand {
	color: #fff;
	font-size:25px;
    font-family: 'Kaushan Script','Helvetica Neue',Helvetica,Arial,cursive;
	font-weight:700;
	letter-spacing:0.1em;
}

.navbar-nav .nav-item .nav-link{
	padding: 1.1em 1em!important;
	font-size: 120%;
    font-weight: 500;
    letter-spacing: 1px;
    color: #fff;
   	font-family: fangsong;
}
.navbar-nav .nav-item .nav-link:hover{color:#fed136;}
.navbar-expand-md .navbar-nav .dropdown-menu{
	border-top:3px solid #fed136;
}
.dropdown-item:hover{background-color:#fed136;color:#fff;}
nav{-webkit-transition: padding-top .3s,padding-bottom .3s;
    -moz-transition: padding-top .3s,padding-bottom .3s;
    transition: padding-top .3s,padding-bottom .3s;
    border: none;
	}
	
 .shrink {
    padding-top: 0;
    padding-bottom: 0;
    background-color: rgba(0,0,0,0.7);
   	-webkit-transition: background-color 1000ms linear;
   	-ms-transition: background-color 1000ms linear;
   	transition: background-color 1000ms linear;
}
.banner{
	background-image:url('http://www.hd-freewallpapers.com/latest-wallpapers/abstract-website-backgrounds.jpg');
	text-align: center;
    color: #fff;
   
    background-repeat: no-repeat;
    background-attachment: scroll;
    background-position: center center;
    -webkit-background-size: cover;
    -moz-background-size: cover;
    -o-background-size: cover;
    background-size: cover;
}
.banner-text{
	padding:200px 0 150px 0;
}
.banner-heading{
	font-family: 'Lobster', cursive;
	font-size: 75px;
    font-weight: 700;
    line-height: 100px;
    margin-bottom: 30px;
	color:#fff;
}
.banner-sub-heading{
	font-family: 'Libre Baskerville', serif;
	font-size: 30px;
    font-weight: 300;
    line-height: 30px;
    margin-bottom: 50px;
	color:#fff;
}

.btn-banner{
	padding:5px 20px;
	border-radius:10px;
	font-weight:700;
	line-height:1.5;
	text-align:center;
	color:#fff;
	text-transform:uppercase;
}
.text-intro{
	width:90%;
	margin:auto;
	text-align:center;
	padding-top:30px;
}


/* mobile view */
@media (max-width:500px)
{
	.navbar-nav{
		background-color:#000;
		border-top:3px solid #fed136;
		color:#fff;
		z-index:1;
		margin-top:5px;
		}
	.navbar-nav .nav-item .nav-link{
	padding: 0.7em 1em!important;
	font-size: 100%;
    font-weight: 500;
    }
	.banner-text{
	padding:150px 0 150px 0;
}
.banner-heading{
	font-size: 30px;
    line-height: 30px;
    margin-bottom: 20px;
}
.banner-sub-heading{
	font-size: 10px;
    font-weight: 200;
    line-height: 10px;
    margin-bottom: 40px;
}

}

@media (max-width:768px){
	.banner-text{
	padding:150px 0 150px 0;
}
	.banner-sub-heading{
	font-size: 23px;
    font-weight: 200;
    line-height: 23px;
    margin-bottom: 40px;
}
}

.container1{
	height:500px;
	width:100%;
	background-color: #EC52A5;
}
.container2{
	height:500px;
	width:100%;
	background-color: #CDF564;
}
.container3{
	height:500px;
	width:100%;
	background-color: #ED5666;
}
.container4{
	height:200px;
	width:100%;
	background-color: black;
}
table{
	margin-top:200px;
}

</style>
</head>

<body>


<nav class="navbar navbar-expand-md navbar-dark fixed-top" id="banner">
	<div class="container">
		<a class="navbar-brand" href="/"><span><img src="https://i.ibb.co/0DdFrw6/1.png" alt="Oppps"></span></a>
  		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
   			<span class="navbar-toggler-icon"></span>
  		</button>

  <!-- Navbar links -->
	<div class="collapse navbar-collapse" id="collapsibleNavbar">
		<ul class="navbar-nav ml-auto">
	    	<li class="nav-item">
				<a class="nav-link" href="/dashboard">DashBoard</a>
			</li>
	    	<li class="nav-item">
	    		<a class="nav-link" href="/search/topTen">Top Songs</a>
			</li>
	 		<li class="nav-item">
	       		<a class="nav-link" href="/search/topSingers">Top 1000</a>
	  		</li>
	  		<li class="nav-item">
	       		<a class="nav-link">|</a>
	  		</li>
	  		<li id = "one" class="nav-item">
	       		<a class="nav-link" href="/regist">Sign Up</a>
	  		</li>
	  		<li id = "two" class="nav-item">
	       		<a class="nav-link" href="/login">Log In</a>
	  		</li>
	  		<li id = "three" class="nav-item">
	       		<a class="nav-link" href="/logout">Log Out</a>
	  		</li>
		</ul>
	</div>
	</div>
</nav>



<div class = "container">
		<table class="table table-hover table-dark">
  <thead>
        <tr>	
        	<th scope="col">Ranking</th>
            <th scope="col">Title</th>
            <th scope="col">Artist</th>
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
</div>
<script>
    $(document).on("scroll", function(){
    	if
      ($(document).scrollTop() > 86){
    	  $("#banner").addClass("shrink");
    	}
    	else
    	{
    		$("#banner").removeClass("shrink");
    	}
    });
    $( document ).ready(function() {		
		var x = ${id};
		if(x == true){
			$("#one").hide();
			$("#two").hide();
			$("#three").show();
		}else{
			$("#three").hide();
		}
	});
</script>
</body>
</html>