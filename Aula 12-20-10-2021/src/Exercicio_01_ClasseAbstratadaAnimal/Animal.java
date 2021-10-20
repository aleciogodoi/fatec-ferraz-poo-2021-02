package Exercicio_01_ClasseAbstratadaAnimal;

abstract public class Animal {
	private String nome;

	Animal(){
	}
	
	public abstract void emitirSom();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
