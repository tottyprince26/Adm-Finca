package Modelo;

/**
 * Clase Cobros representa los cobros que se van a registrar en el sistema.
 */
public class Cobros {
    /**
     * Atributos de la clase Cobros
     */
    private String descripcion;
    private String cantidad;
    private String fechaCobro;
    private String fechaVence;
    private String propietario;
    private String presidente;

    /**
     * Constructor para crear un objeto Cobros.
     * 
     * @param descripcion La descripción del cobro.
     * @param cantidad    La cantidad del cobro.
     * @param fechaCobro  La fecha de cobro del cobro.
     * @param fechaVence  La fecha de vencimiento del cobro.
     * @param propietario El propietario del cobro.
     * @param presidente  El presidente del cobro.
     */
    public Cobros(String descripcion, String cantidad, String fechaCobro, String fechaVence, String propietario,
            String presidente) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.fechaCobro = fechaCobro;
        this.fechaVence = fechaVence;
        this.propietario = propietario;
        this.presidente = presidente;
    }

    /**
     * Método getter para obtener la descripción del cobro.
     * 
     * @return La descripción del cobro.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método setter para modificar la descripción del cobro.
     * 
     * @param descripcion La nueva descripción del cobro.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método getter para obtener la cantidad del cobro.
     * 
     * @return La cantidad del cobro.
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * Método setter para modificar la cantidad del cobro.
     * 
     * @param cantidad La nueva cantidad del cobro.
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Método getter para obtener la fecha de cobro del cobro.
     * 
     * @return La fecha de cobro del cobro.
     */
    public String getFechaCobro() {
        return fechaCobro;
    }

    /**
     * Método setter para modificar la fecha de cobro del cobro.
     * 
     * @param fechaCobro La nueva fecha de cobro del cobro.
     */
    public void setFechaCobro(String fechaCobro) {
        this.fechaCobro = fechaCobro;
    }

    /**
     * Método getter para obtener la fecha de vencimiento del cobro.
     * 
     * @return La fecha de vencimiento del cobro.
     */
    public String getFechaVence() {
        return fechaVence;
    }

    /**
     * Método setter para modificar la fecha de vencimiento del cobro.
     * 
     * @param fechaVence La nueva fecha de vencimiento del cobro.
     */
    public void setFechaVence(String fechaVence) {
        this.fechaVence = fechaVence;
    }

    /**
     * Método getter para obtener el propietario del cobro.
     * 
     * @return El propietario del cobro.
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Método setter para modificar el propietario del cobro.
     * 
     * @param propietario El nuevo propietario del cobro.
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     * Método getter para obtener el presidente del cobro.
     * 
     * @return El presidente del cobro.
     */
    public String getPresidente() {
        return presidente;
    }

    /**
     * Método setter para modificar el presidente del cobro.
     * 
     * @param presidente El nuevo presidente del cobro.
     */
    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }
}