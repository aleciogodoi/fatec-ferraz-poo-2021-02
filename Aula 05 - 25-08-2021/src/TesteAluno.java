public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno01 = new Aluno();
		aluno01.nome = "Ana";
		aluno01.matricula = "00918-07";
		aluno01.nota1 = 8;
		aluno01.nota2 = 10;
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		System.out.println(aluno01);
		
		Aluno aluno02 = new Aluno("Pedro", "123245-09", 7, 8, 0);
		System.out.println(aluno02.toString());

	}
}
