package Exercicio_01_ClasseAbstratadaAnimal;

public class Cavalo extends Mamifero{

	Cavalo(){
	}
	
	@Override
	public void amamentar() {
		System.out.println("Amamentando...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Relinchando...");
	}

}
