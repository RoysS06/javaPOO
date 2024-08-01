package linkedlists;

import java.util.LinkedList;
import java.util.List;


public class LinkedLists {


    public static void main(String[] args) {
        
        // Crear una Linkedlist tiene el mismo formato que un arrayList
        List<Alumno> lista = new LinkedList<Alumno>();
        
        lista.add(new Alumno (1, "Roy", 31));
        lista.add(new Alumno(2, "Diana", 31));
        lista.add(new Alumno(3, "Ian", 1));
        lista.add(new Alumno(4, "Edu", 28));
        
        //En las linked list podemos agregar al comienzo o al final
        lista.add(0, new Alumno(5, "Marco", 61));
        
        
        for(Alumno perso:lista){
            System.out.println("Los nombres de los alumnos son: " + perso.getNombre());
        }
        
    }
    
    
}
