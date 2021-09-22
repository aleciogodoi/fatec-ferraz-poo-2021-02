package Exemplo_Sobrecarga;

public class Main {
	public static void main(String[] args) {
		System.out.println(Operacao.soma(5, 7));
		System.out.println(Operacao.soma(5.2, 7.7));
		System.out.println(Operacao.soma("olá ", "mundo!"));
		System.out.println(Operacao.soma(5));
		System.out.println(new Operacao().toString());
	}
}
