package Exemplo_Sobrecarga;

public class Operacao {
    // Sobrecarga - é um tipo polimorfismo
	public static int soma(int a) {
		return 2*a;
	}
	public static int soma(int a, int b) {
		return a + b;
	}
	public static double soma(double a, double b) {
		return a + b;
	}
	public static String soma(String a, String b) {
		return a + b;
	}
	public static float soma(float a, int b) {
		return a + b;
	}	
	public static float soma(int a, float b) {
		return a + b;
	}
	
	public static int soma(int[] n) {
		int total=0;
		for (int i=0; i < n.length; i++) 
			total+=n[i];
		return total;
	}
	// Sobrescrita
	@Override
	public String toString() {
		return "Classe Operações";
	}
}
