package Exemplo_Sobrecarga;

public class Main {
	public static void main(String[] args) {
		System.out.println(Operacao.soma(5, 7));
		System.out.println(Operacao.soma(5.2, 7.7));
		System.out.println(Operacao.soma("olá ", "mundo!"));
		System.out.println(Operacao.soma(5));
		System.out.println(new Operacao().toString());
		
		int[] numeros = {6, 1, 100, 12, 15, -10, 32, 8, 43, 5, 21, 26};
		
		System.out.println("Total Array: "+ Operacao.soma(numeros));
	}
}
