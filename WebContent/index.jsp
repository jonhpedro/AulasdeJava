<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="description" content="loveFood loja virtual de restaurantes" />
<link rel="stylesheet" href="resources/css/bootstrap.min.css" />
<title>LoveFood</title>
</head>
<style>
	
	#cep{
		width:100%;
		margin:0px 0px 0px 500px;
	}	
	#enviar{
		margin:-34px 0px 0px 910px;
	}
	#submit{
		margin:0px 0px 0px 200px;	
	}
	#search{
		margin:0px 0px 0px 200px;	
	}
	.form-control{
		margin:0px 0px 0px 300px;
	}
	
</style>
<body>
	<div class="container-fluid">
		<div class="col-xs-12">
			<nav class="navbar navbar-inverse">
			  <div class="container-fluid">
			    <div class="navbar-header">
			      <a class="navbar-brand" href="#">LoveFood</a>
			    </div>
			    <ul class="nav navbar-nav">
			      <li><a href="cardapio.jsp">Cardápio</a></li>
			      <li><a href="#">Cadastro</a></li>
			    </ul>
			    <form class="navbar-form navbar-left">
			      <div class="col-xs-12">
			        <input id="search" type="text" class="form-control"  placeholder="Search">
			         <button id="submit" type="submit" class="btn btn-default">Submit</button>
			      </div>
			     
			    </form>
			  </div>
			</nav>
		</div>
		<div class="col-xs-12">
			<form class="form-group">
			  <input type="text" class="form-control" id="cep" placeholder="Digite Seu Cep">			 
			  <button id="enviar" type="button" class="btn btn-danger">Enviar</button>
			</form>
		</div>
	</div>
</body>
</html>