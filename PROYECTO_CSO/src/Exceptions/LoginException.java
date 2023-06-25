package Exceptions;

/**
 * Excepción que se lanza al existir datos incompletos en los registros de inicio de sesión.
 */
public class LoginException extends RuntimeException {
    /**
     * Constructor de la excepción que muestra un mensaje de error.
     */
    public LoginException() {
        super("Existen campos vacíos. Ingrese los datos de inicio de sesión correctamente.");
    }
}