<jsp:include page="header.jsp"/>

	<div class="container">
		<div class="jumbotron text-center">
			<h1>Formulário Java</h1> 
			<div class="col-xs-12">
                    <form action="resposta.jsp" method="POST"  name="cadastro">
                        <div class="form-group">
                            <label>Nome:</label>
                            <input type="text" name="nome" id="nome" class="form-control" placeholder="Digite seu Nome">
                        </div>
                         <section class="form-group">
                            <label>E-mail:</label>
                            <input type="email" name="email" id="email" class="form-control" placeholder="Digite seu E-mail">
                        </section>
                        <div class="form-group">
                            <label>Telefone:</label>
                            <input type="tel" name="tel" id="tel" class="form-control" placeholder="Digite seu Telefone">
                        </div>
                                             
                        
                    	<div>
                            <input type="submit" name="Enviar" id="btn" class="btn btn-primary">
                            <input type="reset" name="Cancelar" id="btn" class="btn btn-primary">
                        </div>
                    </form>
              </div>
		</div>
	</div>
	
<jsp:include page="footer.jsp"/>	
	