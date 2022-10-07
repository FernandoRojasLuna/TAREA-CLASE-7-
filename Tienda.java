package TAREA;

public class Tienda {

    private Cliente cliente[];

    private int contadorcliente;

    private String nombre;

    private  String direccion;

    public Tienda(){

        this.cliente = new Cliente[9];

        this.contadorcliente = 0;

    }

    public void agregarCliente(Cliente cliente){

        this.cliente[contadorcliente++]=cliente;
    }

    public Cliente[] mostrarCliente(){

        return this.cliente;
    }

    //GENERAR GETTER AND SETTER


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
}
