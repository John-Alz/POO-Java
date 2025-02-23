public class EjemploAutomovil {

    public static void main(String[] args) {

        Automovil auto = new Automovil("Ford", "Mustang", "Rojo", 3.600 );
        Automovil auto2 = new Automovil("Ford", "Fiesta", "Azul", 2.550 );

        System.out.println(auto.detalle());
        System.out.println(auto2.detalle());
    }

}
