<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Dados</title>
</head>
<body>
	
	<c:url var="email" value="Exercicio2/email.jsp" />
	
	<a href="${email}">Novo Atributo</a>
	<table width="100%" border="1"  >
		<thead>
			<tr>
				<td align="center">EMAIL</td>
				<td align="center">NOME</td>
				<td align="center">TELEFONE</td>
			</tr>
		</thead>
		<tbody>
		
			<tr>
				<td align="center">${sessionScope.usuario.getEmail()}</td>
				<td align="center">${sessionScope.usuario.getNome()}</td>
				<td align="center">${sessionScope.usuario.getTelefone()}</td>
			</tr>
		</tbody>
	</table>
	
	
</body>
</html>