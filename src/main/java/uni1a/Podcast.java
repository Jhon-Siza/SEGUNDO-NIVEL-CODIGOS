package uni1a;

public class Podcast extends ContenidoAudiovisual {
    private String anfitrion;
    private int episodios;

    public Podcast(String titulo, int duracion, String genero, String anfitrion, int episodios) {
        super(titulo, duracion, genero);
        this.anfitrion = anfitrion;
        this.episodios = episodios;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Podcast: " + getTitulo() + " | Host: " + anfitrion + " | Episodios: " + episodios);
    }
}