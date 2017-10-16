<jsp:include page="header.jsp" />
<div class="container" style="padding-top: 2%;">
	<div class="jumbotron text-center">
		<fieldset>
			<legend>Dados do Contato</legend>
			<table class="table table-stripped">
				<thead>
					<tr>
						<th class="text-center">#</th>
						<th class="text-center">Nome</th>
						<th class="text-center">Email</th>
						<th class="text-center">Telefone</th>
					</tr>
				</thead>
				<tbody>
					<tr>
					<!-- EL - Expression Language -->
						<td>${requestScope.contato.id}</td>
						<td>${requestScope.contato.nome}</td>
						<td>${requestScope.contato.email}</td>
						<td>${requestScope.contato.telefone}</td>
					</tr>
				</tbody>
			</table>
		</fieldset>
	</div>
</div>
<jsp:include page="footer.jsp" />