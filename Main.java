package Tarea02;

public class Main {

    public static void main(String args[])
    {
        Tienda tienda = new Tienda();
        tienda.setNombre("Loly");
        tienda.setDireccion("Jr.libertad");
        tienda.agregarclientes(new Clientes("JUAN ANDY","DIAZ RAMOZ",3463473));
        tienda.agregarclientes(new Clientes("LEO ROY","GONZALES D",3253223));
        tienda.agregarclientes(new Clientes("VIARO D","CONDEZO M",564473));
        tienda.agregarclientes(new Clientes("JHARBIS L","MORALES M",5643473));
        System.out.println("Tienda con Nombre: "+tienda.getNombre()+"   Direccion: "+tienda.getDireccion());


        for(Clientes clientes: tienda.mostrarClientes()) {

            System.out.println(" "+clientes.getNombres()+", "+clientes.getApellidos()+", "+clientes.getDni());
        }

    }
}
