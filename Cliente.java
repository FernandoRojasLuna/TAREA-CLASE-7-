package TAREA;

public class Cliente {

    private Integer codigo;

    private String nombre;

    private String apellido;

    public Cliente(){


    }

    //GENERAR CONSTRUCTOR


    public Cliente(Integer codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //GENERAR GETTER AND SETTER


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
