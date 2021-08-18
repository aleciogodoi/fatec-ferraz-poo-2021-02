public class Circulos {
    // Atributos
    public float raio;
    public float x;
    public float y;
    
    public void mover(float n1, float n2) {
        x = n1;
        y = n2;
    }
    
    public void redimensionar(float r) {
        raio = r;
    } 
    
    public void imprimir() {
        System.out.println("Circulo [x: "+x+", y: "+y+", raio: "+raio+"]");
    }
    
} 