<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dados</title>
</head>
<body>

<%String value = (String) request.getAttribute("properties");
	
	if (value == null) {
		value = "";
	}
%>

Arquivo de Propriedades
<br><br>
Chave: <input type="text" name="key">
<br>
<br>
Valor: <input type="text" name="value" value=<%=value %>>
<br>
<br>
<a href="Application"><input type="submit" method="post"></a>
</body>
</html>