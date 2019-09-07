<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp-puro 100%</title>
</head>
<body>
	<p><strong>Ejercicio 01</strong></p>
	<p>hacer una paguina jsp que liste los 10 primeros numeros</p>
	<%
		int i=0;			// declarando i
	for(i=1;i<=10;i++){		//bucle de 1 hasta 10
		out.println(i+"");	//limpia en pantalla  los valores de numero "numero"
	}						//cierra bucle
	%>
</body>
</html>