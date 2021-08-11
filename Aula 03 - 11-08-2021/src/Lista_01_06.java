/*
6. Faça um programa que receba o salário base de um funcionário, 
calcule e mostre o salário a receber, sabendo-se que o funcionário 
tem gratificação de 5% sobre o salário base e paga imposto de 7% 
sobre este salário.
 */
import java.util.Scanner;
public class Lista_01_06 {
	public static void main(String[] args) {
		float salario, gratificacao = 5, imposto = 7;
		float vlGratificacao, vlImposto;
		Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner	

		System.out.print("Salário: ");
		salario = meuScanner.nextFloat();

		vlGratificacao  = salario * gratificacao / 100;
		vlImposto  = salario * imposto / 100;
		System.out.printf("%s%.2f\n", "Salário Base....: ", salario);
		System.out.printf("%s%.2f\n", "% Gratificação..: ", gratificacao);
		System.out.printf("%s%.2f\n", "Vl. Gratificação: ", vlGratificacao);
		System.out.printf("%s%.2f\n", "% Imposto.......: ", imposto);
		System.out.printf("%s%.2f\n", "Vl. Imposto.....: ", vlImposto);
		System.out.printf("%s%.2f\n", "Salário Liquido.: ", (salario + vlGratificacao - vlImposto));
	
	}
}
