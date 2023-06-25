package Modelo;

/**
 * Clase Banco representa la entidad bancaria que se va a registrar en el sistema.
 */
public class Banco {
    /**
     * Atributos de la clase Banco
     */
    private String nombre;
    private String direccion;
    private String representante;
    private String id;

    /**
     * Constructor para crear un objeto Banco.
     * 
     * @param nombre       El nombre del banco.
     * @param direccion    La dirección del banco.
     * @param representante El representante del banco.
     * @param id           El ID del banco.
     */
    public Banco(String nombre, String direccion, String representante, String id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.representante = representante;
        this.id = id;
    }

    /**
     * Método getter para obtener el nombre del banco.
     * 
     * @return El nombre del banco.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para modificar el nombre del banco.
     * 
     * @param nombre El nuevo nombre del banco.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener la dirección del banco.
     * 
     * @return La dirección del banco.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método setter para modificar la dirección del banco.
     * 
     * @param direccion La nueva dirección del banco.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método getter para obtener el representante del banco.
     * 
     * @return El representante del banco.
     */
    public String getRepresentante() {
        return representante;
    }

    /**
     * Método setter para modificar el representante del banco.
     * 
     * @param representante El nuevo representante del banco.
     */
    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    /**
     * Método getter para obtener el ID del banco.
     * 
     * @return El ID del banco.
     */
    public String getId() {
        return id;
    }

    /**
     * Método setter para modificar el ID del banco.
     * 
     * @param id El nuevo ID del banco.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Método que devuelve la información del banco.
     * 
     * @return La información del banco.
     */
    public String getInfoBanco() {
        return "Nombre: " + nombre + "\n" +
                "Dirección: " + direccion + "\n" +
                "Representante: " + representante + "\n" +
                "ID: " + id;
    }
}