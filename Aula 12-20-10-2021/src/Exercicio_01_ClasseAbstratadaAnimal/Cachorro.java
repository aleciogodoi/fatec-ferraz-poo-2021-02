package Exercicio_01_ClasseAbstratadaAnimal;

public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomesticado {

	private int tamanho;
	private String raca;
	
	Cachorro(){
	}
	
	@Override
	public void amamentar() {
		System.out.println("Amamentando!!!");
	}

	@Override
	public void emitirSom() {
		System.out.println("Au!!! Au!!!");
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public void levarVeteriano() {
		System.out.println("Estou indo ao médico!");
	};

	@Override
	public void alimentar() {
		System.out.println("Hora da merenda!");
	};
	
	@Override
	public void brincar() {
		System.out.println("Pegando a bola...");
	}

	@Override
	public void levarPassear() {
		System.out.println("Dando um giro!");
	}
}
