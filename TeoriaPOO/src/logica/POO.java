
package logica;

public class POO {


    public static void main(String[] args) {

        //Creación de objeto - Vacio
        Alumno alu1 = new Alumno();
        
        //Creación de objeto - con parámetros
        Alumno alu2 = new Alumno(2, "Roy", "Rodriguez");
        
        //Mostramos por consola:
        System.out.println("El id de nuestro alumno es: " + alu2.getId() + " y su nombres es: " + alu2.getNombre());
        
        //Para el objeto vacio:
        alu1.setId(1);
        alu1.setNombre("Eduardo");
        alu1.setApellido("Mesia");
        
        System.out.println("los datos sos: " + alu1.getId() + " " + alu1.getNombre() + " " + alu1.getApellido());
        
        
    }
    
}
