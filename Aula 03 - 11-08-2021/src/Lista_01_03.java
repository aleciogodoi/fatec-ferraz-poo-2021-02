//3.Faça um programa que receba três notas e 
//seus respectivos pesos, calcule e mostre a média ponderada.
import java.util.Scanner;  // Importando a Classe Scanner
public class Lista_01_03 {

	public static void main(String[] args) {
		float n1, n2, n3 ;
		float p1, p2, p3;
		Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner	
		System.out.print("Nota 1: ");
		n1 = meuScanner.nextFloat();
		System.out.print("Peso 1: ");
		p1 = meuScanner.nextFloat();
		
		System.out.print("Nota 2: ");
		n2 = meuScanner.nextFloat();
		System.out.print("Peso 2: ");
		p2 = meuScanner.nextFloat();

		System.out.print("Nota 3: ");
		n3 = meuScanner.nextFloat();
		System.out.print("Peso 3: ");
		p3 = meuScanner.nextFloat();
		
		System.out.printf("%s%2.1f", "Média Ponderada: " , 
				((n1*p1 + n2*p2 + n3*p3) / (p1+p2+p3)) );	

	}

}
