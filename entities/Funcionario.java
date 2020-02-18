 package entities;

public class Funcionario {
	private String nome;
	private Integer horasTrabalhadas;
	private Double valorHora;

	public Funcionario(String nome,int horasTrabalhadas,double valorHora){
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public Integer getHorasTrabalhadas(){
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas){
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Double getValorHora(){
		return valorHora;
	}

	public void setValorHora(double valorHora){
		this.valorHora = valorHora;
	}
	
	public Double calcularSalario() {
		return this.horasTrabalhadas * this.valorHora;
	}


	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Salario: ");
		sb.append(calcularSalario() + "\n");
		sb.append("Nome Funcionario: ");
		sb.append(getNome() + "\n");
		return sb.toString();
	}
}
