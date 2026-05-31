package controlador;

import uni1a.ContenidoAudiovisual;
import vista.AudiovisualView;

public class AudiovisualController {

    private AudiovisualView vista;

    public AudiovisualController() {

        vista = new AudiovisualView();
    }

    public void mostrarContenido(ContenidoAudiovisual contenido) {

        vista.mostrar(contenido);
    }
}