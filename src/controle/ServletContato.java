package controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidade.Contato;

@WebServlet({ "/cadastrar", "/excluir", "/buscar" })
public class ServletContato extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletContato() {
        super();
    }

    
    // Requisições via "Método GET", serão tratadas pelo método doGet
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Contato> listaContatos = new ArrayList<Contato>();
		
		listaContatos.add(new Contato());
		listaContatos.get(0).setId(new Long(new Random().nextInt(100)));
		listaContatos.get(0).setNome("Luis");
		listaContatos.get(0).setEmail("prof.lpjunior@gmail.com");
		listaContatos.get(0).setTelefone("(21) 99927-5383");
		
		listaContatos.add(new Contato());
		listaContatos.get(1).setId(new Long(new Random().nextInt(100)));
		listaContatos.get(1).setNome("Paulo");
		listaContatos.get(1).setEmail("paulo@gmail.com");
		listaContatos.get(1).setTelefone("(21) 98745-6321");
		
		listaContatos.add(new Contato());
		listaContatos.get(2).setId(new Long(new Random().nextInt(100)));
		listaContatos.get(2).setNome("João");
		listaContatos.get(2).setEmail("joao@gmail.com");
		listaContatos.get(2).setTelefone("(21) 2633-1485");
		
		request.setAttribute("contatos", listaContatos);
		request.getRequestDispatcher("contatos.jsp").forward(request, response);
	}

    // Requisições via "Método POST", serão tratadas pelo método doPost
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// criação da instancia
		Contato contato = new Contato();
		
		// atribuição dos valores ao objeto
		contato.setId(new Long(new Random().nextInt(100)));
		contato.setNome(request.getParameter("nome"));
		contato.setEmail(request.getParameter("email"));
		contato.setTelefone(request.getParameter("telefone"));
		
		// tratei a requisição adicionando o objeto
		request.setAttribute("contato", contato);
		
		// vamos encaminhar a requisição a quem de direito (contatos.jsp)
		request.getRequestDispatcher("contato.jsp").forward(request, response);
	}
}