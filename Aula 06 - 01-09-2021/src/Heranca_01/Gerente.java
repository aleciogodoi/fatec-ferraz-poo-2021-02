package Heranca_01;

public class Gerente extends Funcionario {
	int senha;

	public Gerente() {
		super();   // chamada do m�todo construtor da classe m�e
	}

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public String toString() {
		return "Gerente [senha=" + senha + "] - " + super.toString();
	}

}
