package cl.praxis.automotora;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {
    /***
     * Parámetros de la clase
     ***/
    private String nombreVenta;
    private String fechaVenta;

    /***
     * Constructor sin parámetros
     ***/
    public LibroVenta() {
    }

    /***
     * Constructor con parámetros de la clase
     **
     * @param nombreVenta
     * @param fechaVenta
     **
     ***/
    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    /***
     * Getter para nombreVenta
     ***/
    public String getNombreVenta() {
        return nombreVenta;
    }

    /***
     * Setter para nombreVentas
     ***/
    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    /***
     * Getter para fechaVenta
     ***/
    public String getFechaVenta() {
        return fechaVenta;
    }

    /***
     * Setter para fechaVenta
     ***/
    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {
        File directory = new File("ficheros");
        if (!directory.exists()) {
            directory.mkdir();
        }

        String fileName = "ficheros/" + nombreVenta + ".txt";
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("El archivo ya existe.");
            return;
        }

        int dia = Integer.parseInt(getFechaVenta().substring(0,2));
        int mes = Integer.parseInt(getFechaVenta().substring(2,4));
        int anio = Integer.parseInt(getFechaVenta().substring(4));

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Patente del Vehiculo: " + vehiculo.getPatente() + "\n");
            writer.write("Edad del Cliente: " + cliente.getEdad() + "\n");
            writer.write("Fecha de la Venta: " + dia + "-" + mes + "-" + anio + "\n");
            writer.write("Nombre de Venta: " + nombreVenta + "\n");
            System.out.println("Venta guardada exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar la venta.");
            e.printStackTrace();
        }
    }
}
