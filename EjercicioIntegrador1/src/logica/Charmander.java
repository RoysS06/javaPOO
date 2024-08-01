
package logica;


public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }
    
    

    @Override
    public void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque placaje");

    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataque Arañaso");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque Mondisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque Puño Fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Hola soy Charmander y este es mi ataque Lanza Llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque Ascuas");
    }
    
}
