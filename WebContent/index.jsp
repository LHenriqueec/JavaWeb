<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Exercícios</title>
</head>
<body>

<c:url var="Exercicio1_JSP" value="Lista" />
<c:url var="Exercicio1_Session" value="Exercicio1/Session/email.jsp" />
<c:url var="Exercicio2_EL_JSTL" value="Lista2" />
<c:url var="Exercicio2_EL_JSTL2" value="Exercicio2/email.jsp" />

<h1 align="center">ESCOLHA UM EXERCÍCIO</h1>

	<a href="${Exercicio1_JSP}">Utilizando arquivos JSP</a>
	<br>
	<br>
	<a href="${Exercicio1_Session}">Trabalhando com Session</a>
	<br>
	<br>
	<a href="${Exercicio2_EL_JSTL}">Utilizando arquivos JSP com EL e JSTL</a>
	<br>
	<br>
	<a href="${Exercicio2_EL_JSTL2}">Trabalhando com Session, EL e JSTL</a>
</body>
</html>