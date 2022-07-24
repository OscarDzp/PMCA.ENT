package Clases;

/**
 *
 * @author karii
 */
public class clsEmpleado {

    private int idEmpleado;
    private String Codigo;
    private String tipoIdentificacion;
    private String identificacion;
    private String Nombre;
    private String primerApellido;
    private String segundoApellido;
    private String Direccion;
    private String puesto;
    private String Correo;
    private String telefono;
    private String Departamento;
    private boolean estado;
    private String codigo;

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public clsEmpleado() {
    }

    public clsEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public clsEmpleado(String codigo) {
        this.codigo = codigo;
    }

    public clsEmpleado(int idEmpleado, String Codigo, String tipoIdentificacion, String identificacion, String Nombre, String primerApellido, String segundoApellido, String Direccion, String puesto, String Correo, String telefono, String Departamento, boolean estado) {
        this.idEmpleado = idEmpleado;
        this.Codigo = Codigo;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.Nombre = Nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.Direccion = Direccion;
        this.puesto = puesto;
        this.Correo = Correo;
        this.telefono = telefono;
        this.Departamento = Departamento;
        this.estado = estado;
    }

}
