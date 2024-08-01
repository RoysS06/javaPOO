// Ejercicio integrador referido a los conceptos de clases abstractas e interfaces.

/*DIFERENCIAS:
    interfaces: que hace
    Clases abstactas: que es
*/

package logica;

public class EjercicioIntegrador1 {

    public static void main(String[] args) {

        Bulbasaur bulba = new Bulbasaur();
        Charmander charman = new Charmander();
        Pikachu pika = new Pikachu();
        Squirtle sq = new Squirtle();
        
        bulba.atacarAraniazo();
        bulba.atacarParalizar();
        charman.atacarAraniazo();
        charman.atacarPunioFuego();
        pika.atacarAraniazo();
        pika.atacarPunioTrueno();
        sq.atacarAraniazo();
        sq.atacarHidrobomba();

    }
    
}
