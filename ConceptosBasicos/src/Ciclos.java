import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Cuantos numeros quieres procesar?: -->");
        int cantidad = teclado.nextInt();

        int num = 0;
        int resultado = 0;
        /*
        System.out.printf("Ingrese %d datos\n", cantidad);
        for (int i = 0; i < cantidad; i++) {

            System.out.printf("Dato %d: -->", i+1 );
            num = teclado.nextInt();
            resultado = num * 2;
            System.out.printf("Dato %d procesado %d \n", i+1, resultado);

        }*/

        // while loop
        int c = 0;
        while(c < cantidad) {
            System.out.printf("Dato %d: -->", c+1);
            num = teclado.nextInt();
            resultado = num * 2;
            System.out.printf("Dato %d procesado %d \n", c+1, resultado);
            c++;
        }


    }
}