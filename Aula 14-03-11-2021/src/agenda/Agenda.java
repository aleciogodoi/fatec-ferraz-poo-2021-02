package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	private ArrayList<Contato> contatos;
	
	Agenda() {
		contatos = new ArrayList<Contato>();
	}
	
	public void adicionar() {
		Contato contato = entrada();
		contatos.add(contato);
		Arquivo.gravar(contato.toString());
	}
	
	public void listar() {
		System.out.println();
		for (Contato contato: this.getContatos())
			System.out.print(contato.toString());
		System.out.println();
	}
	
	public Contato entrada() {
		Contato contato = new Contato();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNome: ");
		String nome = sc.nextLine();

		System.out.print("Telefone: ");
		String telefone = sc.nextLine();

		contato.setNome(nome);
		contato.setTelefone(telefone);
		
		System.out.println();
		return contato;
	}
	
	public ArrayList<Contato> getContatos(){
		return contatos;
	}
	
}
