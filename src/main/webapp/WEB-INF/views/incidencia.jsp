<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Bootstrap icons-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" type="text/css" />
<!-- Google fonts-->
<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic"
	rel="stylesheet" type="text/css" />

<spring:url value="/resources" var="urlPublic" />
<link rel="stylesheet" href="${urlPublic}/css/styles.css">
</head>
<body>
	<!-- Navigation-->
	<jsp:include page="includes/navbar.jsp" />
	<div class="container">
		<h2>Nueva Incidencia</h2>
		<form action="">
			<div class="mb-3">
				<label for="exampleFormControlTextarea1" class="form-label">Descripción</label>
				<textarea class="form-control" id="exampleFormControlTextarea1"
					rows="3"></textarea>
			</div>
			<div class="input-group mb-3">
				<label class="input-group-text" for="inputGroupSelect01">Ubicación</label>
				<select class="form-select" id="inputGroupSelect01">
					<option selected>Choose...</option>
					<c:forEach items="${calles}" var="calle">
						<option value="${calle.id}">${calle.direccion }</option>
					</c:forEach>
				</select>
			</div>
			<a type="submit" class="btn btn-primary btn-lg">Guardar</a>
		</form>

	</div>
</body>
</html>