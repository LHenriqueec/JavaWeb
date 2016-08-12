<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cargos Disponíveis</title>
</head>
<body>
	<c:url var="voltar" value="index.jsp" />
	<c:url var="cadastrar" value="Cadastro_Cargo.jsp"/>

	<h1 align="center">Cargos disponíveis</h1>
	
	<a href="${voltar}">Voltar</a>
	<br>
	<br>
	<a href="${cadastrar}">Cadastrar Cargo</a>
	
	<table border="1" width="100%">
		<thead>
			<tr>
				<td align="center">ID</td>
				<td align="center">Cargo</td>
			</tr>
		</thead>
		
		<tbody>
			<c:if test="${empty cargos}">
				<tr>
					<td align="center" colspan="2">Nenhum cargo cadastrado</td>
				</tr>
			</c:if>
			<c:forEach var="cargo" items="${cargos}">
				<c:url var="deletar" value="DeletarCargo.action">
					<c:param name="id">${cargo.id}</c:param>
				</c:url>
				<tr>
					<td align="center">${cargo.getId()}</td>
					<td align="center">${cargo.getNome()}</td>
					<td align="center"><a href="${deletar}">Excluir</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>