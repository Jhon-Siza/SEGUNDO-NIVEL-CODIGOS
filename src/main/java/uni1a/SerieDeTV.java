package uni1a;
import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private List<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracion, String genero) {
        super(titulo, duracion, genero);
        this.temporadas = new ArrayList<>();
    }
    
    public void addTemporada(Temporada t) { temporadas.add(t); }

    @Override
    public void mostrarDetalles() {
        System.out.println("Serie: " + getTitulo() + " | Temporadas: " + temporadas.size());
    }
}