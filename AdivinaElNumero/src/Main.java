public class Main {
    public static void main(String[] args) {
        AdivinaElNumero nuevoJuego = new AdivinaElNumero();

        //se han cambiado en gran parte el codigo con respecto a como funcionaba el dado en el curso
        //en primer lugar en el metodo se deberan designar el valor minimo y maximo deseado desde el principio
        nuevoJuego.jugarAdivinanza(10, 15);

        System.out.println("Gracias por jugar!!!");
    }
}