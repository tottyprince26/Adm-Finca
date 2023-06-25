package Modelo;
import java.util.Date;

/**
 * Clase Comunidad representa una comunidad en el sistema.
 */
public class Comunidad {
    /**
     * Atributos de la clase Comunidad.
     */
    private String nombre;
    private String ciudad;
    private String canton;
    private Date añoDeFundacion;
    private String direccion;
    private String referencia;
    private String descripcion;
    private String estado;

    /**
     * Constructor para crear un objeto Comunidad.
     * 
     * @param nombre           El nombre de la comunidad.
     * @param ciudad           La ciudad de la comunidad.
     * @param canton           El cantón de la comunidad.
     * @param añoDeFundacion   El año de fundación de la comunidad.
     * @param direccion        La dirección de la comunidad.
     * @param referencia       La referencia de la comunidad.
     * @param descripcion      La descripción de la comunidad.
     * @param estado           El estado de la comunidad.
     */
    public Comunidad(String nombre, String ciudad, String canton, Date añoDeFundacion, String direccion,
            String referencia, String descripcion, String estado) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.canton = canton;
        this.añoDeFundacion = añoDeFundacion;
        this.direccion = direccion;
        this.referencia = referencia;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    /**
     * Método getter para obtener el nombre de la comunidad.
     * 
     * @return El nombre de la comunidad.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para modificar el nombre de la comunidad.
     * 
     * @param nombre El nuevo nombre de la comunidad.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener la ciudad de la comunidad.
     * 
     * @return La ciudad de la comunidad.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Método setter para modificar la ciudad de la comunidad.
     * 
     * @param ciudad La nueva ciudad de la comunidad.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Método getter para obtener el cantón de la comunidad.
     * 
     * @return El cantón de la comunidad.
     */
    public String getCanton() {
        return canton;
    }

    /**
     * Método setter para modificar el cantón de la comunidad.
     * 
     * @param canton El nuevo cantón de la comunidad.
     */
    public void setCanton(String canton) {
        this.canton = canton;
    }

    /**
     * Método getter para obtener el año de fundación de la comunidad.
     * 
     * @return El año de fundación de la comunidad.
     */
    public Date getAñoDeFundacion() {
        return añoDeFundacion;
    }

    /**
     * Método setter para modificar el año de fundación de la comunidad.
     * 
     * @param añoDeFundacion El nuevo año de fundación de la comunidad.
     */
    public void setAñoDeFundacion(Date añoDeFundacion) {
        this.añoDeFundacion = añoDeFundacion;
    }

    /**
     * Método getter para obtener la dirección de la comunidad.
     * 
     * @return La dirección de la comunidad.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método setter para modificar la dirección de la comunidad.
     * 
     * @param direccion La nueva dirección de la comunidad.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método getter para obtener la referencia de la comunidad.
     * 
     * @return La referencia de la comunidad.
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Método setter para modificar la referencia de la comunidad.
     * 
     * @param referencia La nueva referencia de la comunidad.
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * Método getter para obtener la descripción de la comunidad.
     * 
     * @return La descripción de la comunidad.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método setter para modificar la descripción de la comunidad.
     * 
     * @param descripcion La nueva descripción de la comunidad.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método getter para obtener el estado de la comunidad.
     * 
     * @return El estado de la comunidad.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Método setter para modificar el estado de la comunidad.
     * 
     * @param estado El nuevo estado de la comunidad.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Método que devuelve información sobre la comunidad.
     * 
     * @param info Información adicional sobre la comunidad.
     * @return La información de la comunidad concatenada con la información adicional.
     */
    public String getInfoComunidad(String info) {
        return info;
    }
    
    
}