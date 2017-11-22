
public class Func {
	
	private final double PERCENTUAL_CUSTO = 1.8;
	private String nome;
	private double salario;
	private double custo;
	private int cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
		this.custo = salario * PERCENTUAL_CUSTO;
	}
	public double getCusto() {
		return custo;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void imprimir() {
		System.out.println(this.getNome() + " de CPF: " + this.getCpf() + " recebe um salario de " + this.getSalario() + 
				" e tem um custo de " + this.getCusto());
	}
	
	
}
