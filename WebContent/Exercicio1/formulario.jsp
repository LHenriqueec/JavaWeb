<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!
		Set<String> keys;
		Map<String, String[]> map;
	%>

	<%
		map = request.getParameterMap();
		keys = map.keySet();
	%>

	<form action="/web/Formulario" method="post">
		<label>Nome: </label><input name="nome" type="text" /><br> <br>
		<label>Valor: </label><input name="senha" type="text" /><br> <br>
		<button type="submit">Adicionar</button>

	</form>

	<table border="1" width="100%">
		<thead>
			<tr align="center">
				<td><strong>NOME</strong></td>
				<td><strong>VALOR</strong></td>
			</tr>
		</thead>

		<tbody>
			<% for (String k : keys) { %>
			<tr align="center">
				<td><%=k %></td>
				<td><%=map.get(k)[0] %></td>
			</tr>
			<% } %>
		</tbody>
	</table>

</body>
</html>