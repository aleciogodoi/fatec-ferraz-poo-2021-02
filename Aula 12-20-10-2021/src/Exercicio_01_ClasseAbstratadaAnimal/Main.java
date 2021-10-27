package Exercicio_01_ClasseAbstratadaAnimal;

public class Main {

	public static void main(String[] args) {
		//Animal animal01 = new Animal(); // NÃO PODE SER INSTANCIADO É UMA CLASSE ABSTRATA
		
		Gato bichano = new Gato();
		bichano.amamentar();
		bichano.emitirSom();
		bichano.alimentar();
		bichano.brincar();
		bichano.levarPassear();
		bichano.levarVeteriano();
		System.out.println();
		
		Papagaio louroJose = new Papagaio();
		louroJose.emitirSom();
		louroJose.voar();
		System.out.println();
		
		Cavalo silver = new Cavalo();
		silver.amamentar();
		silver.emitirSom();
		silver.alimentar();
		silver.levarVeteriano();
		System.out.println();
		
		Cachorro viraLata = new Cachorro();
		viraLata.amamentar();
		viraLata.emitirSom();
		viraLata.alimentar();
		viraLata.brincar();
		viraLata.levarPassear();
		viraLata.levarVeteriano();
		System.out.println();
		
	}

}
