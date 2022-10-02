import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Calculadora de propinas");
        System.out.print("Ingresa la cantidad a pagar: --->");
        double cantidad = teclado.nextDouble();
        System.out.print("Ingrese el porcentaje de propina --->");
        int porcentaje = teclado.nextInt();

        if (porcentaje < 15) {
            System.out.println("El servicio no fue muy bueno");
        } else if (porcentaje >= 15 && porcentaje < 30) {
            System.out.println("El srvicion fue bueno");
        } else {
            System.out.println("El servicio fue excelente");
        }


        double total = cantidad + (cantidad * porcentaje / 100);
        System.out.printf("El total es: %f", total);
    }
}
