public class TesteAluno {
	public static void main(String[] args) {
		Aluno aluno01 = new Aluno("Ana", "00918-07", 8, 10, 0);

		System.out.println(aluno01);
		System.out.println("Média:" + aluno01.calcularMedia());
		System.out.println("Média Final:" + aluno01.calcularMediaFinal());

		Aluno aluno02 = new Aluno("Pedro", "123245-09", 7, 8, 0);
		System.out.println(aluno02.toString());
		System.out.println("Média:" + aluno02.calcularMedia());
		System.out.println("Média Final:" + aluno02.calcularMediaFinal());
		System.out.println(aluno02.toString());
		
		Aluno aluno03 = new Aluno("Alex", "877641-01", 6, 5, 5);
		System.out.println(aluno03.toString());
		System.out.println("Média:" + aluno03.calcularMedia());
		System.out.println("Média Final:" + aluno03.calcularMediaFinal());
		System.out.println(aluno03.toString());
		System.out.println(aluno03.getAprovado());
		aluno03.setNotaReavaliacao(70.5);
		System.out.println(aluno03.toString());
		aluno03.setNotaReavaliacao(7.5);

		System.out.println(aluno03.toString());
	}
}
