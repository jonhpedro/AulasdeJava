package br.com.lovefood.entity;

public class Cliente extends Usuario {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cpf;
	
	/** Considerando um �nico endere�o e at� 03 telefones. **/
	private String endereco;
	/* Em Java vira classe e o objeto em cliente � singular 
	 * Em BD vira tabela com relacionamento 1-1
	 */ 
	private String telefone;
	/* Em Java vira classe e o objeto em cliente � uma lista 
	 * Em BD vira tabela com relacionamento 1-n
	 */ 
	/** -x- -x- -x- **/
	
	// segura ctrl e aperta o espa�o
	public Cliente() {

	}

	/* segura (alt + shift + s), apos abrir o menu apertar o R */
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
