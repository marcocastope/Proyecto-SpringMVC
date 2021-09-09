<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nueva incidencia</title>
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
		<form:form action="registrarIncidencia" method="post">

			<div class="mb-3">
				<label for="exampleFormControlTextarea1" class="form-label">Descripción</label>
				<form:input class="form-control" id="exampleFormControlTextarea1"
					path="descripcion" rows="3" />
			</div>
			
			
			<div class="input-group mb-3">
				<label class="input-group-text" for="inputGroupSelect01">Ubicación</label>
				<form:select class="form-select" id="inputGroupSelect01" 
					path="calleId"  >
					
					<option selected>Seleccione</option>
					 
					<c:forEach items="${calles}" var="calle">
						<option value="${calle.calleId}">${calle.direccion }</option>
					</c:forEach>
					 
					
				</form:select>
			</div>
			 

			<button type="submit" class="btn btn-primary btn-lg">Guardar</button>
		</form:form>

	</div>
</body>
</html>