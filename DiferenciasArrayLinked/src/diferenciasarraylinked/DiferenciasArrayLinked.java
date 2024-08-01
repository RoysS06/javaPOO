package diferenciasarraylinked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class DiferenciasArrayLinked {


    public static void main(String[] args) {
        
        List<Alumno> listaArray = new ArrayList <Alumno>();
        listaArray.add(new Alumno(1, "Diana", 31));
        listaArray.add(new Alumno(2, "Cintia", 35));
        listaArray.add(new Alumno(3, "Jeicko", 12));
        listaArray.add(new Alumno(4, "Jorge", 33));
        
        List<Alumno> listaLinked = new LinkedList <Alumno>();
        listaLinked.add(new Alumno(1, "Pepito", 54));
        listaLinked.add(new Alumno(2, "Lucho", 11));
        listaLinked.add(new Alumno(3, "Pancho", 85));
        listaLinked.add(new Alumno(4, "Richi", 102));
        
        
        //Eliminar en ArrayList (remove) - cuando se sabe el indice de la posición en el arraylist (forma 1 de eliminar)
        listaArray.remove(1);
        
        // Eliminar en LinkedList - cuando no sabes el indice pero si el elemento (forma 2 de eliminar
        String nombreBorrar = "Lucho";
        
        for(Alumno alu:listaLinked){
            if (alu.getNombre().equals(nombreBorrar)){
                listaLinked.remove(alu);
                break; //corto para que deje de recorrer
            }
        }
        
        System.out.println("-------LUEGO DE ELIMINAR--------");
        
        System.out.println("---ArrayLists------");
        for(Alumno alu:listaArray){
            System.out.println("Prueba: " + alu.getNombre());
        }
        
        System.out.println("---LinkedLists------");
        for(Alumno alu:listaLinked){
            System.out.println("Prueba: " + alu.getNombre());
        }
        
        
        //METODOS ADICIONALES:
        
        //Tamaño de Lista
        System.out.println("--------¿Que tamaño tienen las listas? ----------");
        System.out.println("Arraylist: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());
        
       
        /* NOTA: POR ALGUNA RAZÓN NO ME FUNCIONA EL GETFIRST() Y EL GETLAST()
        //Primer y ultimo objeto - solo en LINKEDLIST
        
        System.out.println("-----Obtener PRIMER y ULTIMO objeto - Solo para linkedList");
        
        System.out.println("Primero de LinkedList: " + listaLinked.getFirst().toString());
        System.out.println("Primero de LinkedList: " + listaLinked.getLast().toString());
        
        */
        
        //Borrar Lista
        System.out.println("------Borrando Lista------");
        
        listaArray.clear();
        listaLinked.clear();
        
        //Comprobar si la lista esta vacia
        System.out.println("--------¿Esta vacia la lista?------");
        System.out.println("Arraylist: " + listaArray.isEmpty());
        System.out.println("LinkedList: " + listaLinked.isEmpty());
    }
    
}
