import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	private static int dia;
	private static int ano;
	private static int mes;
	private static String itemDespesa;
	private static double valor;
	private static DespesaPessoal despesa;
	private Scanner meuScanner = new Scanner(System.in); 
	Main(){
		
		System.out.print("CPF: ");
		String cpf = meuScanner.next();
		despesa = new DespesaPessoal(cpf);

	}
	
	public static void main(String[] args) {	
		Main controle = new Main();
		controle.controleDespesas();
	}
	
	public void controleDespesas(){
		int opcao=0;
		String menu;
		menu = 	  "\n1 - Lançamento de despesa\n"
				+ "2 - Total geral de despesas\n"
				+ "3 - Total de despesas mês/ano\n"
				+ "4 - Total de despesas dia/mês/ano\n"
				+ "5 - Imprimir todas as despesas\n"
				+ "6 - Imprimir despesas mês/ano\n"
				+ "7 - Imprimir despesas dia/mês/ano\n"
				+ "0 - Sair";
		
		do {
			System.out.println(menu);
			System.out.print("Opção: ");
			opcao = meuScanner.nextInt();
		} while(opcao != 8);
		meuScanner.close();
		System.out.println("F I M");
	}

	public void entradaDia() {	
	}
	public void entradaMes() {	
	}
	public void entradaAno() {	
	}
}
