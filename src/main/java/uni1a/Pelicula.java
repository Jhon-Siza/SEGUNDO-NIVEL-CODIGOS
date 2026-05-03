package uni1a;
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private Actor actor; 

    public Pelicula(String titulo, int duracion, String genero, String estudio, Actor actor) {
        super(titulo, duracion, genero);
        this.estudio = estudio;
        this.actor = actor;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Pelicula: " + getTitulo() + " | Actor: " + actor.getNombre());
    }
}