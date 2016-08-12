<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Softblue: Elei��o</title>

</head>

<body>
	<c:url var="inicio" value="/" />
	<c:url var="registrar_candidato" value="Cadastro_Candidato.jsp" />
	<c:url var="cargos" value="ListarCargos.action"/>

	<h1 align="center">Exerc�cio Softblue: Hibernate</h1>

	<div align="right">
		<a href="${inicio}">In�cio</a>
	</div>

	<a href="${cargos}">Visualizar Cargos</a>
	<br>
	<br>
	<a href="${registrar_candidato}">Registrar Candidato</a>
	<br>
	<br>

	<table align="center" border="1" width="100%">
		<thead>
			<tr>
				<td align="center">Candidato</td>
				<td align="center">Votos</td>
			</tr>
		</thead>

		<tbody>
			<c:if test="${empty votos}">
				<tr>
					<td colspan="2" align="center">Nenhum registro encontrado</td>
				</tr>
			</c:if>
			
			<c:forEach var="voto" items="${votos}">
				<tr>
					<td>${voto.getNome()}</td>
					<td>${voto.getVotos()}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>