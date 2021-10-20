package Exercicio_01_ClasseAbstratadaAnimal;

public class Gato extends Mamifero {

	private String raca;
	
	Gato(){
	}
		
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public void amamentar() {
		System.out.println("Estou amamentando...");
	}

	@Override
	public void emitirSom() {
		System.out.println("Miau!");		
	}

}
