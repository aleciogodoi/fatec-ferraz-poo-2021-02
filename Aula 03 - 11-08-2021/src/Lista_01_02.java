//2.Fa�a um programa que receba tr�s notas, 
//calcule e mostre a m�dia aritm�tica entre elas.
import java.util.Scanner;  // Importando a Classe Scanner
public class Lista_01_02 {

	public static void main(String[] args) {
		float n1, n2, n3 ;
		Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner	
		System.out.print("Nota 1: ");
		n1 = meuScanner.nextFloat();
		System.out.print("Nota 2: ");
		n2 = meuScanner.nextFloat();
		System.out.print("Nota 3: ");
		n3 = meuScanner.nextFloat();
		System.out.println("M�dia: "+ ((n1+n2+n3)/3) );		
		System.out.printf("%s%2.1f", "M�dia: " , ((n1+n2+n3)/3));		
	}

}
