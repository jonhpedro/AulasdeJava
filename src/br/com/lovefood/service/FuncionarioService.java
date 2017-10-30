package br.com.lovefood.service;

import java.sql.SQLException;

import br.com.lovefood.entity.Funcionario;
import br.com.lovefood.persistence.FuncionarioDAO;

public class FuncionarioService {

	private FuncionarioDAO dao;

	public FuncionarioService() {
		dao = new FuncionarioDAO();
	}

	public Boolean salvar(Funcionario f) {
		try {
			dao.save(f);
			return Boolean.TRUE;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return Boolean.FALSE;
	}
	
	public String excluir(Long id) {
		return "Excluido com sucesso!";
	}
}
