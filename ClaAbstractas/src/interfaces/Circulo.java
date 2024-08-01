package interfaces;

public class Circulo implements Figura, Dibujable, Rotable{

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * (radio * radio); 
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un circulo y puedo dibujarme");
    }

    @Override
    public void rotar() {
        System.out.println("Soy un circulo y ouedo rotar");
    }
    
    
}
