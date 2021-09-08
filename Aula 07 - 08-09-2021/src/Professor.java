public class Professor extends Pessoa{
	// Atributos
	private String codigo;
	// Construtores
	public Professor() {
	}
	public Professor(String nome, String identidade, Data dtNascimento, String codigo) {
		super(nome, identidade, dtNascimento); // Construtor da Classe SUPERCLASSE(mãe)
		this.codigo = codigo;
	}
	// Getters e Setters
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Professor [codigo=" + codigo + "] - " + super.toString();
	}
}
