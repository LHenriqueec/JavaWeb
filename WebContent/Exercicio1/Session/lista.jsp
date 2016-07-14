<%@page import="exercicio.entity.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Atributos</title>
</head>
<body>

<%! Usuario usuario; %>

<% usuario = (Usuario) session.getAttribute("usuario"); %>

<table border="1" width="100%">
	<thead>
		<tr>
			<td align="center">Email</td>
			<td align="center">Nome</td>
			<td align="center">Telefone</td>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td align="center"><%=usuario.getEmail() %></td>
			<td align="center"><%=usuario.getNome() %>/</td>
			<td align="center"><%=usuario.getTelefone() %></td>
		</tr>
	</tbody>
</table>
	<a href="/web/Exercicio1/Session/email.jsp">Inicio</a>

</body>
</html>