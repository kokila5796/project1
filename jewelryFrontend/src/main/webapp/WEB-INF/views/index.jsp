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
</head>
<body>
	<div class="main">
		<div class="page">
			<div class="header">
				<div class="banner">
					<h1>
						<center><i>HOUSEHOLD APPLIANCES</i></center>
					</h1>
				</div>
				<div class="topmenu">
					<ul>
						<li style="border-left: medium none;">
						<ul class="list-inline">
    <li><a href="#">Home</a></li>
    <li><a href="#">About us</a></li>
    <li><a href="category">category</a></li>
    <li><a href="#">product</a></li>
  
<li><a href="register">signup</a></li>
    <li><a href="login">login</a></li>
    <li><a href="#">menu</a></li>
    
						
						</ul>
						</div>
						

			<ul class="pager">
    <li class="previous"><a href="#">Previous</a></li>
    <li class="next"><a href="#">Next</a></li>
  </ul>
			<div class="content">
				<div class="content-in">
					<div class="left-panel">
						<h2>Must have</h2>
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
								<li><a href="#">filled bean bags-flat 30%</a></li>
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
							<c:if test="${category}">
								<jsp:include page="category.jsp" />
							</c:if>
							<c:if test="${home}">
                               <h2 class="title"><span>Welcome to Our <span>ShoppingCart</span></span></h2>
								<p>
									<strong> </strong> of the printing and typesetting industry. <a
										href="#">Lorem Ipsum has been</a> the industry's standard
									dummy text ever since the 1500s, when an unknown printer took a
									galley of type and scrambled it to make a type specimen book. <br>
									It has survived not only five centuries, <a href="#">but
										also the leap into electronic typesetting</a>, remaining
									essentially unchanged. It was popularised in the 1960s with the
									release of Letraset sheets containing Lorem Ipsum passages
								</p>
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