package Exercicio_01_ClasseAbstratadaAnimal;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

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

	@Override
	public void levarVeteriano() {
		System.out.println("Indo ao veterinário...");	
	}

	@Override
	public void alimentar() {
		System.out.println("Tomando meu leite...");	
	}

	@Override
	public void brincar() {
		System.out.println("Brincando...");			
	}

	@Override
	public void levarPassear() {
		System.out.println("Dando uma volta...");					
	}

}
