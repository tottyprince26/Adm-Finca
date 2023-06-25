package Modelo;

/**
 * Clase Director representa al director que se va a registrar en el sistema y hereda de la clase Persona.
 */
public class Director extends Persona {
    private String idComunidad;

    /**
     * Constructor para crear objetos de la clase Director.
     *
     * @param idComunidad El ID de la comunidad del director.
     * @param nombre      El nombre del director.
     * @param edad        La edad del director.
     * @param cedula      La cédula del director.
     * @param sexo        El sexo del director.
     * @param contacto    El contacto del director.
     * @param ciudad      La ciudad del director.
     * @param direccion   La dirección del director.
     */
    public Director(String idComunidad, String nombre, int edad, String cedula, String sexo, String contacto,
            String ciudad, String direccion) {
        super(nombre, edad, cedula, sexo, contacto, ciudad, direccion);
        this.idComunidad = idComunidad;
    }

    /**
     * Método getter para obtener el ID de la comunidad del director.
     *
     * @return El ID de la comunidad del director.
     */
    public String getIdComunidad() {
        return idComunidad;
    }

    /**
     * Método setter para modificar el ID de la comunidad del director.
     *
     * @param idComunidad El nuevo ID de la comunidad del director.
     */
    public void setIdComunidad(String idComunidad) {
        this.idComunidad = idComunidad;
    }

    /**
     * Método getter para obtener el nombre del director.
     *
     * @return El nombre del director.
     */
    @Override
    public String getNombre() {
        return super.getNombre();
    }

    /**
     * Método setter para modificar el nombre del director.
     *
     * @param nombre El nuevo nombre del director.
     */
    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    /**
     * Método getter para obtener la edad del director.
     *
     * @return La edad del director.
     */
    @Override
    public int getEdad() {
        return super.getEdad();
    }

    /**
     * Método setter para modificar la edad del director.
     *
     * @param edad La nueva edad del director.
     */
    @Override
    public void setEdad(int edad) {
        super.setEdad(edad);
    }

    /**
     * Método getter para obtener la cédula del director.
     *
     * @return La cédula del director.
     */
    @Override
    public String getCedula() {
        return super.getCedula();
    }

    /**
     * Método setter para modificar la cédula del director.
     *
     * @param cedula La nueva cédula del director.
     */
    @Override
    public void setCedula(String cedula) {
        super.setCedula(cedula);
    }

    /**
     * Método getter para obtener el sexo del director.
     *
     * @return El sexo del director.
     */
    @Override
    public String getSexo() {
        return super.getSexo();
    }

    /**
     * Método setter para modificar el sexo del director.
     *
     * @param sexo El nuevo sexo del director.
     */
    @Override
    public void setSexo(String sexo) {
        super.setSexo(sexo);
    }

    /**
     * Método getter para obtener el contacto del director.
     *
     * @return El contacto del director.
     */
    @Override
    public String getContacto() {
        return super.getContacto();
    }

    /**
     * Método setter para modificar el contacto del director.
     *
     * @param contacto El nuevo contacto del director.
     */
    @Override
    public void setContacto(String contacto) {
        super.setContacto(contacto);
    }

    /**
     * Método getter para obtener la ciudad del director.
     *
     * @return La ciudad del director.
     */
    @Override
    public String getCiudad() {
        return super.getCiudad();
    }

    /**
     * Método setter para modificar la ciudad del director.
     *
     * @param ciudad La nueva ciudad del director.
     */
    @Override
    public void setCiudad(String ciudad) {
        super.setCiudad(ciudad);
    }

    /**
     * Método getter para obtener la dirección del director.
     *
     * @return La dirección del director.
     */
    @Override
    public String getDireccion() {
        return super.getDireccion();
    }

    /**
     * Método setter para modificar la dirección del director.
     *
     * @param direccion La nueva dirección del director.
     */
    @Override
    public void setDireccion(String direccion) {
        super.setDireccion(direccion);
    }
}