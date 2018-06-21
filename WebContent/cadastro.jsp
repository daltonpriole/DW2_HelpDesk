<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Cadastro</title>
</head>
<body>
${mensagem}
<form method=post action=controle>
Login:<input type=text name=login>
<br>
Senha:<input type=password name=senha>
<br>
Repita a Senha:<input type=password name=senha2>
<br>
<input type=submit name=comando value=Cadastrar>
</form>
<a href=login.jsp>Login</a>
</body>
</html>