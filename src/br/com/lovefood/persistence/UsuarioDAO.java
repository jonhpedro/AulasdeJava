package br.com.lovefood.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.lovefood.entity.Cliente;
import br.com.lovefood.entity.Usuario;

public class UsuarioDAO extends ConnectionDAO {

	private Connection conn;
	
	public UsuarioDAO() {
		try {
			conn = getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Cliente efetuarLogin(Usuario u) throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		Cliente c = null;
		
		try {
			stmt = conn.prepareStatement("select id, nome, login, cpf, endereco, telefone from cliente where login like ? and senha = md5(?)");
			stmt.setString(1, u.getLogin());
			stmt.setString(2, u.getSenha());
			
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				c = createCliente(rs);
			}
			
		}finally {
			if(conn != null)
				conn.close();
			
			if(stmt != null)
				stmt.close();
			
			if(rs != null)
				rs.close();
		}
		
		return c;
	}
	
	private Cliente createCliente(ResultSet rs) throws SQLException {
		Cliente c = new Cliente();

		c.setId(rs.getLong(1));
		c.setNome(rs.getString(2));
		c.setLogin(rs.getString(3));
		c.setCpf(rs.getString(4));
		c.setEndereco(rs.getString(5));
		c.setTelefone(rs.getString(6));

		return c;
	}
}
