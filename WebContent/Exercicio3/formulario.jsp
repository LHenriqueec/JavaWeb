<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulário de Atributo</title>
</head>
<body>

	<form action="/JavaWeb/ProcessaSession" method="post">

		<table>
			<tr>
				<td><label>Atributo:</label></td>
				<td><input type="text" name="atributo" /></td>
			</tr>
			<tr>
				<td><label>Valor:</label></td>
				<td><input type="text" name="valor" /></td>
			</tr>
			<tr><td colspan="2" align="right"><input type="submit" value="Enviar" /> </td></tr>
		</table>

	</form>

</body>
</html>