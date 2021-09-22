public class Aluno extends Pessoa{
	//Atributos
	private String ra;
	private int nrFaltas;
	// Construtores
	public Aluno() {
	}
	public Aluno(String nome, String identidade, Data dtNascimento,
				 String ra, int nrFaltas) {
		super(nome, identidade, dtNascimento);
		this.ra = ra;
		this.nrFaltas = nrFaltas;
	}
	
	public Aluno(String nome, String identidade, Data dtNascimento) {
		super(nome, identidade, dtNascimento);
	}
	
	// Getters e Setters
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public int getNrFaltas() {
		return nrFaltas;
	}
	public void setNrFaltas(int nrFaltas) {
		this.nrFaltas = nrFaltas;
	}
	@Override   // Sobrescrita
	public String toString() {
		return "Aluno [ra=" + ra + ", nrFaltas=" + nrFaltas + "] - " + super.toString();
	}
}
