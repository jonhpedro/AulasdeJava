package br.com.lovefood.service;

import java.sql.SQLException;

import br.com.lovefood.entity.Cliente;
import br.com.lovefood.entity.Usuario;
import br.com.lovefood.persistence.UsuarioDAO;

public class UsuarioService {

	private UsuarioDAO bd;

	public UsuarioService() {
		bd = new UsuarioDAO();
	}

	public Cliente efetuaLogin(Usuario usuario) {
		try {
			return bd.efetuarLogin(usuario);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
