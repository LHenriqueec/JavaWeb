<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar novo parametro</title>
</head>
<body>
	<form action="/web/Gravar2" method="post">
		<label>Chave:</label><input name="chave" type="text" />
		<br><br>
		<label>Valor:</label><input name="valor" type="text" />
		<button type="submit">Salvar</button>
	</form>
</body>
</html>