
package conversiones;

public class Conversiones {

    public static void main(String[] args) {
        
        //Conversiones de String a entero
        String num1 = "5";   
        String num2 = "24.5";
        
        int conversionInt = Integer.parseInt(num1);
        double conversionDouble = Double.parseDouble(num2);
        
        System.out.println("resultado es: " + (conversionInt*conversionDouble));
        
        

        //Conversiones de entero a String
        int edad = 22;
        Double estatura = 55.3;
        
        String convertString1 = String.valueOf(edad);
        String convertString2 = String.valueOf(estatura);
        
        System.out.println("El joven tiene: " + edad + " años y tiena una estarura de: " + estatura + " centimetros");

    }
    
}
