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
				<c:forEach items="${recipe}" var="recipe">
					<div class = "col-sm-6 col-md-3" style = "padding-bottom: 15px">
						<div class = "thumbnail">
							<div class = "caption">
								<h3>${recipe.name}</h3>
								<p>${recipe.description}</p>
								<p>Cena: ${recipe.price} zł</p>
								<p>Czas przygotowania: ${recipe.preparationTime}</p>
								<p>${recipe.serving}</p>
								<p>
									<a href=" <spring:url value="/recipes/recipe?id=${category}"/>" class = "btn btn-primary">
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
