package br.com.lovefood.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.lovefood.entity.Funcionario;
import br.com.lovefood.service.FuncionarioService;


@WebServlet({ "/sistema/login", "/sistema/logout" })
public class ServletLoginFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final String PREFIX = "/sistema/";
    
    public ServletLoginFuncionario() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doRequest(request,response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doRequest(request, response);
	}

	private void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if(request.getServletPath().equals(PREFIX + "loginFunc"))
			login(request,response);
		else 
			
			logout(request,response);
	}

	private void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException  {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setLogin(request.getParameter("txtLogin"));
		funcionario.setSenha(request.getParameter("txtSenha"));
		HttpSession session = request.getSession();
		
		if(new FuncionarioService().efetuaLogin(funcionario) != null) {
			session.setAttribute("funcionario", new FuncionarioService().efetuaLogin(funcionario));
			response.sendRedirect("funcionario/home.jsp");
		}else {
			request.setAttribute("msg", "Falha ao efetuar Login");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
			
	}
	
	private void logout(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException  {
		HttpSession session = request.getSession();
		session.removeAttribute("funcionario");
		response.sendRedirect("../index.jsp");
		
	}
	
}
