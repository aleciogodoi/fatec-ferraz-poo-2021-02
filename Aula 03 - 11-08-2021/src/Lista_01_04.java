/*
4.Fa?a um programa que receba o sal?rio de um funcion?rio, 
calcule e mostre o novo sal?rio,
sabendo-se que este sofreu um aumento de 25%.
*/
import java.util.Scanner;  // Importando a Classe Scanner
public class Lista_01_04 {

	public static void main(String[] args) {
		float salario;
		Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner	

		System.out.print("Sal?rio: ");
		salario = meuScanner.nextFloat();
		
		System.out.printf("%s%5.2f", "Sal?rio + 25%: " , 
				(salario * 1.25f ) );		
	}

}
