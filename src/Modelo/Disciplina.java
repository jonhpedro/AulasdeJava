package Modelo;

public class Disciplina {

	private String disciplina;
	private String ementa;
	private Integer CargaHoraria;
	private String diasemana;
	private Integer alunosInscritos;
	
		
	/* M�todo Construtor */
	
	public Disciplina() {
			
	}
	
	public Disciplina(String disciplina, String ementa, Integer CargaHoraria, String diasemana,Integer alunosInscritos) {
		
		this.disciplina = disciplina;
		this.ementa = ementa;
		this.CargaHoraria = CargaHoraria;
		this.diasemana = diasemana;
		this.alunosInscritos = alunosInscritos;
	}
	
	@Override
	public String toString(){
		return "\nOs dados informados foram:\n" 
				+ "\nDisciplina: " + disciplina 
				+ "\nEmenta: " + ementa
				+ "\nCarga Hor�ria: " + CargaHoraria 
				+ "\nDias das Aulas: " + diasemana
				+ "\nN�mero de Alunos Inscritos: " + alunosInscritos ;
		
	}
	
		/* M�todo de Inser��o */
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public void setCargaHoraria(Integer CargaHoraria ) {
		this.CargaHoraria = CargaHoraria ;
	}
	public void setDiaSemana(String diasemana ) {
		this.diasemana = diasemana ;
	}
	public void setalunosInscritos(Integer alunosInscritos ) {
		this.alunosInscritos = alunosInscritos ;
	}
	
		/* M�todo  Pegar */
		
	public String getDisciplina() {
		return disciplina;
	}
	public String getEmenta() {
		return ementa;
	}
	public Integer getCargaHoraria() {
		return CargaHoraria;
	}
	public String getDiaSemana() {
		return diasemana;
	}
	public Integer getAlunosInscritos() {
		return alunosInscritos;
	}
		
}
