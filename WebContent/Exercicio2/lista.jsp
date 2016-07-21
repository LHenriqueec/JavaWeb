<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Exercicio 2 - EL e JSTL</title>
</head>
<body>
	
	<c:url var="novo" value="Exercicio2/cadastrar.jsp" />
	
	<a href="${novo}">Criar Novo Parametro</a>
	
	<table border="1" width="100%">
		<thead>
			<tr>
				<td align="center">Nome</td>
				<td align="center">Valor</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="p" items="${parametros}">
				<tr>
					<td align="center">${p.getKey()}</td>
					<td align="center">${p.getValue()}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>