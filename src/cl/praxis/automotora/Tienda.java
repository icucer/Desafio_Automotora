package cl.praxis.automotora;

public class Tienda {
    /***
     * Parámetros de la clase
     ***/
    private String nombreTienda;
    private int stock;
    private Vendedor vendedor;
    private Cliente cliente;

    /***
     * Constructor sin parámetros
     ***/
    public Tienda() {
    }

    /***
     * Constructor con todos los parámetros de la clase
     **
     * @param nombreTienda
     * @param stock
     * @param vendedor
     * @param cliente
     **
     ***/
    public Tienda(String nombreTienda, int stock, Vendedor vendedor, Cliente cliente) {
        this.nombreTienda = nombreTienda;
        this.stock = stock;
        this.vendedor = vendedor;
        this.cliente = cliente;
    }

    /***
     * Getter para nombreTienda
     ***/
    public String getNombreTienda() {
        return nombreTienda;
    }

    /***
     * Setter para nombreTienda
     ***/
    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    /***
     * Getter para stock
     ***/
    public int getStock() {
        return stock;
    }

    /***
     * Setter para stock
     ***/
    public void setStock(int stock) {
        this.stock = stock;
    }

    /***
     * Getter para vendedor
     ***/
    public Vendedor getVendedor() {
        return vendedor;
    }

    /***
     * Setter para vendedor
     ***/
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    /***
     * Getter para cliente
     ***/
    public Cliente getCliente() {
        return cliente;
    }

    /***
     * Setter para cliente
     ***/
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /***
     * Método existeStock que retornara un mensaje con stock disponible en tienda
     ***/
    public String existeStock() {
        return "La tienda " + "'" + nombreTienda + "'." +
                " Tiene la siguente cantidad de stock: " + stock + " vehiculos.";
    }
}
