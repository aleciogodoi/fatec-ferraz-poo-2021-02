package Heranca_01;

public class Gerente extends Funcionario {
	private int senha;

	public Gerente() {
		super();   // chamada do m�todo construtor da classe m�e
	}

	public Gerente(String nome, String cpf, double salario, int pass) {
		// chamada do m�todo construtor da classe m�e
		super(nome, cpf, salario);
		this.senha = pass;
	}

	@Override
	public String toString() {
		return "Gerente [senha=" + senha + "] - " + super.toString();
	}

	public boolean autentica(int pass) {
		if (senha == pass)
			System.out.println("Autenticado!");
		else 
			System.out.println("Senha Inv�lida!");
		return true;
	}
}
