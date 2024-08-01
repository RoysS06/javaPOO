
package arraylists;

import java.util.ArrayList;
import java.util.List;


public class ArrayLists {
    public static void main(String[] args) {
        
        List<Alumno> lista = new ArrayList<Alumno>();
        
        lista.add(new Alumno (1, "Roy", 31));
        lista.add(new Alumno(2, "Diana", 31));
        lista.add(new Alumno(3, "Ian", 1));
        lista.add(new Alumno(4, "Edu", 28));
        
        for(Alumno perso:lista){
            System.out.println("Los nombres de los alumnos son: " + perso.getNombre());
        }
        
    }
    
}
