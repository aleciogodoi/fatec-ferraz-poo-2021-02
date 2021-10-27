package Exemplo02;
import java.io.FileNotFoundException;

public class Main {

	public static void main (String []args) {
		try {
			metodo();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		divide(5,2);
		divide(7,3);
		divide(10,0);
		System.out.println("\nF I M");
	}
	
	public static void metodo() throws FileNotFoundException {
		//try {
			new java.io.FileInputStream("C:/fatec-ferraz-poo-2021-02/READMEx.md");
		//} catch (FileNotFoundException e) {
		//	System.out.println("Arquivo não encontrado!!!");
		//	e.printStackTrace();
		//} 
	} 
	
	public static void divide(int a, int b) {
		try {
			System.out.printf("\n%d / %d = %d", a, b, (a/b));
		} catch (ArithmeticException e) {
			System.out.printf("\n");
			e.printStackTrace();
		}
	}
	
}