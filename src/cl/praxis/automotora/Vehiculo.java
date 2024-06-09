package cl.praxis.automotora;

public class Vehiculo {
    /***
     * Parámetros de la clase
     ***/
    private String color;
    private String patente;

    /***
     * Constructor sin parámetros
     ***/
    public Vehiculo() {
    }

    /***
     * Constructor con todos los parámetros
     **
     * @param color
     * @param patente
     ***/
    public Vehiculo(String color, String patente) {
        this.color = color;
        this.patente = patente;
    }

    /***
     * Getter para getColor
     ***/
    public String getColor() {
        return color;
    }

    /***
     * Setter para setColor
     ***/
    public void setColor(String color) {
        this.color = color;
    }

    /***
     * Getter para getPatente
     ***/
    public String getPatente() {
        return patente;
    }

    /***
     * Setter para setPatente
     ***/
    public void setPatente(String patente) {
        this.patente = patente;
    }
}