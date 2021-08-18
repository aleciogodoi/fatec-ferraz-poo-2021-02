
public class TestaCirculos
{
	public static void main(String[] args) {
	    // Criando(instanciando) um objeto do tipo Circulos(classe)
		Circulos circulo1 = new Circulos();
		Circulos circulo2 = new Circulos();
		
		System.out.print("Circulo 1 -> ");
		circulo1.imprimir();
		
		System.out.print("Circulo 2 -> ");
		circulo2.imprimir();
		
		circulo1.mover(5f, 7f);
		circulo1.redimensionar(8f);
		
		System.out.print("Circulo 1 -> ");
		circulo1.imprimir();
		
		
		circulo2.mover(9f, 12f);
		circulo2.redimensionar(15.2f);
		
		System.out.print("Circulo 2 -> ");
		circulo2.imprimir();
		
		System.out.println("Circulo 2 -> raio: "+ circulo2.raio);
		System.out.println("Circulo 2 -> x: "+ circulo2.x);
		
		circulo2.y = 10f;
		circulo2.imprimir();
	
		circulo1.y = 7f;
		circulo1.imprimir();
		
	}
}
