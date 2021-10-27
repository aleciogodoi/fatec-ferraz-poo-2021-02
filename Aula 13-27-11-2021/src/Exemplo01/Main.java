package Exemplo01;

public class Main {

	public static void main(String[] args) {
		int a = 7, b=0;
		String valor = "567.52a";
		Pessoa[] pessoas = new Pessoa[5];

		System.out.printf("\na + b = %d", (a+b) );
		System.out.printf("\na - b = %d", (a-b) );
		System.out.printf("\na * b = %d", (a*b) );
		
		try {
			System.out.printf("\na / b = %d", (a/b) );
		} catch (ArithmeticException ex) {      // 
			System.out.printf("\n\nXi deu ruim!!! \nVoce tentou dividir um numero por ZERO!\n");
			System.out.printf("%s\n",ex.getMessage());
			ex.printStackTrace();
		}
		
		try {
			System.out.println(pessoas[5]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.printf("\n\nXi deu ruim!!! \nNao existe esta pessoa!\nVerifique o indice!\n");
			System.out.printf("%s\n",ex.getMessage());
			ex.printStackTrace();
		}
		
		try {
			System.out.printf("\nValor %.2f",Float.valueOf(valor));
		} catch (NumberFormatException ex) {
			System.out.printf("\n\nXi deu ruim!!! \nValor nao pode ser convertivo para Float ZERO!\n");
			System.out.printf("%s\n",ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.printf("\nF I M");
	}

}
