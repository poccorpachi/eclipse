<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bienvenida a la plataforma</title>
</head>
<body>
	<h1>bienvenido a la plataforma </h1>
	<p><strong>Sistemas</strong>jsp y servlet</p>
	<p>usuario registrado</p>
	<!-- -aqui colocamos el codigo jsp para que muestre el ususario -->
	<!-- -que aqui viene servlet -->	
	<%= request.getAttribute("usuarioLogueado") %>
</body>
</html>