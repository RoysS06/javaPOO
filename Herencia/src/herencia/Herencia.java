
package herencia;

public class Herencia {

    public static void main(String[] args) {

        Empleado emple = new Empleado();
        
        //pruebas para ver si lo metodos heredados aparecen - empleado es hijo de persona
        emple.getNumLegajo();
        emple.getApellido();
        
        
        //pruebas para ver si lo metodos heredados aparecen - empleado es hijo de persona
        Consultor consul = new Consultor();
        consul.getNumConsultor();
        consul.getDni();
    }
    
}
