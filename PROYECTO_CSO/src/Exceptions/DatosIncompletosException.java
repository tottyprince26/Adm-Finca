package Exceptions;

/**
 * Excepción que se lanza al existir datos incompletos en los registros.
 */
public class DatosIncompletosException extends NullPointerException {
    /**
     * Constructor de la excepción que muestra un mensaje de error.
     */
    public DatosIncompletosException() {
        super("Existen datos incompletos. Complete todos los campos.");
    }
}