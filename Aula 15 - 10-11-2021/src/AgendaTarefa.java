import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class AgendaTarefa {
	private ArrayList<Tarefa> tarefas;
	
	AgendaTarefa() {
		tarefas = new ArrayList<Tarefa>();
		this.carga();	
	}
	
	public ArrayList<Tarefa> carga() {
		ArrayList<String> dados = Arquivo.ler();
		for (String dado: dados) {
			Tarefa tarefa = new Tarefa();
			String[] aux = dado.split(",");
			
			tarefa.setId(Integer.valueOf(aux[0]));
			
			if (aux[1].equalsIgnoreCase("null"))
				tarefa.setNome(null);
			else
				tarefa.setNome(aux[1]);
			
			if (aux[2].equalsIgnoreCase("null"))
				tarefa.setDescricao(null);
			else
				tarefa.setDescricao(aux[2]);
				
			
			// Tratamento para as datas 2021-11-10
			
			if (aux[3].equalsIgnoreCase("null")) 
				tarefa.setDtInicio(null);
			else {
				String[] dataIni = aux[3].split("-");
	
				tarefa.setDtInicio(
						LocalDate.of(
								Integer.valueOf(dataIni[0]),
								Integer.valueOf(dataIni[1]),
								Integer.valueOf(dataIni[2])
						)
				);
			}
			
			if (aux[4].equalsIgnoreCase("null")) 
				tarefa.setDtFim(null);
			else {
				String[] dataFim = aux[4].split("-");
	
				tarefa.setDtFim(
						LocalDate.of(
								Integer.valueOf(dataFim[0]),
								Integer.valueOf(dataFim[1]),
								Integer.valueOf(dataFim[2])
						)
				);
			}
			
			if (aux[5].equalsIgnoreCase("null")) 
				tarefa.setStatus(null);
			else
				tarefa.setStatus(aux[5]);
			
			tarefas.add(tarefa);
			
		}
		return tarefas;
	}
	
	public Tarefa consultar() throws TarefaException {
		Tarefa tarefa = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNome: ");
		String nome = sc.nextLine();
		for (Tarefa t: this.getTarefas()) {
			if (t.getNome() != null && t.getNome().equalsIgnoreCase(nome))
				tarefa = t;
		}
		
		if (tarefa == null) {
			throw new TarefaException("Contato Não Existe!");
		}
		
		return tarefa;
	}

	public void adicionar() {
		Tarefa tarefa = entrada();
		tarefas.add(tarefa);
		Arquivo.gravar(tarefa.toString());
	}
	
	public void listar() {
		System.out.println();
		for (Tarefa tarefa: this.getTarefas()) 
			System.out.print(tarefa.toString());
		System.out.println();
	}
	
	public Tarefa entrada() {
		boolean flagExecao=false;
		Tarefa tarefa = new Tarefa();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNome: ");
		tarefa.setNome(sc.nextLine());

		System.out.print("Descricao: ");
		tarefa.setDescricao(sc.nextLine());

		int diaIni=0;
		do {
			flagExecao = false;
			try { 
				System.out.print("Dia Inicio: ");
				diaIni = sc.nextInt();	
			} catch (InputMismatchException ex) {
				flagExecao = true;
				System.out.println("Dado Dia Inicio Incorreto!");
				sc.nextLine();
			}
		} while (flagExecao);
		
		int mesIni = 0;
		do {
			flagExecao = false;
			try {
				System.out.print("Mes Inicio: ");
				mesIni = sc.nextInt();
			} catch (InputMismatchException ex) {
				flagExecao = true;
				System.out.println("Dado Mes Inicio Incorreto!");
				sc.nextLine();
			}
		} while (flagExecao);
		
		System.out.print("Ano Inicio: ");
		int anoIni = sc.nextInt();
		tarefa.setDtInicio(LocalDate.of(anoIni, mesIni, diaIni));
		
		System.out.print("Dia Fim: ");
		int diaFim = sc.nextInt();

		System.out.print("Mes Fim: ");
		int mesFim = sc.nextInt();

		System.out.print("Ano Fim: ");
		int anoFim = sc.nextInt();
		
		if (diaFim==0) 
			tarefa.setDtFim(null);
		else
			tarefa.setDtFim(LocalDate.of(anoFim, mesFim, diaFim));
		
		sc.nextLine();
		System.out.print("Status: ");
		tarefa.setStatus(sc.nextLine());
		
		System.out.println();
		return tarefa;
	}
	
	public ArrayList<Tarefa> getTarefas() {
		return tarefas;
	}
}
