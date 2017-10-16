<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
				<c:forEach var="contato" items="${requestScope.contatos}">
					<tr>
					<!-- EL - Expression Language -->
						<td>${contato.id}</td>
						<td>${contato.nome}</td>
						<td>${contato.email}</td>
						<td>${contato.telefone}</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</fieldset>
	</div>
</div>
<jsp:include page="footer.jsp" />