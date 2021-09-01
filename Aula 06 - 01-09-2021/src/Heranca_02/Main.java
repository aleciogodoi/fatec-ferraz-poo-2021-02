package Heranca_02;

public class Main {

	public static void main(String[] args) {
		Veiculo[] veiculos = new Veiculo[4];

		veiculos[0] = new Veiculo("ABC-1029", 2010);
		veiculos[1] = new Onibus("ABC-1029", 2014, 60);
		veiculos[2] = new Onibus("XPO-1133", 2012, 70);
		veiculos[3] = new Caminhao("YKZ-4455", 2016, 4);
		
		for(Veiculo veic: veiculos) {
			System.out.println(veic);
		}
	}

}
