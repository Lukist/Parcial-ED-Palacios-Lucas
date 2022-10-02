public class Variables {
    public static void main(String[] args) {
        int pizzas = 6;
        int personas = 3;

        int pizzasPorPersonas = pizzas / personas;

        System.out.printf("Si hay %d pizzas y %d personas, a cada una le tocan %d pizzas\n", pizzas, personas, pizzasPorPersonas);

        String auto = "Ferrari";
        double velocidad = 90.3;
        System.out.printf("El auto %s se desplaza a %f km/h \n", auto, velocidad);

        int precioLeche = 14;
        double precioJamon = 35.6;
        int precioHuevo = 23;

        double precioTotal = precioHuevo + precioLeche + precioJamon;

        System.out.printf("El precio total es de: %f\n", precioTotal);
    }
}