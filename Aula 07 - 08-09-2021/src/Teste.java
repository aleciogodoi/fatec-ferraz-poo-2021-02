import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

		pessoas.add(new Aluno("Julio","1212099-09", new Data(1,1,2000), "1221-098", 0));
		pessoas.add(new Pessoa("Maria","88712-07", new Data(12,10,1985)));
		pessoas.add(new Professor("Pedro","109121-10", new Data(7,5,1980), "44453-02"));
		
		for (Pessoa p : pessoas) {
			System.out.println(p.toString());
		}
	}

}
