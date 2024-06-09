package cl.praxis.automotora;

public class Vendedor extends Persona{
    /***
     * Parámetro de la clase
     ***/
    private String direccion;

    /***
     * Constructor sin parámetros
     ***/
    public Vendedor() {
    }

    /***
     * Constructor con parámetro de la clase
     **
     * @param direccion
     **
     ***/
    public Vendedor(String direccion) {
        this.direccion = direccion;
    }

    /***
     * Constructor con parámetros de la clase
     **
     * @param rut
     * @param nombre
     * @param direccion
     **
     ***/
    public Vendedor(String rut, String nombre, String direccion) {
        super(rut, nombre);
        this.direccion = direccion;
    }

    /***
     * Getter para direccion
     ***/
    public String getDireccion() {
        return direccion;
    }

    /***
     * Setter para direccion
     ***/
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}