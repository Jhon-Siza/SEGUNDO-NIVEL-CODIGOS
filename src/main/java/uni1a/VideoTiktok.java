package uni1a;
public class VideoTiktok extends ContenidoAudiovisual {
    private String cuenta;

    public VideoTiktok(String titulo, int duracion, String genero, String canal) {
        super(titulo, duracion, genero);
        this.cuenta = canal;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tiktok: " + getTitulo() + " | Cuenta: " + cuenta);
    }
}