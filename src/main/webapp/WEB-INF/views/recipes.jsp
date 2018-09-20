<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
		<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
		<title>Cookbook - przepisy</title>
	</head>
	<body>
		<section>
			<div class="jumbotron">
				<div class="container">
					<h1> Przepisy </h1>
					<p> Wszystkie dostępne przepisy ! </p>
				</div>
			</div>
		</section>
		<section class = "container">
			<div class = "row">
				<div class="col-md-5">
				</div>
				<c:forEach items="${recipe}" var="recipe">
					<div class = "col-sm-6 col-md-3" style = "padding-bottom: 15px">
						<div class = "thumbnail">
						
							<img src="<c:url value="/resource/images/1.jpg"></div></c:url>"
							alt="image" style="width:100%"/>
							<div class = "caption">
								<h3>${recipe.name}</h3>
								<p>${recipe.description}</p>
								<p>Cena: ${recipe.price} zł</p>
								<p>Czas przygotowania: ${recipe.preparationTime}</p>
								<p>Danie dla: ${recipe.serving} osób</p>
								<p>
									<a href=" <spring:url value="/recipes/recipe?id=${recipe.recipeId}"/>" class = "btn btn-primary">
										<span class="glyphicon-info-sign glyphicon"></span> Szczegóły
									</a>
								</p>	
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</section>
	</body>
</html>
