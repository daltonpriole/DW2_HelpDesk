<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>DW2 ADS HelpDesk</title>
</head>
<body>
	   <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>                        
	      </button>
	      <a class="navbar-brand" url="/index.jsp">System Call</a>
	    </div>
	    <div class="collapse navbar-collapse" id="myNavbar">
	      <ul class="nav navbar-nav">
	        <li><a href="ListarChamados.jsp">Listar Chamado</a></li>
	        <li><a href="login.jsp">Logoff</a></li>
			<li><a href="Contato.jsp">Contato</a></li>
	      </ul>
	    </div>
	  </div>
	</nav>
	<br><br><br>
	<div class="container-fluid jumbotron" id='menu'>
		<h3>Seja bem vindo(a), ${usuario.login}</h3>
		<hr/>
		<h1>Adicionar Novo Chamado</h1>
	</div>
	<div class="container-fluid" id='formulario'>
		<form method=get action=controle>
			<div class="form-group">
				<label class="col-sm-2 control-label">Titulo: </label>
				<div class="col-sm-10">
					<input type='text' name='titulo'> <br>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Conteudo:</label>
				<div class="col-sm-10">
					<textarea name='conteudo' class="form-control" rows="3"> </textarea>
				</div>
			</div>
			<div class="form-group">
   				<div class="col-sm-offset-2 col-sm-10">
					<input type=hidden name=comando value=CadastrarChamado>
					<input type=submit value=Cadastrar>
				</div>
			</div>
		</form>

	</div>
	<div class="container-fluid jumbotron" id='menu'>
		<hr/>
		<h1>Lista de Chamados</h1>
	</div>
	<div class="container-fluid" id='listChamados'>
		<table class="table table-bordered table-striped">
			<tr>
				<td><strong>id</strong></td>
				<td><strong>Titulo</strong></td>
				<td><strong>Conteudo</strong></td>
				<td><strong>Editar</strong></td>
			</tr>
		
			<c:forEach var="chamado" items="${chamado}">
				<tr>
					<td>${chamado.id}</td>
					<td>${chamado.titulo}</td>
					<td>${chamado.conteudo}</td>
					<td><a href="EditarChamado.jsp">Edit</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>