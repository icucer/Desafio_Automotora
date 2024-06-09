package cl.praxis.automotora;

public class Cliente extends Persona{
    /***
     * Parámetro de la clase
     ***/
    private int edad;

    /***
     * Constructor sin parámetros
     ***/
    public Cliente() {
    }

    /***
     * Constructor con parámetro de la clase
     **
     * @param edad
     **
     ***/
    public Cliente(int edad) {
        this.edad = edad;
    }

    /***
     * Constructor con todos los parámetros de la clase
     **
     * @param rut
     * @param nombre
     * @param edad
     **
     ***/
    public Cliente(String rut, String nombre, int edad) {
        super(rut, nombre);
        this.edad = edad;
    }

    /***
     * Getter para edad
     ***/
    public int getEdad() {
        return edad;
    }

    /***
     * Setter para edad
     ***/
    public void setEdad(int edad) {
        this.edad = edad;
    }
}