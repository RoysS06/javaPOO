
package clasesabstractas;

public abstract class FiguraGeometrica {
    
    protected double x; // pos en x
    protected double y; // pos en y

    protected FiguraGeometrica() {
    }

    protected FiguraGeometrica(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public abstract double area();
    
}
