
package ejerciciointegrador4;

import ejerciciointegrador4.logica.Cliente;
import ejerciciointegrador4.logica.Ticket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class EjercicioIntegrador4 {


    public static void main(String[] args) {
        
        //Creo estructura de datos
        List<Ticket> listaTickets = new ArrayList <Ticket>();
        
        //Creo tickets
        Ticket ticket1 = new Ticket(12, 2, 3, 1500, new Date(), new Date());
        Ticket ticket2 = new Ticket(13, 2, 4, 1500, new Date(), new Date());
        
        //creo ticket media constructor vacio y aplico encapsulamiento
        Ticket ticket3 = new Ticket();
        ticket3.setNumero(20);
        ticket3.setFila(8);
        ticket3.setAsiento(25);
        ticket3.setPrecio(2300);
        ticket3.setFechaCompra(new Date());
        ticket3.setFechaValidez(new Date());
        
        //Agrego elementos a la lista
        listaTickets.add(ticket1);
        listaTickets.add(ticket2);
        listaTickets.add(ticket3);
        
        
        //Summa de precios
        double suma = 0;
        
        for(Ticket tick : listaTickets){
            suma = suma + tick.getPrecio();
        }
        
        System.out.println("La suma de los tickets es de: " + suma);
        
        
        
        //Pedir numero de fila al usuario
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la fila de la que desee ver el tickect");
        int fila = teclado.nextInt();
        
        boolean bandera = false;
        
        for(Ticket tick : listaTickets){
            if(tick.getFila() == fila){
                System.out.println(tick.toString());
                bandera = true;
            }
        }
        
        if (bandera == false){
            System.out.println("No se encontraron datos en la fila en cuestion");
        }
        
        
        //prueba de cliente:
        Cliente cli = new Cliente();
        
        cli.setId(1);
        cli.setDni("12345678");
        cli.setNombre("Luchito");
        cli.setApellido("Panton");
        cli.getListaTickets().add(ticket1);
        
        Ticket ticket4 = new Ticket(18, 10, 8, 2000, new Date(2024-10-12), new Date());
        
        cli.getListaTickets().add(ticket4);
        
    }
    
}
