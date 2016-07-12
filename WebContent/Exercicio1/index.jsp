<%@page import="java.util.TreeMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Set"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.util.Properties"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exercício 1</title>
</head>
<body>
	
	<%!
		Map<String, Object> map;
	%>
	
	<%
		map = (TreeMap<String, Object>) request.getAttribute("atributos");
	%>
	
	<a href="/web/Exercicio1/formulario.jsp">Novo atributo</a><br>
	<table border="1" width="100%">
		<thead>
			<tr align="center">
				<td><strong>Chave</strong></td>
				<td><strong>Valor</strong></td>
			</tr>
		</thead>
		<tbody>
		<% for (Map.Entry<String, Object> entry : map.entrySet()) { %>
			<tr align="center">
				<td><%=entry.getKey() %></td>
				<td><%=entry.getValue() %></td>
			</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>