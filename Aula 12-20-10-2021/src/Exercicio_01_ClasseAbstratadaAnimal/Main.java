package Exercicio_01_ClasseAbstratadaAnimal;

public class Main {

	public static void main(String[] args) {
		//Animal animal01 = new Animal(); // N�O PODE SER INSTANCIADO � UMA CLASSE ABSTRATA
		
		Gato bichano = new Gato();
		bichano.amamentar();
		bichano.emitirSom();
	}

}
