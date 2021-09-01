package Heranca_01;

public class Gerente extends Funcionario {
	int senha;

	public Gerente() {
		super();   // chamada do método construtor da classe mãe
	}

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public String toString() {
		return "Gerente [senha=" + senha + "] - " + super.toString();
	}

}
