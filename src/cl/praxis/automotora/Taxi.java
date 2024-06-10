package cl.praxis.automotora;

public class Taxi extends Vehiculo{
    /***
     * Parámetro de la clase
     ***/
    private int valorPasaje;

    /***
     * Constructor sin parámetros
     ***/
    public Taxi() {
    }

    /***
     * Constructor con parámetro de la clase valorPasaje
     **
     * @param valorPasaje
     ***/
    public Taxi(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    /***
     * Constructor con todos los parámetros
     **
     * @param color
     * @param patente
     * @param valorPasaje
     ***/
    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    /***
     * Getter para valorPasaje
     ***/
    public int getValorPasaje() {
        return valorPasaje;
    }

    /***
     * Setter para valorPasaje
     ***/
    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    /***
     * Método pagarPasaje que valida y devuelve el vuelto o el pasaje original
     ***/
    public int pagarPasaje(int monto) {
        if (monto > valorPasaje) {
            return monto - valorPasaje;
        } else {
            return valorPasaje;
        }
    }

    /***
     * Sobreescritura del método toString
     ***/
    @Override
    public String toString() {
        return "Taxi: {" +
                "color - '" + getColor() + "'" +
                ", patente - '" + getPatente() + "'" +
                ", valorPasaje = '" + valorPasaje +
                "'}";
    }
}