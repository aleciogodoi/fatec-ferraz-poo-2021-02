import java.util.Scanner;  // Importando a Classe Scanner
public class Hello {
	public static void main(String[] args) {
	    /*
		System.out.print("Hello World!!! Java!!!\n");
		System.out.print(" Mensagem 2\n");
        System.out.print(" Mensagem 3\n");
        */
        
        // Declarando variaveis no Java
        String nome = "José";
        int idade = 10;
        double altura = 1.58;
        float peso = 52.5f; 
        
        Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner
        System.out.print("Entre com o nome: ");
        nome = meuScanner.nextLine();          // Lê os dados digitados
        
        System.out.print("Entre com a idade: ");
        idade = meuScanner.nextInt();          // Lê os dados digitados

        // Entrar com Altura
        
        // Entrar com Peso
        
        System.out.println("Nome.: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: "+ altura);
        System.out.println("Peso: "+ peso);
	}
}



