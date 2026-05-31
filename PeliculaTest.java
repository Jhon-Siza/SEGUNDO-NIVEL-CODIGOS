public class PeliculaTest {

    public static void main(String[] args) {

        uni1a.Actor actor =
                new uni1a.Actor("Keanu Reeves");

        uni1a.Pelicula pelicula =
                new uni1a.Pelicula(
                        "Matrix",
                        136,
                        "Sci-Fi",
                        "Warner",
                        actor);

        if (pelicula.getTitulo().equals("Matrix")) {

            System.out.println("TEST PELICULA: CORRECTO");

        } else {

            System.out.println("TEST PELICULA: ERROR");
        }
    }
}