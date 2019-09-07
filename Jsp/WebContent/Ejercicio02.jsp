<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>java 100% puro para codes</title>
</head>
<body>
	<p><strong>Ejercicico 02</strong></p>
	<p>hacer una jsp que liste  los 100 primeros numeros  cuadrados</p>
	<!-- incindo jsp -->
	<%
		int i=0;			
		for(i=1;i<=10;i++){		
			out.println(i+"-->>"+ (i*i) + "<br>");
	}
	%>
	<!-- terminando jsp -->
</body>
</html>