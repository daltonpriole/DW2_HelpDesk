<%@ page language="java"
	import="dw2.loja.modelo.Usuario"
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
		content="text/html; charset=ISO-8859-1">
<title>Loja</title>
</head>
<body>
Seja bem vindo, ${usuario.login}
<h1>Produtos:</h1>
<table border=1>
<tr>
<td>Código</td>
<td>Descrição</td>
<td>Preço</td>
</tr>
<c:forEach var="produto" items="${produtos}">
<tr>
<td>${produto.codigo}</td>
<td>${produto.descricao}</td>
<td>${produto.preco}</td>
<td><a href=controle?comando=AdicionarProduto&codigo=${produto.codigo}>Adicionar</a></td>
</tr>
</c:forEach>
</table>

<h1>Carrinho:</h1>
<table border=1>
<tr>
<td>Código</td>
<td>Descrição</td>
<td>Preço</td>
</tr>
<c:forEach var="produto" items="${carrinho.produtos}">
<tr>
<td>${produto.codigo}</td>
<td>${produto.descricao}</td>
<td>${produto.preco}</td>
<td><a href=controle?comando=RemoverProduto>Remover</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>


