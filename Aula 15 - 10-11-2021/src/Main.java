import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcao = 0;
		
		do {
			opcao = menu();
			switch (opcao) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			}
			
		} while(opcao!=0);
		System.out.println("\nF I M");
	}
	public static int menu() {
		int opcao = 0;
		Scanner scan = new Scanner(System.in);
		
		String menu = "1 - Adicionar\n"
					+ "2 - Consultar\n"
					+ "3 - Listar\n"
					+ "0 - Sair\n"
					+ "Opção: ";
		
		System.out.print(menu);
		opcao = scan.nextInt();
		return opcao;
	}
}
