import java.io.FileWriter;
import java.io.IOException;

public class GravarArquivo2 {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("Arquivos em Java podem ser complicados, mas são divertidos!\nPor enquanto é só pessoal!");
			myWriter.close();
			System.out.println("Gravação feita com sucesso!");
		} catch (IOException e) {
			System.out.println("Ocorreu um erro!");
			e.printStackTrace();
		}
	}
}
