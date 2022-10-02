import java.util.Scanner;

public class AdivinaElNumero {
    private Scanner teclado = new Scanner(System.in);
    private boolean juegoActivo = true;

    //Con respecto al método principal original, este se logró de forma que actue más como una controladora,
    //llamando a los metodos necesarios (metodos secundarios) en el orden en el que se requieren y pasando los argumentos
    //que los metodos necesitan.

    //----------------------------- método principal ------------------------------------------
    public void jugarAdivinanza(int min, int max) {

        int numeroJuego = generarNumeroAleatorio(min, max);

        saludarAlJugador(min, max);

        adivinarNumero(numeroJuego, juegoActivo);

        volverAJugar(min, max);

    }

    //----------------------------------------------------------------------------------------------------------------
    //---------------------------------------------metodos secundarios------------------------------------------------

    //Como su nombre dice genera un número aleatorio entre los valores dados
    private int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    //saluda al usuario dándole las instrucciones sobre cuál es su objtivo en el juego
    private void saludarAlJugador(int min, int max) {
        System.out.print("Hola! cual es tu nombre?: --->");
        String nombreJugador = teclado.nextLine();
        System.out.printf("Bienvenido %s, vamos a comenzar \n", nombreJugador);
        System.out.printf("%s! se a generado un numero aleatorio entre %d y %d, adivinalo \n", nombreJugador, min, max);

    }

    //sistema de adivinanza del juego, el usuario solo podra salir si adivina el numero correspondiente.
    private void adivinarNumero(int numeroAleatorio, boolean salida) {
        int intentos = 1;
        int numeroElegido;
        while (salida) {
            System.out.printf("Elige un numero: ----> ");
            numeroElegido = Integer.parseInt(teclado.nextLine());

            if (numeroElegido < numeroAleatorio) {
                System.out.println("Elige un numero mayor");
                intentos++;
            } else if (numeroElegido > numeroAleatorio) {
                System.out.println("Elige un numero menor");
                intentos++;
            } else {
                System.out.println("Felicidades!! a acertado el numero!!");
                salida = false;
            }

        }
        System.out.printf("Numero de intentos: %d\n", intentos);
    }

    //Le permite al usuario volver a jugar si este asi lo desea
    //esta funcion está inspirada en la tecnica de recursividad llamándose a sí misma (el método principal "jugarAdivinanza()")
    //si es que el usuario desea volver a jugar.
    private void volverAJugar(int min, int max) {
        System.out.println("Desea vovler a jugar? 1=si | 2=no");
        System.out.print("------> ");
        int seguirParticipando = Integer.parseInt(teclado.nextLine());

        if (seguirParticipando == 1) {
            jugarAdivinanza(min, max);
        }
    }
}
