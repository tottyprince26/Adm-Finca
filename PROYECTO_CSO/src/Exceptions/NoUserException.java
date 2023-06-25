package Exceptions;

/**
 * Excepción que se lanza cuando no existe un usuario registrado en el sistema.
 */
public class NoUserException extends RuntimeException {
    /**
     * Constructor de la excepción que muestra un mensaje de error.
     */
    public NoUserException() {
        super("No existe este usuario registrado en la base de datos.");
    }
}