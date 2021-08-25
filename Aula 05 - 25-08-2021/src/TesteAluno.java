public class TesteAluno {
	public static void main(String[] args) {
		Aluno aluno01 = new Aluno();
		aluno01.nome = "Ana";
		aluno01.matricula = "00918-07";
		aluno01.nota1 = 8;
		aluno01.nota2 = 10;
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		System.out.println(aluno01);
		System.out.println("Média:" + aluno01.calcularMedia());
		System.out.println("Média Final:" + aluno01.calcularMediaFinal());

		Aluno aluno02 = new Aluno("Pedro", "123245-09", 7, 8, 0);
		System.out.println(aluno02.toString());
		System.out.println("Média:" + aluno02.calcularMedia());
		System.out.println("Média Final:" + aluno02.calcularMediaFinal());
		
		Aluno aluno03 = new Aluno("Alex", "877641-01", 6, 5, 7);
		System.out.println(aluno03.toString());
		System.out.println("Média:" + aluno03.calcularMedia());
		System.out.println("Média Final:" + aluno03.calcularMediaFinal());
		
	}
}
