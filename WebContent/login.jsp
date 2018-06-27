<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Projeto ADS HelpDesk</title>
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
	      <a class="navbar-brand" href="Index.jsp">System Call</a>
	      <H2>ENTRE COM SEU LOGIN</H2>
	    </div>
	    <div class="collapse navbar-collapse" id="myNavbar">
	      <ul class="nav navbar-nav">
	      	<li><a href="login.jsp">Login</a></li>
	        <li><a href="Chamado.jsp">Chamado</a></li>
			<li><a href="Contato.jsp">Contato</a></li>
	      </ul>
	    </div>
	  </div>
	</nav>
	<br>
	<br>
	<br>
	
	<div class="container-fluid" id='formulario'>
		<form method=post action=controle>
			<div class="form-group">
				<label class="col-sm-2 control-label">Login: </label>
				<div class="col-sm-10">
					<input type=text name=login> <br>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Senha:</label>
				<div class="col-sm-10">
					<input type=password name=senha>
				</div>
			</div>
			${mensagem}
			<div class="form-group">
   				<div class="col-sm-offset-2 col-sm-10">
				
					<input type=submit name=comando value=Logar>
				</div>
			</div>
		</form>
	</div>

	<!--  <form method=post action=controle>
			Login:<input type=text name=login>
		<br>
			Senha:<input type=password name=senha>
		<br>
		
		<br>
		<input type=submit name=comando value=Logar>
	</form> -->
	
</body>
</html>