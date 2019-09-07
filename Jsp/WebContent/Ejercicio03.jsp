<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>java 100% puro para codes</title>
</head>
<body>
<p>Hacer una página JSP que muestre el resultado del 
juego 7 PUM hasta 100. El juego consiste en ir contando 
y cada vez el numero sea divisible por 7 o terminado en 7
 entonces se reemplaza por PUM y se salta de línea</p>
	<%
	
	int i=0;			
	for(i=1;i<=100;i++){		
		out.println(i<=(i*100));
}	


	%>

</body>
</html>