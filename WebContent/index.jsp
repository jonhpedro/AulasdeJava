<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<meta charset="utf-8">

<title>loveFood | Delivery de restaurantes</title>
<meta name="generator" content="Senac Rio" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="description" content="loveFood loja virtual de restaurantes" />

<!-- CSS -->
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet" href="resources/css/estilo.css">

<!--[if lt IE 9]>
          <script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

<!-- Favicon -->
<link rel="icon" href="resources/img/favicon.png" />
<link rel="apple-touch-icon" href="">
<link rel="apple-touch-icon" sizes="72x72"
	href="resources/img/favicon.png">
<link rel="apple-touch-icon" sizes="114x114"
	href="resources/img/favicon.png">
</head>
<body>

	<!-- Body -->
	<div id="wrap">
		<!-- Banner -->
		<header class="masthead"
			style="background-image: url('resources/img/capa.jpg'); background-size: 100%">
			<div class="container">
				<div class="row">
					<div class="col-sm-6">
						<h1>
							<a href="#" title="Bootstrap Template"> <img id="logo"
								alt="loveFood | Restaurantes Delivery"
								src="resources/img/logo.png" width="380">
							</a>
							<p id="txtLogo" class="lead">
								<em>Restaurantes Delivery</em>
							</p>
						</h1>
					</div>
					<!-- Menu Logado -->
					<div class="col-sm-6" style="display: block;">
						<div class="pull-right  hidden-xs">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><h3>
									<i class="glyphicon glyphicon-cog"></i>
								</h3></a>

							<ul class="dropdown-menu">
							<c:choose>
									<c:when test="${true}">
										<li><a href="#"><i
												class="glyphicon glyphicon-chevron-right"></i> Entrar</a></li>
									</c:when>
									<c:otherwise>
										<li><a href="#"><i class="glyphicon glyphicon-user"></i>
												Perfil</a></li>
										<li><a href="#"><i
												class="glyphicon glyphicon-shopping-cart"></i> Carrinho</a></li>
										<li><a href="#"><i class="glyphicon glyphicon-lock"></i>
												Sair</a></li>
									</c:otherwise>
								</c:choose>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</header>

		<!-- Fixed navbar -->
		<div class="navbar navbar-custom navbar-inverse navbar-static-top"
			id="nav">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-collapse">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
				</div>
				<div class="collapse navbar-collapse">
					<ul class="nav navbar-nav nav-justified">
						<li class="active"><a href="#">Home</a></li>
						<li><a href="#section1">Cardápio</a></li>
						<li><a href="#section2">Promoções</a></li>
						<li><a href="#section3">Junte-se</a></li>
						<li><a href="#section4">Sobre</a></li>
						<li><a href="#section5">Contato</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown">Culinária <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">Japonesa</a></li>
								<li><a href="#">Italiana</a></li>
								<li><a href="#">Árabe</a></li>
								<li><a href="#">Mais..</a></li>
							</ul></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
			<!--/.container -->
		</div>
		<!--/.navbar -->

		<!-- Begin page content -->
		<div class="divider" id="section1"></div>

		<div id="teste" div class="container">
			<div class="col-sm-10 col-sm-offset-1">
				<div class="page-header text-center">
					<h1>Lorem Ipsum</h1>
				</div>

				<p class="lead text-center">O que é Lorem Ipsum?.</p>
				<p class="text-center">Lorem Ipsum é simplesmente uma simulação
					de texto da industria tipografica e de impressos, e vem sendo
					utilizado desde o século XVI, quando um impressor desconhecido
					pegou uma bandeja de tipos e os embaralhou para fazer um livro de
					modelos de tipos. Lorem Ipsum sobreviveu nÃ£o sÃ³ a cinco sÃ©culos,
					como tambÃ©m ao salto para a editoraÃ§Ã£o eletrÃ´nica, permanecendo
					essencialmente inalterado. Se popularizou na dÃ©cada de 60, quando
					a Letraset lanÃ§ou decalques contendo passagens de Lorem Ipsum, e
					mais recentemente quando passou a ser integrado a softwares de
					editoraÃ§Ã£o eletrÃ´nica como Aldus PageMaker.</p>
			</div>
		</div>

		<div class="divider" id="section2"></div>

		<section class="bg-1">
			<div class="col-sm-6 col-sm-offset-3 text-center">
				<h2 style="padding: 20px; background-color: rgba(5, 5, 5, .8)">Aprecie
					as culinárias do mundo</h2>
			</div>
		</section>

		<div class="divider"></div>

		<div class="container" id="section3">
			<div class="col-sm-8 col-sm-offset-2 text-center">
				<h1>Petiscos</h1>

				<p>Instead of creating a unique version of the webpage for each
					desktop, mobile &amp; tablet, you can now create one design that
					works on all devices, browsers &amp; resolutions. Your designs will
					be future ready when a new table or phone size comes in the market,
					your designs will adapt itself and fit to the new screen size.</p>

				<hr>

				<img
					src="https://cesaradames.files.wordpress.com/2012/06/boteco-do-kabec3a7a.jpg"
					class="img-responsive">

				<hr>
			</div>
			<!--/col-->
		</div>
		<!--/container-->

		<div class="divider"></div>

		<section class="bg-3" id="section4">
			<div class="col-sm-6 col-sm-offset-3 text-center">
				<h2 style="padding: 20px; background-color: rgba(5, 5, 5, .8)">CulinÃ¡ria
					Vegana &amp; Fitness</h2>
			</div>
		</section>

		<div class="continer bg-4">
			<div class="row">
				<div class="col-sm-4 col-xs-6">

					<div class="panel panel-default">
						<div>
							<img src="resources/img/a_mineira.png" class="img-responsive">
						</div>
						<div class="panel-body">
							<p class="lead">Ã Mineira Gourmet</p>
							<p>PromoÃ§Ã£o 80% de desconto</p>

							<p>
								<span class="glyphicon glyphicon-shopping-cart"
									style="width: 28px; height: 28px" aria-hidden="true"></span>
							</p>
						</div>
					</div>
					<!--/panel-->
				</div>
				<!--/col-->

				<div class="col-sm-4 col-xs-6">

					<div class="panel panel-default">
						<div class="panel-thumbnail">
							<img src="resources/img/a_mineira.png" class="img-responsive">
						</div>
						<div class="panel-body">
							<p class="lead">Ã Mineira Gourmet</p>
							<p>PromoÃ§Ã£o 80% de desconto</p>

							<p>
								<span class="glyphicon glyphicon-shopping-cart"
									style="width: 28px; height: 28px" aria-hidden="true"></span>
							</p>
						</div>
					</div>
					<!--/panel-->
				</div>
				<!--/col-->

				<div class="col-sm-4 col-xs-6">

					<div class="panel panel-default">
						<div class="panel-thumbnail">
							<img src="resources/img/a_mineira.png" class="img-responsive">
						</div>
						<div class="panel-body">
							<p class="lead">Ã Mineira Gourmet</p>
							<p>PromoÃ§Ã£o 80% de desconto</p>

							<p>
								<span class="glyphicon glyphicon-shopping-cart"
									style="width: 28px; height: 28px" aria-hidden="true"></span>
							</p>
						</div>
					</div>
					<!--/panel-->

				</div>
				<!--/col-->
			</div>
			<!--/row-->
		</div>
		<!--/container-->

		<div class="divider" id="section5"></div>

		<div class="row">

			<h1 class="text-center">Veja os restaurantes mais prÃ³ximos de
				vocÃª!</h1>

			<div id="map-canvas"></div>

			<hr>

			<div class="col-sm-8">

				<div class="row form-group">
					<div class="col-xs-3">
						<input type="text" class="form-control" id="firstName"
							name="firstName" placeholder="Primeiro nome" required>
					</div>
					<div class="col-xs-3">
						<input type="text" class="form-control" id="middleName"
							name="firstName" placeholder="Nome do Meio" required>
					</div>
					<div class="col-xs-4">
						<input type="text" class="form-control" id="lastName"
							name="lastName" placeholder="Ãltimo Nome" required>
					</div>
				</div>
				<div class="row form-group">
					<div class="col-xs-5">
						<input type="email" class="form-control" name="email"
							placeholder="Email" required>
					</div>
					<div class="col-xs-5">
						<input type="email" class="form-control" name="phone"
							placeholder="Telefone" required>
					</div>
				</div>
				<div class="row form-group">
					<div class="col-xs-10">
						<input type="homepage" class="form-control" placeholder="Pergunta"
							required>
					</div>
				</div>
				<div class="row form-group">
					<div class="col-xs-10">
						<button class="btn btn-default pull-right">Contate-nos</button>
					</div>
				</div>

			</div>
			<div class="col-sm-3 pull-right">

				<address>
					<strong>Senac NiterÃ³i</strong><br> Rua Almirante TeffÃ©, 680<br>
					Centro, NiterÃ³i - RJ, 24030-085<br>
					<span class="glyphicon glyphicon-phone-alt" aria-hidden="true"></span>
					<a href="tel:2132141717">(21) 3214-1717</a>
				</address>

				<address>
					<strong>Email Us</strong><br> <a
						href="mailto:cristiano.costa@rj.senac.br">Cristiano Costa</a><br>Coordenador
					de TI
				</address>
			</div>

		</div>
		<!--/row-->

		<div class="container">
			<div class="col-sm-8 col-sm-offset-2 text-center">
				<h2>Turma 2016.5 - Java Web Applications</h2>

				<hr>
				<h4>Projeto modelo de uma loja virtual.</h4>
				<p>
					Para ver o cÃ³digo fonte desse projeto <a
						href="http://github.com/lpjunior/senacniteroi2016.5.5/tree/loveFood">
						acesse</a> o link.
				</p>
				<hr>
				<ul class="list-inline center-block">
					<li><a href="http://facebook.com/bootply"><img
							src="/assets/example/soc_fb.png"></a></li>
					<li><a href="http://twitter.com/bootply"><img
							src="/assets/example/soc_tw.png"></a></li>
					<li><a href="http://google.com/+bootply"><img
							src="/assets/example/soc_gplus.png"></a></li>
					<li><a href="http://pinterest.com/in1"><img
							src="/assets/example/soc_pin.png"></a></li>
				</ul>

			</div>
			<!--/col-->
		</div>
		<!--/container-->

	</div>
	<!--/wrap-->

	<div id="footer">
		<div class="container">
			<p class="text-muted">
				Senac Rio <span style="color: orangered !important;">|</span>
				Unidade NiterÃ³i <a href="rj.senac.br">Visite</a>
			</p>
		</div>
	</div>

	<ul class="nav pull-right scroll-top">
		<li><a href="#" title="Scroll to top"><i
				class="glyphicon glyphicon-chevron-up"></i></a></li>
	</ul>

	<script type='text/javascript'
		src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<script type='text/javascript'
		src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script type='text/javascript'
		src="http://maps.googleapis.com/maps/api/js?sensor=false&extension=.js&output=embed"></script>
	<script type='text/javascript' src="resources/js/main.js"></script>

	<div class="ad collapse in">
		<button class="ad-btn-hide" data-toggle="collapse" data-target=".ad">&times;</button>
		<script async type="text/javascript"
			src="//cdn.carbonads.com/carbon.js?zoneid=1673&serve=C6AILKT&placement=bootplycom"
			id="_carbonads_js"></script>
	</div>
</body>
</html>