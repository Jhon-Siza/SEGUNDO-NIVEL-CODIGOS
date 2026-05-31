public class ActorTest {

    public static void main(String[] args) {

        String esperado = "Keanu Reeves";

        uni1a.Actor actor =
                new uni1a.Actor("Keanu Reeves");

        if (actor.getNombre().equals(esperado)) {

            System.out.println("TEST ACTOR: CORRECTO");

        } else {

            System.out.println("TEST ACTOR: ERROR");
        }
    }
}