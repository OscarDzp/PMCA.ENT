package Clases;

/**
 *
 * @author oscar zumbaddo porras
 */
public class clsActivo {

    //Atributos
    private int idActivo;
    private String codigo;
    private String tipo;
    private String nombre;
    private String descripcion;
    private boolean estado;
    private int cantidad;
    private String fragilidad;

    // Get and set
    public int getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(int idActivo) {
        this.idActivo = idActivo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFragilidad() {
        return fragilidad;
    }

    public void setFragilidad(String fragilidad) {
        this.fragilidad = fragilidad;
    }
    //Constructores

    public clsActivo() {
    }

    public clsActivo(int idActivo) {
        this.idActivo = idActivo;
    }

    public clsActivo(int idActivo, String codigo, String tipo, String nombre, String descripcion, boolean estado, int cantidad, String fragilidad) {
        this.idActivo = idActivo;
        this.codigo = codigo;
        this.tipo = tipo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.cantidad = cantidad;
        this.fragilidad = fragilidad;
    }
}
