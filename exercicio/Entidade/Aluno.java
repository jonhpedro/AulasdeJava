package Entidade;

public class Aluno {
	
	private String nome;
	private Integer cpf;
	private Integer matricula;
	private Double nota1;
	private Double nota2;
	private Disciplina disciplina;
	
	
	
	public Aluno() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getCpf() {
		return cpf;
	}
	
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	
	public Integer getMatricula() {
		return matricula;
	}
	
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	public Double getNota1() {
		return nota1;
	}
	
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	
	public Double getNota2() {
		return nota2;
	}
	
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	
	public Double getMedia() {
		return (nota1+nota2)/2;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
}
