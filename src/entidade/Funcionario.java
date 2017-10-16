package entidade;

public class Funcionario extends Pessoa{

	private String login;
	private Integer senha;
	private Double salario;
	private String matricula;
	
	
	public Funcionario() {
		
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public Integer getSenha() {
		return senha;
	}
	public void setSenha(Integer senha) {
		this.senha = senha;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
		
	
}
