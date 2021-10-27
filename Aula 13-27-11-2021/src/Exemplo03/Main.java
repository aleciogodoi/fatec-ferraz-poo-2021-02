package Exemplo03;

public class Main {

	public static void main(String[] args) {
		ContaCorrente c01 = new ContaCorrente("Mateus", "12123-09");
		System.out.printf("%s\n",c01);
		try {
			c01.deposito(1000); 
			c01.saque(6000);
		} catch (ContaException ex) {
			System.out.printf("%s\n",ex.getMessage());
		}
		
		c01.deposito(5000);
	}

}
