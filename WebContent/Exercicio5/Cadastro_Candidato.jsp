<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Candidato</title>
</head>
<body>

	<h1 align="center">Cadastro de Candidato</h1>

	<form action="CadastrarCandidato.action" method="post">
		<table>
			<tr>
				<td><label>Nome:</label></td>
				<td><input type="text" name="nome" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<select name="id_cargo">
						<c:forEach var="car" items="${cargos}">
							<option  value="${car.getId()}">${car.getNome()}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="Salvar" /></td>
			</tr>
		</table>
	</form>
</body>
</html>