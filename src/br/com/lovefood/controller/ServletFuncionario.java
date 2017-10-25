package br.com.lovefood.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/func/buscar", "/func/excluir", "/func/salvar" })
public class ServletFuncionario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    private static final String PREFIX = "/func/";
    
	public ServletFuncionario() {
        super();
     }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getServletPath().equals(PREFIX + "buscar")) {
			response.getWriter().append("buscar");
		}else if(request.getServletPath().equals(PREFIX + "excluir")) {
			response.getWriter().append("excluir");
		}else { 		
			response.getWriter().append("URL Não encontrada!");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
