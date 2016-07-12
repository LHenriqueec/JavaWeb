<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Propriedades</title>
</head>
<body>

	<%
		@SuppressWarnings("unchecked")
		Map<String, String> map = (Map<String, String>) request.getAttribute("props");
	%>
	
	<a href="Edit"><input type="submit" value="Novo"></a>
	<table align="center" border="true" width="100%">
		<thead>
			<tr>
				<th align="center">Propriedade</th>
				<th align="center">Valor</th>
				<th align="center" colspan="2">Opções</th>
			</tr>
		</thead>
		<tbody>
		<% for (Map.Entry<String, String> values : map.entrySet()) { %>
			<tr>
				<td align="center"><%=values.getKey() %></td>
				<td align="center"><%=values.getValue() %></td>
				<td align="center"><a href="Edit?key=<%=values.getKey()%>">Editar</a></td>
				<td align="center"><a href="Delete?key=<%=values.getKey()%>">Excluir</a></td>
			</tr>
			<%}%>
		</tbody>
	</table>
</body>
</html>