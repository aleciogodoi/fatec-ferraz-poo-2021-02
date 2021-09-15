public class Funcionario extends Pessoa{
	// Atributos
	private Data dtAdmissao;
	private float salario;
	// Construtores
	public Funcionario() {
	}
	public Funcionario(String nome, String identidade, Data dtNascimento,
					   Data dtAdmissao, float salario) {
		super(nome, identidade, dtNascimento);
		this.dtAdmissao = dtAdmissao;
		this.salario = salario;
	}
	// Getters e Setters
	public Data getDtAdmissao() {
		return dtAdmissao;
	}
	public void setDtAdmissao(Data dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Funcionario [dtAdmissao=" + dtAdmissao + ", salario=" + salario + " - " + super.toString() +"]" ;
	}
	
}
