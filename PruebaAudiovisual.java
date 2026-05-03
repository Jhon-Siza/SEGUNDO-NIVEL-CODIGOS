package uni1a;

public class PruebaAudiovisual {
    public static void main(String[] args) {
        
        Actor actor1 = new Actor("Keanu Reeves");
        Investigador inv1 = new Investigador("Neil deGrasse Tyson");

        
        Pelicula peli = new Pelicula("Matrix", 136, "Sci-Fi", "Warner", actor1);
        
        SerieDeTV serie = new SerieDeTV("Stranger Things", 50, "Misterio");
        serie.addTemporada(new Temporada(1)); 
        
        Documental docu = new Documental("Cosmos", 60, "Ciencia", "Espacio", inv1); 

        
        VideoTiktok video = new VideoTiktok("Curso Java", 20, "Educativo", "Programacion Full");
        Podcast pod = new Podcast("Tech Talk", 45, "Tecnología", "Elon Musk", 10);

        
        
        ContenidoAudiovisual[] lista = {peli, serie, video, docu, pod};

        System.out.println("--- SISTEMA DE GESTIoN AUDIOVISUAL ---");
        System.out.println();

        for (ContenidoAudiovisual c : lista) {
            c.mostrarDetalles();
        }
    }
}