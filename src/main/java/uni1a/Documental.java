package uni1a;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador;

    public Documental(String titulo, int duracion, String genero, String tema, Investigador inv) {
        super(titulo, duracion, genero);
        this.tema = tema;
        this.investigador = inv;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Documental: " + getTitulo() + " | Investigador: " + investigador.getNombre() + " | Tema: " + tema);
    }
}