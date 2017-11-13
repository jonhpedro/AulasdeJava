 package br.com.lovefood.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.lovefood.entity.Usuario;
import br.com.lovefood.service.UsuarioService;

@WebServlet({ "/sistema/login", "/sistema/logout" })
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String PREFIX = "/sistema/";

	public ServletLogin() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doRequest(request, response);
	}

	private void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getServletPath().equals(PREFIX + "login"))
			login(request, response);
		else
			logout(request, response);
	}

	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Usuario usuario = new Usuario();
		usuario.setLogin(request.getParameter("txtLogin"));
		usuario.setSenha(request.getParameter("txtSenha"));
		HttpSession session = request.getSession();

		if (new UsuarioService().efetuaLogin(usuario) != null) {
			session.setAttribute("cliente", new UsuarioService().efetuaLogin(usuario));
			response.sendRedirect("cliente/home.jsp");
		} else {
			request.setAttribute("msg", "Falha ao efetuar o login");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

	private void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("cliente");
		response.sendRedirect("../index.jsp");
	}
}
