package Heranca_01;
public class Main {
	public static void main(String[] args) {
		Funcionario[] funcionarios = new Funcionario[5];
		funcionarios[0] = new Funcionario("Ana", "123.875.891-99", 3217.52);
		funcionarios[1] = new Funcionario("Pedro", "887.875.987-99", 3217.52);
		funcionarios[2] = new Funcionario("Aline", "555.333.222-98", 4217.52);
		funcionarios[3] = new Funcionario("Marcos", "777.875.891-99", 4217.52);
		funcionarios[4] = new Funcionario("Virginia", "076.098.211-77", 4217.52);
		
		Gerente ger01 = new Gerente("José", "091.123.654-11", 10532.21 );
		//ger01.setNome("José");
		System.out.println(ger01);
		
		for (Funcionario func: funcionarios) {
		    System.out.println(func);
		}
	}
}
