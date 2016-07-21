<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de E-mail</title>
</head>
<body>

	<form action="/web/Processar2" method="post">
	<input type="hidden" name="pagina" value="email">
		<table>
			<tr>
				<td><label>E-mail:</label></td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="Próximo"></td>
			</tr>
			
		</table>
	</form>

</body>
</html>