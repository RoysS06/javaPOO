
package logica;


public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }
    
    
    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataque placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Squirtle y este es mi ataque Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y este es mi ataque Hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle y este es mi ataque Pistola de Agua");
    }
    
}
