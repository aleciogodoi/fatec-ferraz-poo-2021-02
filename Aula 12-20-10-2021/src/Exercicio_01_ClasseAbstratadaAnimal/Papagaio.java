package Exercicio_01_ClasseAbstratadaAnimal;

public class Papagaio extends Ave {

	Papagaio(){
	}
	
	@Override
	public void voar() {
		System.out.println("Voando...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Falando...");
	}

}
