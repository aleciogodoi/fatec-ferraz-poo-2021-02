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
		setNota1(n1);
		setNota2(n2);
		setNotaReavaliacao(nReavaliacao);
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
		if (n >=0 && n <=10) {
			nota1 = n;
			aprovado = (calcularMediaFinal() >=  6);
		} else {
			System.out.println("Nota1 incorreta!!!");
		}
	}
	public void setNota2(double n) {
		if (n >=0 && n <=10) {
			nota2 = n;
			aprovado = (calcularMediaFinal() >=  6);
		} else {
			System.out.println("Nota2 incorreta!!!");
		}
	}
	public void setNotaReavaliacao(double n) {
		if (n >=0 && n <=10) {
			notaReavaliacao = n;
			aprovado = (calcularMediaFinal() >=  6);
		} else {
			System.out.println("Nota Reavaliação incorreta!!!");
		}
	}
}
