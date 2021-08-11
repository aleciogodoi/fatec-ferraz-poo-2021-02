
import java.util.Scanner;  // Importando a Classe Scanner
public class Exemplo_If {

	public static void main(String[] args) {
		float n1, n2, n3, media;
		Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner	
		System.out.print("Nota 1: ");
		n1 = meuScanner.nextFloat();
		System.out.print("Nota 2: ");
		n2 = meuScanner.nextFloat();
		System.out.print("Nota 3: ");
		n3 = meuScanner.nextFloat();
		
		media = (n1+n2+n3)/3;
		System.out.println("Média: "+ media );		
		System.out.printf("%s%2.1f", "Média: " , media);	
		
		if (media >= 6) {
			System.out.println("\nAluno Aprovado!");
		} else {
			System.out.println("\nAluno Reprovado!");
		}
	}

}
