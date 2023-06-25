package controlador;

import Conexion.Conexion;
import Exceptions.DatosIncompletosException;
import Modelo.Usuario;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Clase que controla el registro y consulta de usuarios.
 * 
 */
public class UsuarioController {
    /**
     * Método que se encarga de consultar a los usuarios.
     * Recibe como parámetro un objeto de Usuario y retorna el ID de usuario.
     * 
     * @param user Objeto de Usuario
     * @return ID de usuario
     */
    public static int consultarUsuario(Usuario user) {
        int id = 0;
        Conexion conect = new Conexion();
        Connection conexion = (Connection) conect.getconection();
        CallableStatement myCall = null;
        ResultSet dato = null;

        try {
            myCall = (CallableStatement) conexion.prepareCall("{call getUsuarioByTipo(?,?,?)}");
            myCall.setString(1, user.getUsuario());
            myCall.setString(2, user.getContraseña());
            myCall.setInt(3, user.getTipo());
            dato = myCall.executeQuery();
            if (dato.next()) {
                id = Integer.parseInt(dato.getString("id_usuario"));
            }
        } catch (SQLException ex) {
            System.err.println("ERROR EN OBTENER DATOS");
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
                conexion.close();
            } catch (Exception e) {
            }
        }
        return id;
    }
    
    /**
     * Método que registra a los usuarios en la base de datos.
     * Recibe como parámetro un objeto de Usuario y retorna el ID del usuario consultado.
     * 
     * @param user Objeto de Usuario
     * @return ID del usuario consultado
     */
    public static int registrarUsuario(Usuario user) {
        if (!user.getUsuario().isEmpty() && !user.getContraseña().isEmpty()) {
            Conexion conect = new Conexion();
            Connection conexion = (Connection) conect.getconection();
            CallableStatement myCall = null;

            try {
                myCall = (CallableStatement) conexion.prepareCall("{call putUsuario(?,?,?)}");
                myCall.setString(1, user.getUsuario());
                myCall.setString(2, user.getContraseña());
                myCall.setInt(3, user.getTipo());
                myCall.executeUpdate();
                JOptionPane.showMessageDialog(null, "REGISTRO DE USUARIO EXITOSO !");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nERROR DE CONEXION");
            } finally {
                try {
                    myCall.close();
                } catch (Exception e) {
                }
                try {
                    conexion.close();
                } catch (Exception e) {
                }
            }
        } else {
            /**
             * Excepción que se lanza al no estar los datos de Usuario completos.
             */
            throw new DatosIncompletosException();
        }

        return consultarUsuario(user);
    }
}