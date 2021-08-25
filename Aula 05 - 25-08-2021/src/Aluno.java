public class Aluno {
	// Atributos
	String nome;
	String matricula;
	private double nota1;
	private double nota2;
	private double notaReavaliacao; 
	private boolean aprovado;
	
	// Construtor
	Aluno() {
	}
	
	Aluno(String nom, String mat, double n1, double n2, double nReavaliacao ){
		nome = nom;
		matricula = mat;
		nota1 = n1;
		nota2 = n2;
		notaReavaliacao = nReavaliacao;
		aprovado = (calcularMediaFinal() >=  6);
	}
	
	@Override
	public String toString() {
		return "Aluno [Nome: "+nome +", Matricula: "+matricula
				+ ", Nota 1: "+ nota1 + ", Nota 2: "+ nota2 
				+ ", Nota Reavaliação: "+ notaReavaliacao
				+ ", Média:" + calcularMedia() 
				+ ", Média Final:" + calcularMediaFinal() 
				+ ", Aprovado: "+ aprovado +"]";
	}
	
	public double calcularMedia() {
		return (nota1 + nota2 ) / 2;
	}

	public double calcularMediaFinal() {
		if (calcularMedia() >= 6) 
			return calcularMedia();
		else
			return ( calcularMedia() + notaReavaliacao ) / 2;
	}
	
	public boolean getAprovado() {
		return aprovado;
	}

	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public double getNotaReavaliacao() {
		return notaReavaliacao;
	}

	public void setNota1(double n) {
		nota1 = n;
		aprovado = (calcularMediaFinal() >=  6);
	}
	public void setNota2(double n) {
		nota2 = n;
		aprovado = (calcularMediaFinal() >=  6);
	}
	public void setNotaReavaliacao(double n) {
		notaReavaliacao = n;
		aprovado = (calcularMediaFinal() >=  6);
	}
}
