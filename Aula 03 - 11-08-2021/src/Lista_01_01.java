// 1.Faça um programa que receba quatro 
// números inteiros, calcule e mostre a soma desses números.
import java.util.Scanner;  // Importando a Classe Scanner
public class Lista_01_01 {
	public static void main(String[] args) {
		int n1, n2, n3, n4;
		Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner
		System.out.print("1o. Número: ");
		n1 = meuScanner.nextInt();
		System.out.print("2o. Número: ");
		n2 = meuScanner.nextInt();
		System.out.print("3o. Número: ");
		n3 = meuScanner.nextInt();
		System.out.print("4o. Número: ");
		n4 = meuScanner.nextInt();
		System.out.println("Soma: "+ (n1+n2+n3+n4));
	}
}
