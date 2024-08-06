
package ejerciciovideojuego;

import ejerciciovideojuego.logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;

public class EjercioVideojuego {


    public static void main(String[] args) {

        List<VideoJuego> listaVideojuegos = new ArrayList<VideoJuego>();
        
        VideoJuego video1 = new VideoJuego(123, "Banjoe Kazooi", "Nintendo 64",
                                           4, "Plataforma");
        VideoJuego video2 = new VideoJuego(345, "Mario Party 3", "Nintendo 64", 
                                           3, "Plataforma");
        VideoJuego video3 = new VideoJuego(678, "Age Of Empire II", "PC",
                                           1, "Estrategia");
        VideoJuego video4 = new VideoJuego(987, "Counter Strike 1.6", "PC",
                                           1, "Shooter");
        VideoJuego video5 = new VideoJuego(654, "Mario Kart 64", "Nintendo 64",
                                           2, "Plataforma");
        
        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaVideojuegos.add(video3);
        listaVideojuegos.add(video4);
        listaVideojuegos.add(video5);
        
        
        //Punto 3 - recorrer el arrayList
        for(VideoJuego video:listaVideojuegos){
            System.out.println("Titulo: " + video.getTitulo() + " Consola: " + video.getConsola()
                                + " Cant Jugadores: " + video.getCantJugadores());
        }
        
        System.out.println("");
        System.out.println("---------------------");
        
        //Punto 4 Cmbio de nombre y cant de jugadores
        
        video1.setTitulo("Contra");
        video1.setCantJugadores(2);
        
        video2.setTitulo("Mario Bross");
        video2.setCantJugadores(1);
        
        //Punto 5 - Recorrer arayList y solo mostrar los de Nintedo 64
        
        for(VideoJuego video: listaVideojuegos){
            if(video.getConsola().equals("Nintendo 64")){
                System.out.println(video.toString());
            }
        }
        
        
    }
    
}
