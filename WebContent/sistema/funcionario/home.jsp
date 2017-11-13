<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Seja Bem vindo ao loveFood | Área do cliente</title>
</head>
<body>
	<h1>Olá ${funcionario.nome}</h1>
	<form>
		<button class="btn btn-default" formaction="../logout" formmethod="post">Sair</button>
	</form>
</body>
</html>