package Clases;

/**
 *
 * @author karii
 */
public class clsAutos {
    
    private String Codigo;
    private String marca;
    private String modelo;
    private int año;
    private String estilo;
    private String motor;
    private String cilindrada;
    private String combustible;
    private int pasajeros;
    private String chasis;
    private String transmision;
    private String kilometraje;
    private String estado;
    private int valor;
    private int idAutos;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    
    public int getIdAutos() {
        return idAutos;
    }

    public void setIdAutos(int idAutos) {
        this.idAutos = idAutos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;

    }

    public clsAutos() {
    }

    public clsAutos(int idAutos) {
        this.idAutos = idAutos;
    }

    public clsAutos(String marca, String modelo, int año, String estilo, String motor, String cilindrada, String combustible, int pasajeros, String chasis, String transmision, String kilometraje, String estado, int valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.estilo = estilo;
        this.motor = motor;
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.pasajeros = pasajeros;
        this.chasis = chasis;
        this.transmision = transmision;
        this.kilometraje = kilometraje;
        this.estado = estado;
        this.valor = valor;
    }

}
