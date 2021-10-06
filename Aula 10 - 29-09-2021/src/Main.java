import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	private static int dia;
	private static int ano;
	private static int mes;
	private static String itemDespesa;
	private static double valor;
	private static DespesaPessoal despesa;
	private static Scanner meuScanner = new Scanner(System.in); 
	Main(){		
		System.out.print("CPF: ");
		String cpf = meuScanner.next();
		despesa = new DespesaPessoal(cpf);
	}
	
	public static void main(String[] args) {	
		Main controle = new Main();
		cargaInicial();
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
			switch (opcao) {
			case 1:
				lancamento();
				break;
			case 2:
				totalGeral();
				break;
			case 3:
				totalMesAno() ;
				break;
			case 4:
				break;
			case 5:
				despesa.imprime();
				break;
			case 6:
				entradaMes();
				entradaAno();
				despesa.imprime(mes, ano);
				break;
			case 7:
				break;
			}
		} while(opcao != 0);
		meuScanner.close();
		System.out.println("F I M");
	}

	public static void lancamento() {
		System.out.println();
		entradaDia();
		entradaMes();
		entradaAno();
		meuScanner.nextLine();
		System.out.print("Despesa: ");
		itemDespesa = meuScanner.nextLine();
		System.out.print("Valor: ");
		valor = meuScanner.nextDouble();
		despesa.getDespesas().add(new Despesa(LocalDate.of(ano, mes, dia), itemDespesa, valor ));
	}
	
	public static void totalMesAno() {
		entradaMes();
		entradaAno();
		System.out.println("\n-----------------------------------------------------");
	    System.out.println("Despesas - CPF: "+despesa.getCpf());
		System.out.println("-----------------------------------------------------");
		System.out.printf("Total %s: %.2f",(mes+"/"+ano),despesa.getTotal(mes, ano));
		System.out.println("\n-----------------------------------------------------");		
	}
	
	public static void totalGeral() {
		System.out.println("\n-----------------------------------------------------");
	    System.out.println("Despesas - CPF: "+despesa.getCpf());
		System.out.println("-----------------------------------------------------");
		System.out.printf("Total Geral: %.2f",despesa.getTotal());
		System.out.println("\n-----------------------------------------------------");
	}
	public static void entradaDia() {	
		System.out.print("Dia: ");
		dia = meuScanner.nextInt();
	}
	public static void entradaMes() {	
		System.out.print("Mês: ");
		mes = meuScanner.nextInt();
	}
	public static void entradaAno() {
		System.out.print("Ano: ");
		ano = meuScanner.nextInt();
	}
	
	public static void cargaInicial() {
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 1, 1), "Mercado", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 2, 1), "Mercado", 50.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 3, 1), "Mercado", 200.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 4, 1), "Mercado", 340.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 5, 1), "Mercado", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 6, 1), "Mercado", 205.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 7, 1), "Mercado", 431.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 8, 1), "Mercado", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 9, 1), "Mercado", 222.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 10, 1), "Mercado", 333.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 11, 1), "Mercado", 203.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 12, 1), "Mercado", 500.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 1, 1), "Farmacia", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 2, 1), "Farmacia", 50.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 3, 1), "Farmacia", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 4, 1), "Farmacia", 30.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 5, 1), "Farmacia", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 6, 1), "Farmacia", 20.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 7, 1), "Farmacia", 431.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 8, 1), "Farmacia", 43.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 9, 1), "Farmacia", 78.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 10, 1), "Farmacia", 38.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 11, 1), "Farmacia", 21.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 12, 1), "Farmacia", 55.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 1, 1), "Feira", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 2, 1), "Feira", 50.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 3, 1), "Feira", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 4, 1), "Feira", 30.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 5, 1), "Feira", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 6, 1), "Feira", 20.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 7, 1), "Feira", 431.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 8, 1), "Feira", 43.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 9, 1), "Feira", 78.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 10, 1), "Feira", 38.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 11, 1), "Feira", 21.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2020, 12, 1), "Feira", 55.32));

		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 1, 1), "Mercado", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 2, 1), "Mercado", 50.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 3, 1), "Mercado", 200.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 4, 1), "Mercado", 340.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 5, 1), "Mercado", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 6, 1), "Mercado", 205.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 7, 1), "Mercado", 431.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 8, 1), "Mercado", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 9, 1), "Mercado", 222.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 10, 1), "Mercado", 333.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 11, 1), "Mercado", 203.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 12, 1), "Mercado", 500.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 1, 1), "Farmacia", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 2, 1), "Farmacia", 50.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 3, 1), "Farmacia", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 4, 1), "Farmacia", 30.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 5, 1), "Farmacia", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 6, 1), "Farmacia", 20.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 7, 1), "Farmacia", 431.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 8, 1), "Farmacia", 43.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 9, 1), "Farmacia", 78.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 10, 1), "Farmacia", 38.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 11, 1), "Farmacia", 21.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 12, 1), "Farmacia", 55.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 1, 1), "Feira", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 2, 1), "Feira", 50.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 3, 1), "Feira", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 4, 1), "Feira", 30.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 5, 1), "Feira", 100.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 6, 1), "Feira", 20.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 7, 1), "Feira", 431.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 8, 1), "Feira", 43.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 9, 1), "Feira", 78.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 10, 1), "Feira", 38.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 11, 1), "Feira", 21.32));
		despesa.getDespesas().add(new Despesa (LocalDate.of(2021, 12, 1), "Feira", 55.32));	
	}
}
