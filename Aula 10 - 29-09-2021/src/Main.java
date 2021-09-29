import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Despesa desp01 = new Despesa(LocalDate.of(2021, 9, 29), "Conta de Luz", 87.65);
		//System.out.println(desp01);
		
		DespesaPessoal dp01 = new DespesaPessoal("12309876-09");
		dp01.getDespesas().add(desp01);
		dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 8, 20), "Conta de água", 70.23));
		dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 8, 21), "Mercado", 125.55));
		dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 8, 21), "Feira", 30.43));
		dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 8, 22), "Padaria", 10.07));
		dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 9, 20), "Conta de água", 70.23));
		dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 9, 21), "Mercado", 125.55));
		dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 9, 21), "Feira", 30.43));
		dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 9, 22), "Padaria", 10.07));
		dp01.imprime();
		dp01.imprime(8, 2021);
		dp01.imprime(9, 2021);
		dp01.imprime(LocalDate.of(2021, 9, 21));
		
	/*	System.out.println(dp01);
		System.out.println("Total despesas geral: "+dp01.getTotal());
		System.out.println("Total despesas 08/2021: "+dp01.getTotal(8, 2021));
		System.out.println("Total despesas 09/2021: "+dp01.getTotal(9, 2021));
		System.out.println("Total despesas 10/09/2021: "+dp01.getTotal(LocalDate.of(2021, 9, 10)));
		System.out.println("Total despesas 20/09/2021: "+dp01.getTotal(LocalDate.of(2021, 9, 20)));
		System.out.println("Total despesas 21/09/2021: "+dp01.getTotal(LocalDate.of(2021, 9, 21)));
		System.out.println("Total despesas 29/09/2021: "+dp01.getTotal(LocalDate.of(2021, 9, 29)));
		*/
		
		
	}
}
