// 1.Fa�a um programa que receba quatro 
// n�meros inteiros, calcule e mostre a soma desses n�meros.
import java.util.Scanner;  // Importando a Classe Scanner
public class Lista_01_01 {
	public static void main(String[] args) {
		int n1, n2, n3, n4;
		Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner
		System.out.print("1o. N�mero: ");
		n1 = meuScanner.nextInt();
		System.out.print("2o. N�mero: ");
		n2 = meuScanner.nextInt();
		System.out.print("3o. N�mero: ");
		n3 = meuScanner.nextInt();
		System.out.print("4o. N�mero: ");
		n4 = meuScanner.nextInt();
		System.out.println("Soma: "+ (n1+n2+n3+n4));
	}
}
