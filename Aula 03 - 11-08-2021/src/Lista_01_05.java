/*
5.Fa?a um programa que receba o sal?rio
de um funcion?rio e o percentual de aumento, calcule e mostre
o valor do aumento e o novo sal?rio.
*/
import java.util.Scanner;
public class Lista_01_05 {
	public static void main(String[] args) {
		float salario, percentual;
		Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner	

		System.out.print("Sal?rio: ");
		salario = meuScanner.nextFloat();
		
		System.out.print("Percentual: ");
		percentual = meuScanner.nextFloat();
		
		System.out.printf("%s%5.2f%s%.2f", "Sal?rio + ", percentual , "% = ", 
				salario+(salario * percentual / 100 ) );	
	
	}
}
