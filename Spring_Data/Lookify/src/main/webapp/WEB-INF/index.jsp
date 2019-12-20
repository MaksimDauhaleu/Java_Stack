<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="UTF-8">
<style>
	body{
		background-color: #68D962;
		font-family: Lucida Console, Courier, monospace;
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
	h1,h2,h3,h4,h5,h6{color:black;margin:auto;text-transform:none;margin-bottom:-5px;margin-right:25px;}.navbar-brand  span{
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
 	background-image: linear-gradient(#EC52A5, #F2A637);
}
.container3{
	height:500px;
	width:100%;
	background-image: linear-gradient(#F2A637, black);
}
.container4{
	height:200px;
	width:100%;
	background-color: black;
}
.left{
	height:100%;
	width:47%;
	display: inline-block;
	position:relative;
	top:0px;
	left:-56px;
}
.right{
	height:100%;
	width:47%;
	display: inline-block;
	position:relative;
	left:200px;
	top:-40px;
}
.search{
	padding-top:100px;
	font-family: 'Times New Roman', Times, serif;
	display:inline-block;
	width:45%;
}
#h1{
	color:black;
	text-transform: none;
}
.form-control{
 width:55%;
 border-radius:20px;
 border:none;
 text-align:center;
 font-family: 'Times New Roman', Times, serif;
}
.image{
	width:60%;
	height:60%;
	border-radius:5px;
}
#sp{
padding-bottom: 30px;

}
#s{
margin-top: 20px;
}

.most_pop{
	width:100%;
	height:13%; 
	margin-top:20px;
}
font{
color:#8086A0;
}
.sons_name{
display:inline-block;
}
.position{
display:inline-block;
}
video{
border-radius:5px;
}
</style>
</head>

<nav class="navbar navbar-expand-md navbar-dark fixed-top" id="banner">
	<div class="container">
		<a id="logo" class="navbar-brand" href="/"><span><img src="https://i.ibb.co/0DdFrw6/1.png" alt="Oppps"></span></a>
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
	    		<a class="nav-link" href="search/topTen">Top Songs</a>
			</li>
	 		<li class="nav-item">
	       		<a class="nav-link" href="/search/topSingers">Top 1000</a>
	  		</li>
	  		<li class="nav-item">
	       		<a class="nav-link">|</a>
	  		</li>
	  		<li class="nav-item">
	       		<a class="nav-link" href="/regist">Sign Up</a>
	  		</li>
	  		<li class="nav-item">
	       		<a class="nav-link" href="/login">Log In</a>
	  		</li>
		</ul>
	</div>
	</div>
</nav>


<div class="container1">
	<div class = "search" align = "center">
		<a class="navbar-brand" href="/"><span><img id = "sp" src="https://i.ibb.co/0DdFrw6/1.png" alt="Oppps"></span></a>
		<h1 id = "h1">Start listening for free</h1>
		<form action = "/searchArt" method = "post" >
		<div class="active-cyan-4 mb-4">
			<input id = "s" name = "artist" class="form-control" type="text" placeholder="Find artist,songs,podcasts and more" >
		</div>
		</form>	
	</div>
	<div class = "search" align = "center">
		<div class="active-cyan-4 mb-4">
			<img class = "image" alt="Opps" src="https://images.unsplash.com/photo-1549045508-cf64fd077a0d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1082&q=80"  >
		</div>
	</div>

</div>
<div class="container2" align = "center">


	<div class = "left" align = "center">
		<video width=100% height=100% muted = "muted" loop = "loop" autoplay="autoplay">
	 		<source src="images/video.mp4" type="video/mp4">
		</video>
	</div>
	
	
	<div class = "right" align = "left">
		<h1 id = "h1">Top Charts:</h1>
		<div class = "most_pop">
			<div class="position"><h1>1 </h1></div>
			<div class = "sons_name">
				<h4>All I Want For Christmas Is You</h4>
		
				<h6><font>Mariah Carey</font></h6>
			</div>
		</div>
		
		<div class = "most_pop">
		<div class="position"><h1>2 </h1></div>
			<div class = "sons_name">
				<h4>Circle</h4>
				<h6><font>Post Malone</font></h6>
			</div>
		</div>
		
		<div class = "most_pop">
		<div class="position"><h1>3 </h1></div>
			<div class = "sons_name">
				<h4>Rockin' Around The Christmas Tree</h4>
				<h6><font>Brenda Lee</font></h6>
			</div>
		</div>
		
		<div class = "most_pop">
		<div class="position"><h1>4 </h1></div>
			<div class = "sons_name">
				<h4>Someone You Loved</h4>
				<h6><font>Lewis Capaldi</font></h6>
			</div>
		</div>
		
		<div class = "most_pop">
		<div class="position"><h1>5 </h1></div>
			<div class = "sons_name">
				<h4>Good As Hell</h4>
				<h6><font>Lizzo</font></h6>
			</div>
		</div>	
	</div>
</div>
<div class="container3">

</div>
<div class = "container4">

</div>


</html>

<script>
    $(document).on("scroll", function(){
    	if
      ($(document).scrollTop() > 100){
    	  $("#banner").addClass("shrink");
    	  $("#logo").show();
    	}
    	
    	else
    	{
    		$("#logo").hide();
    		$("#banner").removeClass("shrink");
    	}
    });
	$( document ).ready(function() {
		$("#logo").hide();
	});
		
</script>












