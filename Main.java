package TAREA;

public class Main {

    public static void main(String[] args){

        Tienda tienda = new Tienda();
        tienda.setNombre("ADIDAS");
        tienda.setDireccion("JR. Independencia Nª 150");
        tienda.agregarCliente(new Cliente(101 , "  --->ALEJANDRA", " LUNA"));
        tienda.agregarCliente(new Cliente(102 , "  --->BRAULIO  ", " RODRIGUEZ"));
        tienda.agregarCliente(new Cliente(103 , "  --->CARLA    ", " RETIZ"));
        tienda.agregarCliente(new Cliente(104 , "  --->DANIEL   ", " MORALES"));
        tienda.agregarCliente(new Cliente(105 , "  --->ELIAS    ", " SANCHEZ"));
        tienda.agregarCliente(new Cliente(106 , "  --->FIORELLA ", " MEDINA"));
        tienda.agregarCliente(new Cliente(107 , "  --->GABRIELA ", " PANTOJA"));
        tienda.agregarCliente(new Cliente(108 , "  --->HELENA   ", " AGUILAR"));
        tienda.agregarCliente(new Cliente(109 , "  --->ISABELLA ", " DOMINGUEZ"));

        System.out.println("TIENDA   : "+tienda.getNombre()+" \nDIRECCION: "+tienda.getDireccion()+"\n");

        for (Cliente c: tienda.mostrarCliente()){

            System.out.println(" "+c.getCodigo()+ c.getNombre()+c.getApellido());
        }
    }
}
