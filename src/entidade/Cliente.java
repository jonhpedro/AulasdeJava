package entidade;

public class Cliente extends Pessoa {

	private String tppagamento;
	
	
	public Cliente() {
		
	}
	
	public String getTppagamento() {
		return tppagamento;
	}
	public void setTppagamento(String tppagamento) {
		this.tppagamento = tppagamento;
	}
}
