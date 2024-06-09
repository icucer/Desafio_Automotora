package cl.praxis.automotora;

public class Bus extends Vehiculo{
    /***
     * Parámetro de la clase
     ***/
    private int cantidadAsientos;

    /***
     * Constructor sin parámetros
     ***/
    public Bus() {
    }

    /***
     * Constructor con parámetro de la clase
     **
     * @param cantidadAsientos
     **
     ***/
    public Bus(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    /***
     * Constructor con todos los parámetros
     **
     * @param color
     * @param patente
     * @param cantidadAsientos
     **
     ***/
    public Bus(String color, String patente, int cantidadAsientos) {
        super(color, patente);
        this.cantidadAsientos = cantidadAsientos;
    }

    /***
     * Getter para cantidadAsientos
     ***/
    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    /***
     * Setter para cantidadAsientos
     ***/
    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    /***
     * Método asientosDisponibles que devuelve el numero de asientos disponibles
     ***/
    public int asientosDisponibles() {
        return cantidadAsientos - 1;
    }
}