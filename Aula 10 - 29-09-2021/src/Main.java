import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Despesa desp01 = new Despesa(LocalDate.of(2021, 9, 29), "Conta de Luz", 87.65);
		System.out.print(desp01);
	}
}
