package uni1a;

import java.io.FileWriter;
import java.io.IOException;

public class ArchivoManager {

    public static void guardar(ContenidoAudiovisual[] lista) {

        try {

            FileWriter writer =
                    new FileWriter("contenidos.csv");

            for (ContenidoAudiovisual c : lista) {

                writer.write(
                        c.getId() + "," +
                        c.getTitulo() + "," +
                        c.getGenero() + "\n");
            }

            writer.close();

            System.out.println("Archivo guardado correctamente.");

        } catch (IOException e) {

            System.out.println(
                    "Error: " + e.getMessage());
        }
    }
}