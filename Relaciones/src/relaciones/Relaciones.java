package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {

    public static void main(String[] args) {
        
        Auto aut = new Auto();
        
        aut.setId(1L);
        aut.setMarca("Renault");
        aut.setModelo("Duster");
        
        List<Propietario> listaPropietarios = new ArrayList<Propietario>();
        
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();
        Propietario prop3 = new Propietario();
        
        prop1.setId(31L);
        prop1.setNombre("Roy");
        prop1.setApellido("Rodriguez");
        
        prop2.setId(31L);
        prop2.setNombre("Diana");
        prop2.setApellido("Rios");
        
        prop3.setId(1L);
        prop3.setNombre("Ian");
        prop3.setApellido("Rodriguez");
        
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        listaPropietarios.add(prop3);
        
        aut.setListaPropietarios(listaPropietarios);
        
        
        System.out.println("El auto de marca: " + aut.getMarca() + " " + aut.getModelo() + 
                " tiene como propietarios a: " + aut.getListaPropietarios().toString());
    }
    
}
