import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Despesa desp01 = new Despesa(LocalDate.of(2021, 9, 29), "Conta de Luz", 87.65);
		System.out.println(desp01);
		
		DespesaPessoal dp01 = new DespesaPessoal("12309876-09");
		dp01.getDespesas().add(desp01);
		dp01.getDespesas().add(new Despesa(LocalDate.of(2021, 9, 20), "Conta de Água", 70.23));
		System.out.println(dp01);
	}
}
