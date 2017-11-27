package br.com.lovefood.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.lovefood.controller.Produto;
import br.com.lovefood.entity.Funcionario;

public class ProdutoDAO extends ConectionDAO {

	private Connection conn = null;
	
	public ProdutoDAO() {
		try {
			conn = getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void save(Produto p) throws SQLException {
		PreparedStatement stmt = null;
		try {
			// se o ID estiver vazio(null), será gravado um novo funcionário
			if (p.getId() == null) {
				stmt = conn.prepareStatement("insert into funcionario values (null, ?, ?, md5(?), ?)");

				// se o ID já estiver definido(setado), será editado o funcionário
			} else {
				stmt = conn.prepareStatement("update funcionario set nome = ?, login = ? where id = ?");
			}

			stmt.setString(1, p.getNome());
			stmt.setString(2, p.getLogin());

			if (p.getId() != null) {
				// atualizar
				stmt.setLong(3, p.getId());
			} else {
				// gravar
				stmt.setString(3, p.getSenha());
				stmt.setString(4, p.getNome().toString());
			}

			int count = stmt.executeUpdate();

			if (count == 0)
				throw new SQLException("Erro ao gravar o funcionario");
		} finally {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	}
	
}
