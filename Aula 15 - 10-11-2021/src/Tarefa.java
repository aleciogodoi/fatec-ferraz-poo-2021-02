import java.time.LocalDate;

public class Tarefa {
	private static int contador;
	private int id=0;
	private String nome;
	private String descricao;
	private LocalDate dtInicio;
	private LocalDate dtFim;
	private String status;
	
	Tarefa() {
		contador++;
		this.id = contador;
	}
	
	Tarefa(String nome, String descricao, LocalDate dtInicio, LocalDate dtFim, String status) {
		this();
		this.nome = nome;
		this.descricao = descricao;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.status = status;
	}
	
	public void setContador(int contador) {
		this.contador = contador;
		this.id = this.contador;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(LocalDate dtInicio) {
		this.dtInicio = dtInicio;
	}
	public LocalDate getDtFim() {
		return dtFim;
	}
	public void setDtFim(LocalDate dtFim) {
		this.dtFim = dtFim;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return id+","+nome + "," + descricao + "," + dtInicio + "," + dtFim+ "," + status+"\n";
	}
	
}
