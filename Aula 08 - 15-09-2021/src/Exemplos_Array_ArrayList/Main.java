package Exemplos_Array_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Array
		int[] numeros = new int[5];
		numeros[0] = 30;
		numeros[1] = 40;
		numeros[2] = 20;
		numeros[3] = 7;
		numeros[4] = -1;
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

		ArrayList<String> carros = new ArrayList<String>();

		// Adicionando Itens
		System.out.println();
		carros.add("Volvo");
		carros.add("BMW");
		carros.add("Ford");
		carros.add("Mazda");
		carros.add("VW");
		carros.add("Mercedes");
		System.out.println(carros);
		System.out.println("Tamanho lista de carros: "+carros.size());
		
		Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner
		String dado="";
		while (true) {
			System.out.print("Carro: ");
			dado = meuScanner.nextLine();
			if (dado.isBlank() || dado.isEmpty())
				break;
			carros.add(dado);
		}
		meuScanner.close();
		
		System.out.println(carros);
		System.out.println("Tamanho lista de carros: "+carros.size());
		System.out.println(carros.get(0));		
		System.out.println(carros.get(3));
		carros.set(0, "Ferrari");
		System.out.println(carros);		
		System.out.println(carros.get(0));		

		for (int i=0; i < carros.size(); i++ ) {
			System.out.println(carros.get(i));
		}
			
		carros.remove(0);
		System.out.println(carros);		
		carros.clear();
		System.out.println(carros);				

		
	}

}
