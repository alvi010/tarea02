package Tarea02;

public class Tienda {

    private  Clientes clientes[];

    private int contadorClientes;
    private String nombre;

    private String direccion;
    private String cliente;


    public Tienda()
    {
        this.clientes = new Clientes[4];

        this.contadorClientes = 0;
    }

    public void agregarclientes(Clientes clientes)
    {
        this.clientes[contadorClientes++] = clientes;
    }

    public Clientes[] mostrarClientes()
    {
        return this.clientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
