<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Title goes here</title>
<meta name="description" content="Description of your site goes here">
<meta name="keywords" content="keyword1, keyword2, keyword3">
<link type="text/css" rel="stylesheet"
	href="<c:url value="resources/css/style.css"/>" />
	<style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 100%;
      margin: auto;
  }
  </style>
</head>
</head>


<body bgcolor="white" background="<c:url value="resources/images/aaa.jpg"/>">
<div class="main">
	   <div class="header">
		
		<h1>
		<img src="<c:url value="resources/images/koki.png"/>" width="" height="" align="center">
		
			</h1>
				</div>
				<div class="topmenu">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <div class="navbar-header">
      </div>
      <a class="navbar-brand" href="#">About us</a>
    
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">product<span class="caret"></span></a>
        <ul class="dropdown-menu"style=background-color:black>
          <li><a href="#">Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
       <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">menu<span class="caret"></span></a>
        <ul class="dropdown-menu"style=background-color:black>
          <li><a href="#">bed</a></li>
          <li><a href="#">bath</a></li>
          <li><a href="#">furniture</a></li>
          <li><a href="#">kids room</a></li>
          <li><a href="#">decor</a></li>
          <li><a href="#">household accessories</a></li>
        </ul>
      </li>
     
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
  			<ul class="pager">
    <li class="previous"><a href="signup"style=background-color:red>Previous</a></li>
    <li class="next"><a href="home"style=background-color:red>Next</a></li>
  </ul>
			<div class="content">
				<div class="content-in">
					<div class="left-panel">
					<h2>categories</h2>
						<h3>Must have</h3>
						<div class="left-content">
							<ul>
								<li><a href="#"> looks for your home</a></li>
								<li><a href="#"> bed sheet combos</a></li>
								<li><a href="#"> trident towels</a></li>
								<li><a href="#"> clocks under 999</a></li>
								<h2>
									<li><a href="#"><b>TOP OFFERS</b></a></li>
								</h2>
								<li><a href="#">raymond home bedsheet</a></li>
								<li><a href="#">filled bean bags-flat</a></li>
								<li><a href="#">wall stickers starting </a></li>
								<li><a href="#">esprit umbrellas</a></li>

							</ul>
						</div>
						<div class="gap"></div>
						<h2>meha brands</h2>
						<div class="left-content">
							<ol>
								<li><span><strong><a href="#">blacksmith</a></strong></span></li>
								<li><span><strong><a href="#">style
												homez</a></strong></span></li>
								<li><span><strong><a href="#">cortina</a></strong></span></li>
								<li><span><strong><a href="#">raymond
												home</a></strong></span></li>
								<li><span><strong><a href="#">bianca</a></strong></span></li>

							</ol>
						</div>
					</div>

					<div class="right-panel">

							<c:if test="${userClickedlogin}">
								<jsp:include page="login.jsp" />
							</c:if>

							<c:if test="${userClickedregister}">
								<jsp:include page="register.jsp" />
							</c:if>
							<c:if test="${userClickedcategory}">
								<jsp:include page="category.jsp" />
							</c:if>
							<c:if test="${home}">
                               <h2 class="title"><span>Welcome to Our <span>ShoppingCart</span></span></h2>
                               <style>

  </style>
</head>
<body>

<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="img_chania.jpg" alt="Chania" width="460" height="345">
      </div>

      <div class="item">
        <img src="img_chania2.jpg" alt="Chania" width="460" height="345">
      </div>
    
      <div class="item">
        <img src="img_flower.jpg" alt="Flower" width="460" height="345">
      </div>

      <div class="item">
        <img src="img_flower2.jpg" alt="Flower" width="460" height="345">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
							</c:if>
						
					</div>
				</div>

			</div>
			<!--DO NOT Remove The Footer Links-->
			<div class="footer">
				<p>
					&copy; Copyright 2014. Designed by <a target="_blank"
						href="http://www.htmltemplates.net">html templates</a>
				</p>
				<ul>
					<li style="border-left: medium none;"><a href="index.html">Home</a></li>
					<li><a href="#">About Us</a></li>
					<li><a href="#">Recent articles</a></li>
					<li><a href="#">Email</a></li>
					<li><a href="#">Resources</a></li>
					<li><a href="#">Links</a></li>
					<li><a href="#">Contact</a></li>
				</ul>
			</div>
		</div>
	</div>
  
</body>
</html>