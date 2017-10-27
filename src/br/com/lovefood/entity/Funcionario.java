package br.com.lovefood.entity;

public class Funcionario extends Usuario {

	private static final long serialVersionUID = 1L;
	
	private Nivel nivel;
	
	public Funcionario() {

	}

	public Nivel getNivel() {
		return nivel;
	}


	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	
	public enum Nivel {
		ADMIN, NORMAL
	}
}
