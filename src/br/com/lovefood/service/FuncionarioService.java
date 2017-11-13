package br.com.lovefood.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.lovefood.entity.Funcionario;
import br.com.lovefood.persistence.FuncionarioDAO;

public class FuncionarioService {

	private FuncionarioDAO dao;

	public FuncionarioService() {
		dao = new FuncionarioDAO();
	}
	
	public Funcionario efetuaLogin(Funcionario funcionario) {
		try {
			return dao.efetuarLogin(funcionario);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
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
	
	public Boolean excluir(Long id) {
		try {
			dao.delete(id);
			return Boolean.TRUE;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return Boolean.FALSE;
	}
	
	public List<Funcionario> buscar() {
		try {
			return dao.findAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new ArrayList<Funcionario>();
	}
	
	public List<Funcionario> buscarPorNome(String nome) {
		try {
			return dao.findByName(nome);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new ArrayList<Funcionario>();
	}
	
	public Funcionario buscarPorId(Long id) {
		try {
			return dao.findById(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Funcionario();
	}

	public Boolean atualizaNivel(Funcionario f) {
		try {
			dao.updateNivel(f);
			return Boolean.TRUE;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Boolean.FALSE;
	}
	
	public Boolean atualizaSenha(Funcionario f) {
		try {
			dao.updateSenha(f);
			return Boolean.TRUE;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Boolean.FALSE;
	}
}
