
package stackspilas;

import java.util.Stack;

public class StacksPilas {


    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<Integer>();
        
        System.out.println("Lista vacia:" + pila);
        System.out.println("¿La lista esta vacia?" + pila.isEmpty());
        
        //Agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        // Recorrido con foreach
        
        for(Integer pilita:pila){
            System.out.println(pilita);
        }
        
        //mostrar
        System.out.println("Pila vacia " + pila);
        System.out.println("¿Pila vacia?" + pila.isEmpty());
        
        //Remover - elimina el ultimo registro que entró:
        pila.pop();
        
        System.out.println("¿Está el 3? " + pila.search(3));
        System.out.println("Ultimo agregado: " + pila.peek());
        
    }
    
}
