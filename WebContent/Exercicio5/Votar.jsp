<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Voto</title>
</head>
<body>
	<h1 align="center">Voto</h1>

	<form action="Votar.action" method="post">
		<table width="100%" border="1">
			<thead>
				<tr>
					<td align="center">Candidato</td>
					<td align="center">Cargo</td>
				</tr>
			</thead>
			
			<tbody>
				<c:if test="${empty candidatos}">
					<tr>
						<td colspan="2" align="center">Nenhum candidato registrado</td>
					</tr>
				</c:if>
				<c:forEach var="candidato" items="${candidatos}">
					<tr>
						<td align="center">${candidato.nome}</td>
						<td align="center">${candidato.cargo.nome}</td>
						<td align="center"><a href="${candidato.id}">Votar</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>