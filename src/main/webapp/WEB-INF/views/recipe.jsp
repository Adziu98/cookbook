<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Przepis</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Przepis</h1>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<div class="col-md-5">
				<h3>${recipe.name}</h3>
					<p>${recipe.description}</p>
					<p>Cena: ${recipe.price} z</p>
					<p>Czas przygotowania: ${recipe.preparationTime}</p>
					<p>Danie dla: ${recipe.serving} osob</p>
					<p>
						<strong>Kategoria: </strong>: ${recipe.category}
					</p>
					<p>
						<strong>Kod przepisu: </strong>: ${recipe.recipeId}
					</p>
					
					<p>
						<a href="<spring:url value="/recipes" />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span> powrot
						</a>
					</p>
			</div>
		</div>
	</section>
</body>
</html>