/*
6. Fa�a um programa que receba o sal�rio base de um funcion�rio, 
calcule e mostre o sal�rio a receber, sabendo-se que o funcion�rio 
tem gratifica��o de 5% sobre o sal�rio base e paga imposto de 7% 
sobre este sal�rio.
 */
import java.util.Scanner;
public class Lista_01_06 {
	public static void main(String[] args) {
		float salario, gratificacao = 5, imposto = 7;
		float vlGratificacao, vlImposto;
		Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner	

		System.out.print("Sal�rio: ");
		salario = meuScanner.nextFloat();

		vlGratificacao  = salario * gratificacao / 100;
		vlImposto  = salario * imposto / 100;
		System.out.printf("%s%.2f\n", "Sal�rio Base....: ", salario);
		System.out.printf("%s%.2f\n", "% Gratifica��o..: ", gratificacao);
		System.out.printf("%s%.2f\n", "Vl. Gratifica��o: ", vlGratificacao);
		System.out.printf("%s%.2f\n", "% Imposto.......: ", imposto);
		System.out.printf("%s%.2f\n", "Vl. Imposto.....: ", vlImposto);
		System.out.printf("%s%.2f\n", "Sal�rio Liquido.: ", (salario + vlGratificacao - vlImposto));
	
	}
}
