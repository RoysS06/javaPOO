
package logica;


public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    
    
    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque Arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque PuñoTrueno");
    }
    
}
