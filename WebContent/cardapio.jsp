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
	.form-group{
		margin:200px 0px 0px 60px;
	}
	.cep{
		margin:300px 0px 0px 60px;
	}
	
	#cep{
		width:400px;
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
		margin:0px 0px 0px 20px;
	}
	#botao{
		margin:20px 0px 0px 500px;
		
	}
	#reset{
		margin:20px 0px 0px 0px;
	}
</style>
<body>
	<div class="container-fluid">
		<div class="col-xs-12">
			<nav class="navbar navbar-inverse">
			  <div class="container-fluid">
			    <div class="navbar-header">
			      <a class="navbar-brand" href="index.jsp">LoveFood</a>
			    </div>
			    <ul class="nav navbar-nav">
			      <li><a href="#">Cardápio</a></li>
			      <li><a href="#">Cadastro</a></li>
			    </ul>
			    <form class="navbar-form navbar-left">
			      <div class="col-md-4">
			        <input id="search" type="text" class="form-control"  placeholder="Search">
			      </div>
			      <button id="submit" type="submit" class="btn btn-default">Submit</button>
			    </form>
			  </div>
			</nav>
		</div>
	
		<div class="col-md-10">
			<form class="form-group">
			  <label for="nome">Name:</label>
			  <input type="text" class="form-control" id="nome">
			  <label for="endereco">Endereço:</label>
			  <input type="text" class="form-control" id="endereco">
			  <label for="telefone">Telefone:</label>
			  <input type="tel" class="form-control" id="tel">
			  <button id="botao" type="submit" class="btn btn-success">Enviar</button>
			  <button id="reset" type="reset" class="btn btn-primary">Apagar</button>
			</form>
		</div>
	</div>
</body>
</html>