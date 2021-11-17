import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		int opcao = 0;
		AgendaTarefa agenda = new AgendaTarefa();
		
		do {
			opcao = menu();
			switch (opcao) {
			case 1:
				agenda.adicionar();
				break;
			case 2:
				try {
					System.out.println(agenda.consultar().toString());
				} catch (TarefaException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				agenda.listar();
				break;
			}
			
		} while(opcao!=0);
		System.out.println("\nF I M");
	}
	public static int menu() {
		int opcao = 9;
		Scanner scan = new Scanner(System.in);
		
		String menu = "1 - Adicionar\n"
					+ "2 - Consultar\n"
					+ "3 - Listar\n"
					+ "0 - Sair\n"
					+ "Opcao: ";
		
		System.out.print(menu);
		try {
			opcao = scan.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Opcao Incorreta!");
		}
		return opcao;
	}
}
