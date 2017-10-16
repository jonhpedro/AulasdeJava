package entidade;

public class Produto {

	private Long id;
	private String nmProduto;
	private String Descpord;
	private Double preco;
	private Integer qtd;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	
	public  void setId(Long id ) {
		this.id = id;
	}
	
	public String getnmProduto() {
		return nmProduto;
	}
	
	public  void setnmProduto(String nmProduto ) {
		this.nmProduto = nmProduto;
	}
	
	public String getDescpord() {
		return Descpord;
	}
	
	public  void setDescprod(String Descpord ) {
		this.Descpord = Descpord;
	}
	public Double getPreco() {
		return preco;
	}
	
	public  void setPreco(Double preco ) {
		this.preco = preco;
	}
	
	public Integer getQtd() {
		return qtd;
	}
	
	public  void setQtd(Integer qtd ) {
		this.qtd = qtd;
	}
	
}
