<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
		<title>Przepisy</title>
	</head>
	<body>
		<section>
			<div class="jumbotron">
				<div class="container">
					<h1>Przepisy</h1>
					<p>Dodaj przepis</p>
				</div>
			</div>
		</section>
		<section class="container">
			<form:form modelAttribute="newRecipe" class="form-horizontal">
				<fieldset>
					<legend>Dodaj nowy przepis</legend>
					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="recipeId">
							<spring:message code="addRecipe.form.recipeId.label"/>
						</label>
						<div class="col-lg-10">
							<form:input id="recipeId" path="recipeId" type="text" class="form:input-large"/>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="name">Nazwa</label>
						<div class="col-lg-10">
							<form:input id="name" path="name" type="text" class="form:input-large"/>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-lg-2" for="description">Opis</label>
						<div class="col-lg-10">
							<form:textarea id="description" path="description" rows="2"/>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-lg-2" for="ingredients">składniki</label>
						<div class="col-lg-10">
							<form:textarea id="ingredients" path="ingredients" rows="5"/>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="preparationTime">Czas przygotowania</label>
						<div class="col-lg-10">
							<form:input id="preparationTime" path="preparationTime" type="text" class="form:input-large"/>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-lg-2 col-lg-2" for="serving">Dla ilu osób będzie posiłek?</label>
						<div class="col-lg-10">
							<form:input id="serving" path="serving" type="text" class="form:input-large"/>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-lg-2" for="category">Kategoria</label>
						<div class="col-lg-10">
							<form:radiobutton path="category" value="Sniadanie" />Sniadanie
							<form:radiobutton path="category" value="Obiad" />Obiad
							<form:radiobutton path="category" value="Kolacja" />Kolacja
						</div>
					</div>
					<div class="form-group">
						<div class="col-lg-offset-2 col-lg-10">
							<input type="submit" id="btnAdd" class="btn btn-primary" value="Dodaj"/>
						</div>
					</div>
				</fieldset>
				</form:form>
		</section>
	</body>
</html>