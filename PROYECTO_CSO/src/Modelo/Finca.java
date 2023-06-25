package Modelo;

import java.util.Date;

/**
 * Clase Finca representa una finca en el sistema.
 */
public class Finca {
    private String nombre;
    private String ciudad;
    private String direccion;
    private Date añoDeFundacion;
    private String idPropietario;

    /**
     * Constructor que permite crear objetos de la clase Finca recibiendo los parámetros de nombre, ciudad, dirección,
     * año de fundación y ID del propietario.
     *
     * @param nombre          El nombre de la finca.
     * @param ciudad          La ciudad de la finca.
     * @param direccion       La dirección de la finca.
     * @param añoDeFundacion  El año de fundación de la finca.
     * @param idPropietario   El ID del propietario de la finca.
     */
    public Finca(String nombre, String ciudad, String direccion, Date añoDeFundacion, String idPropietario) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.añoDeFundacion = añoDeFundacion;
        this.idPropietario = idPropietario;
    }

    /**
     * Método getter para obtener el nombre de la finca.
     *
     * @return El nombre de la finca.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para modificar el nombre de la finca.
     *
     * @param nombre El nuevo nombre de la finca.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener la ciudad de la finca.
     *
     * @return La ciudad de la finca.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Método setter para modificar la ciudad de la finca.
     *
     * @param ciudad La nueva ciudad de la finca.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Método getter para obtener la dirección de la finca.
     *
     * @return La dirección de la finca.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método setter para modificar la dirección de la finca.
     *
     * @param direccion La nueva dirección de la finca.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método getter para obtener el año de fundación de la finca.
     *
     * @return El año de fundación de la finca.
     */
    public Date getAñoDeFundacion() {
        return añoDeFundacion;
    }

    /**
     * Método setter para modificar el año de fundación de la finca.
     *
     * @param añoDeFundacion El nuevo año de fundación de la finca.
     */
    public void setAñoDeFundacion(Date añoDeFundacion) {
        this.añoDeFundacion = añoDeFundacion;
    }

    /**
     * Método getter para obtener el ID del propietario de la finca.
     *
     * @return El ID del propietario de la finca.
     */
    public String getIdPropietario() {
        return idPropietario;
    }

    /**
     * Método setter para modificar el ID del propietario de la finca.
     *
     * @param idPropietario El nuevo ID del propietario de la finca.
     */
    public void setIdPropietario(String idPropietario) {
        this.idPropietario = idPropietario;
    }

    /**
     * Método para obtener información de la finca.
     *
     * @param info Información adicional a incluir en la descripción de la finca.
     * @return La información de la finca.
     */
    public String getInfoFinca(String info) {
        // Aquí puedes agregar la lógica para generar la información completa de la finca
        return info;
    }
}