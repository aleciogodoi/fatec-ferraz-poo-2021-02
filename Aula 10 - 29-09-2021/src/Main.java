import java.time.LocalDate;
import java.util.Random;
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
				totalDiaMesAno() ;
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
				entradaDia();
				entradaMes();
				entradaAno();
				despesa.imprime(LocalDate.of(ano, mes, dia));				
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
	
	public static void totalDiaMesAno() {
		entradaDia();
		entradaMes();
		entradaAno();
		System.out.println("\n-----------------------------------------------------");
	    System.out.println("Despesas - CPF: "+despesa.getCpf());
		System.out.println("-----------------------------------------------------");
		System.out.printf("Total %s: %.2f",(dia+"/"+mes+"/"+ano),despesa.getTotal(LocalDate.of(ano, mes, dia)));
		System.out.println("\n-----------------------------------------------------");		
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
		String[] item = {"Luz", "Internet", "Telefone", "Gas", "Feira", 
							 "Mercado", "Agua", "Famarcia", "Transporte", "Padaria", "Outras"};
		
		int[] ano = {2019, 2020, 2021};
		
		Random rnd = new Random();
		
		int numeroSorteado=0;
		int anoSorteado=0;
		int diaSorteado=0;
		int mesSorteado=0;
		
		double valorSorteado=0;
		for (int i = 1; i <= 200; i++) {
			numeroSorteado = rnd.nextInt(item.length);
			valorSorteado = rnd.nextDouble()*100;
			anoSorteado = rnd.nextInt(ano.length);
			mesSorteado = rnd.nextInt(12)+1;
			diaSorteado = rnd.nextInt(28)+1;
			//System.out.println(item[numeroSorteado]+ ", valor: "+valorSorteado+
			//		", ano: "+ano[anoSorteado]+ ", mês: "+ mesSorteado + ", dia: "+ diaSorteado);
			despesa.getDespesas().add(
					new Despesa (
						LocalDate.of(ano[anoSorteado], mesSorteado, diaSorteado),
						item[numeroSorteado], 
						valorSorteado)
			);
		}
		
	}
}
