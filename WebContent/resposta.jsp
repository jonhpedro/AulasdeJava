<jsp:include page="header.jsp"/>

	<div class="container">
		<div class="jumbotron text-center">
			<h1>Formulário Java</h1> 
			<div class="col-xs-12">
                    <fieldset>
                    	<legend>Dados do Usuario</legend>
                    	<table class="table table-stripped">
                    		<thead>
                    			<tr>
	                    			<th class="text-center">Nome</th>
	                    			<th class="text-center">Email</th>
	                    			<th class="text-center">Telefone</th>
                    			</tr>
                    		</thead>
                    		<tr>
	                    		<td><%=request.getParameter("nome") %></td>
	                    		<td><%=request.getParameter("email") %></td>
	                    		<td><%=request.getParameter("tel") %></td>
                    		</tr>
                    	
                    	</table>
                    </fieldset>
              </div>
		</div>
	</div>
	
<jsp:include page="footer.jsp"/>	
	