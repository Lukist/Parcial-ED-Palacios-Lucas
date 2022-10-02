import java.util.Scanner;

public class Teclado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Cual es tu nombre?: --> ");
        String nombre = teclado.nextLine();

        //Se hace esto porque el scanner.nextInt() nos devuelve un \n al siguiente scanner que se coloque
        //de esta forma, transformando lo escrito por teclado en un int nos ahorramos tener que colocar un
        //scanner vacio después del nextInt() que sería el que reciba el \n
        System.out.print("Cual es tu edad?: --> ");
        int edad = Integer.parseInt(teclado.nextLine());

        System.out.print("Cual es tu numero telefonico?: --> ");
        String numeroTel = teclado.nextLine();

        System.out.println("---------------------------------------------------------------------");
        System.out.printf("__Bienvenido__ \nNombre: %s \nEdad: %d \nTelefono: %s", nombre, edad, numeroTel);



    }
}
