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
		Properties props = new Properties();
		Set keys;
	%>
	
	<%
		InputStream is = application.getResourceAsStream("/WEB-INF/props.txt");
		props.load(is);
		is.close();
		keys = props.keySet();
	%>
	
	
	<table border="1" width="100%">
		<thead>
			<tr align="center">
				<td><strong>Chave</strong></td>
				<td><strong>Valor</strong></td>
			</tr>
		</thead>
		<tbody>
		<% for (Object k : keys) { %>
			<tr align="center">
				<td><%=k %></td>
				<td><%=props.getProperty((String) k) %></td>
			</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>