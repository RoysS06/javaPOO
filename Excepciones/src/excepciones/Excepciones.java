package excepciones;

public class Excepciones {

    public static void main(String[] args) {
        //CASO 1
        
        System.out.println("---------CASO 1 ---------");
        try {
            int division = 3 / 0;
        } catch (Exception e) {
            System.out.println("No se puede dividir entre cero");
        }
        
        
        System.out.println("--------CASO 2 -----------");
        
        //CASO 2
        int numeros[] = {1, 2, 3, 4, 5};

        try {
            System.out.println("Necesito el numero 5: " + numeros [5]);    
        }catch(Exception e){
            System.out.println("Dicho numero no existe");
        }

    }

}
