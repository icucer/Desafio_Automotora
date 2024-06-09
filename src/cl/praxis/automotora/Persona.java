package cl.praxis.automotora;

public class Persona {
    /***
     * Parámetros de la clase
     ***/
    private String rut;
    private String nombre;

    /***
     * Constructor sin parámetros
     ***/
    public Persona() {
    }

    /***
     * Constructor con parámetros de la clase
     **
     * @param rut
     * @param nombre
     **
     ***/
    public Persona(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    /***
     * Getter para rut
     ***/
    public String getRut() {
        return rut;
    }

    /***
     * Setter para rut
     ***/
    public void setRut(String rut) {
        this.rut = rut;
    }

    /***
     * Getter para nombre
     ***/
    public String getNombre() {
        return nombre;
    }

    /***
     * Setter para nombre
     ***/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}