package cl.praxis.automotora;

public class Minibus extends Bus{
    /***
     * Parámetro de la clase
     ***/
    private String tipoViaje;

    /***
     * Constructor sin parámetros
     ***/
    public Minibus() {
    }

    /***
     * Constructor con parámetro de la clase
     **
     * @param tipoViaje
     **
     ***/
    public Minibus(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    /***
     * Constructor con parámetros de la clase y clase Bus
     **
     * @param cantidadAsientos
     * @param tipoViaje
     **
     ***/
    public Minibus(int cantidadAsientos, String tipoViaje) {
        super(cantidadAsientos);
        this.tipoViaje = tipoViaje;
    }

    /***
     * Constructor con todos los parámetros
     **
     * @param color
     * @param patente
     * @param cantidadAsientos
     * @param tipoViaje
     **
     ***/
    public Minibus(String color, String patente, int cantidadAsientos, String tipoViaje) {
        super(color, patente, cantidadAsientos);
        this.tipoViaje = tipoViaje;
    }

    /***
     * Getter para tipoViaje
     ***/
    public String getTipoViaje() {
        return tipoViaje;
    }

    /***
     * Setter para tipoViaje
     ***/
    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    /***
     * Método imprimeBus de tipo void sin retornar datos
     ***/
    public void imprimeBus() {
        System.out.println("Color: " + getColor());
        System.out.println("Patente: " + getPatente());
        System.out.println("Cantidad de Asientos: " + getCantidadAsientos());
        System.out.println("Tipo de Viaje: " + tipoViaje);
    }

    @Override
    public String toString() {
        return "Minibus: {" +
                "color - '" + getColor() + "'" +
                ", patente - '" + getPatente() + "'" +
                ", total asientos - '" + getCantidadAsientos() + "'" +
                ", asientos disponibles - '" + asientosDisponibles() + "'" +
                ", tipoViaje = '" + tipoViaje +
                "'}";
    }
}
