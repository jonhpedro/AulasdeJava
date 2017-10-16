<jsp:include page="header.jsp" />
<div class="container" style="padding-top: 2%;">
	<div class="jumbotron text-center">
		<fieldset>
				<legend>Formulário Contato</legend>
			<form action="cadastrar" method="post">
				<div class="form-group">
					<label for="id_name">Nome</label> <input type="text" id="id_name"
						class="form-control" placeholder="Nome" name="nome">
				</div>
				<div class="form-group">
					<label for="id_mail">Email</label> <input type="email" id="id_mail"
						class="form-control" placeholder="E-mail" name="email">
				</div>
				<div class="form-group">
					<label for="id_tel">Telefone</label> <input type="tel" id="id_tel"
						class="form-control" placeholder="Telefone" name="telefone">
				</div>
				<button type="submit" id="btn" class="btn btn-primary">Enviar</button>
				<button type="reset" id="btn"  class="btn btn-primary">Limpar</button>
			</form>
		</fieldset>
	</div>
</div>
<jsp:include page="footer.jsp" />