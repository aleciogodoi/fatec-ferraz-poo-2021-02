import java.util.Random;

public class ExemploArray {
	public static void main(String[] args) {
		String[] nomes = {"Ana","Beatriz","Carlos","Pedro"};
		System.out.println(nomes);
		System.out.println("Tamanho array: "+nomes.length);
		for(int i=0; i < nomes.length; i++)
			System.out.printf("%d-%s\n",i,nomes[i]);
		
		int[] numeros = new int[20]; // array de inteiros com tamanho de 20 elementos
		numeros[0] = 20;
		numeros[1] = 7;
		numeros[2] = 19;
		numeros[3] = 102;
		numeros[4] = 48;
		
		System.out.println(numeros[2] );
		
		Random r = new Random();
		System.out.println("\n\nN�meros Aleat�rios");
		for (int i=0; i < numeros.length; i++) {
			numeros[i] = r.nextInt(100);
			System.out.println(numeros[i]);
		}
	}

}
