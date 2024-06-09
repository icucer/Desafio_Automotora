package cl.praxis.automotora;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int contador = 0;

        List <Vehiculo> listaVehiculos = new ArrayList<>();

        Vehiculo taxi_1 = new Taxi("amarillo", "LKTF24", 3000);
        Vehiculo taxi_2 = new Taxi("amarillo", "LKTF25", 3400);
        Vehiculo taxi_3 = new Taxi("amarillo", "LKTF26", 4000);

        Vehiculo minibus_1 = new Minibus("rojo", "LSRE24", 10, "Turistico");
        Vehiculo minibus_2 = new Minibus("rojo", "LSRE25", 20, "Turistico");
        Vehiculo minibus_3 = new Minibus("rojo", "LSRE26", 13, "Turistico");
        Vehiculo minibus_4 = new Minibus("rojo", "LSRE27", 12, "Turistico");
        Vehiculo minibus_5 = new Minibus("rojo", "LSRE28", 15, "Turistico");

        listaVehiculos.add(taxi_1);
        listaVehiculos.add(taxi_2);
        listaVehiculos.add(taxi_3);
        listaVehiculos.add(minibus_1);
        listaVehiculos.add(minibus_2);
        listaVehiculos.add(minibus_3);
        listaVehiculos.add(minibus_4);
        listaVehiculos.add(minibus_5);

        Vendedor vendedor_1 = new Vendedor("15.286.475-5", "Juan", "Catapilco, comuna de Zapallar");
        Cliente cliente_1 = new Cliente("19.257.357-4", "Orlando", 29);

        Tienda tienda_1 = new Tienda("Automotora ION", listaVehiculos.size(), vendedor_1, cliente_1);

        System.out.println("\n" + tienda_1.existeStock() + "\n");

        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println(vehiculo);
            contador++;
            if (contador == 3) {
                System.out.println();
            }
        }
    }
}