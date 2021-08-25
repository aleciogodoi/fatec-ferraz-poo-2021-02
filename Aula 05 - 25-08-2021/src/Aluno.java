public class Aluno {
	// Atributos
	String nome;
	String matricula;
	double nota1;
	double nota2;
	double notaReavaliacao; 
	
	// Construtor
	Aluno() {
	}
	
	Aluno(String nom, String mat, double n1, double n2, double nReavaliacao ){
		nome = nom;
		matricula = mat;
		nota1 = n1;
		nota2 = n2;
		notaReavaliacao = nReavaliacao;
	}
	
	@Override
	public String toString() {
		return "Aluno [Nome: "+nome +", Matricula: "+matricula
				+ ", Nota 1: "+ nota1 + ", Nota 2: "+ nota2 
				+ ", Nota Reavalia��o: "+ notaReavaliacao
				+ ", M�dia:" + calcularMedia() 
				+ ", M�dia Final:" + calcularMediaFinal() + "]";
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

}
