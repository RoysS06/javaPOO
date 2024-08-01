
package clasesabstractas;

public class FigCuadrado extends FiguraGeometrica{

    private double lado;

    public FigCuadrado() {
    }

    public FigCuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }
   
    
    
    @Override
    public double area() {
        
        double resultado = lado * lado;
        return resultado;
        
    }
    
}
