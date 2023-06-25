package controlador;
import controlador.ConexionController;
import Conexion.Conexion;
import Exceptions.LoginException;
import Exceptions.NoUserException;
import Modelo.Usuario;
import Vista.Inicio;
import static Vista.Login.id_Usuario;
import com.mysql.jdbc.CallableStatement;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;

/**
 * Clase controladora del inicio de sesión de usuarios en el sistema.
 */
public class LoginController {
    /**
     * Método para iniciar sesión, recibe el usuario, el campo de texto para el nombre de usuario y el campo de texto para la contraseña.
     *
     * @param user   Objeto de la clase Usuario.
     * @param user2  Objeto de la clase JTextField para el nombre de usuario.
     * @param pass   Objeto de la clase JTextField para la contraseña.
     */
    public static void iniciarSesion(Usuario user, JTextField user2, JTextField pass) {
        if (user.getUsuario().isEmpty()) {
            user2.setBackground(Color.RED);
        }
        if (user.getContraseña().isEmpty()) {
            pass.setBackground(Color.RED);
        }
        if (!user.getUsuario().isEmpty() && !user.getContraseña().isEmpty()) {
            Conexion conect = new Conexion();
            com.mysql.jdbc.Connection conexion2 = (com.mysql.jdbc.Connection) conect.getconection();
            CallableStatement myCall = null;
            ResultSet dato = null;
            try {
                myCall = (CallableStatement) conexion2.prepareCall("{call getUserByUserAndPassword(?,?)}");
                myCall.setString(1, user.getUsuario());
                myCall.setString(2, user.getContraseña());
                dato = myCall.executeQuery();
                if (dato.next()) {
                    String id = dato.getString("id_usuario");
                    if (user.getContraseña().equalsIgnoreCase(dato.getString("usuario")) && user.getContraseña().equalsIgnoreCase(dato.getString("contraseña"))) {
                        try {
                            if (dato.getString("tipo_usuario_id").equalsIgnoreCase("1")) {
                                System.out.println(id);
                                id_Usuario = Integer.parseInt(id);
                            } else if (dato.getString("tipo_usuario_id").equalsIgnoreCase("2")) {
                                System.out.println(id);
                                id_Usuario = Integer.parseInt(id);
                            }
                            VentanasController.cerrarLogin();
                            VentanasController.abrirInicio();
                        } catch (Exception e) {
                            System.out.println("ERROR DE CONSULTA");
                        }
                    } else {
                        throw new NoUserException();
                    }
                }
            } catch (SQLException ex) {
                System.err.println("¡UPS! PARECE QUE TU BASE DE DATOS NO ESTÁ FUNCIONANDO.");
            } finally {
                try {
                    myCall.close();
                } catch (Exception e) {
                }
                try {
                    dato.close();
                } catch (Exception e) {
                }
                try {
                    conexion2.close();
                } catch (Exception e) {
                }
            }
        } else {
            throw new LoginException();
        }
    }
}