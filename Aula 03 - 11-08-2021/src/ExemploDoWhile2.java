import java.util.Scanner;  // Importando a Classe Scanner
public class ExemploDoWhile2 {
	public static void main(String[] args) {
		int i=0;
		Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner
		do {
			System.out.println("N�mero:");
			i = meuScanner.nextInt();
			if (i % 2 == 0) {
				System.out.printf("i � par =%d\n", i);
			} else {
				System.out.printf("i � �mpar =%d\n", i);
			}
		} while (i!=0) ;
		
		i=1;
		while (1==1)  {
			System.out.println("N�mero:");
			i = meuScanner.nextInt();
			if (i==0)
				break;
			if (i % 2 == 0) {
				System.out.printf("i � par =%d\n", i);
			} else {
				System.out.printf("i � �mpar =%d\n", i);
			}
		}
	}
}
