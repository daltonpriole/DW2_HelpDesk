<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administra��o de Chamados</title>
</head>
<body>
Seja bem vindo, ${usuario.login}
<form method=get action=controle>
C�digo:<input type=text name=codigo>
<br>
Descri��o:<input type=text name=descricao>
<br>
Pre�o:<input type=text name=preco>
<br>
<input type=hidden name=comando value=CadastrarProduto>
<input type=submit value=Cadastrar>
</form>
<h1>Produtos:</h1>
<table border=1>
<tr>
<td>C�digo</td>
<td>Descri��o</td>
<td>Pre�o</td>
</tr>
<c:forEach var="produto" items="${produtos}">
<tr>
<td>${produto.codigo}</td>
<td>${produto.descricao}</td>
<td>${produto.preco}</td>
</tr>
</c:forEach>
</table>
</body>
</html>









