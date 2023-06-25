package controlador;

import Conexion.Conexion;
import Exceptions.DatosIncompletosException;
import Modelo.Banco;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Clase que controla el registro de Banco.
 * 
 * @author GAMER
 */
public class RegistroBancoController {
    
    /**
     * Método encargado de registrar un Banco en la base de datos recibiendo como parámetro un objeto de la clase Banco.
     * 
     * @param banco el objeto de la clase Banco a registrar.
     */
    public static void registrarBanco(Banco banco){
        
        if(!banco.getNombre().isEmpty() && !banco.getDireccion().isEmpty() && !banco.getRepresentante().isEmpty()
                && !banco.getId().isEmpty())
        {
            Conexion conect = new Conexion();
            Connection conexion = (Connection) conect.getconection();
            CallableStatement myCall = null;
            
            try {
                myCall = (CallableStatement) conexion.prepareCall("{call putBanco(?,?,?,?)}");
                myCall.setString(1, banco.getNombre());
                myCall.setString(2, banco.getDireccion());
                myCall.setString(3, banco.getRepresentante());
                myCall.setInt(4, Integer.parseInt(banco.getId()));
                myCall.executeUpdate();
                JOptionPane.showMessageDialog(null, "REGISTRO DE BANCO EXITOSO !");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nERROR DE CONEXION"+ex);
            } finally {
                try {
                    if (myCall != null) {
                        myCall.close();
                    }
                } catch (SQLException e) {
                    // Error al cerrar el CallableStatement
                }
                try {
                    if (conexion != null) {
                        conexion.close();
                    }
                } catch (SQLException e) {
                    // Error al cerrar la conexión
                }
            }
        } else {
            /**
             * Excepción que se lanza cuando los datos del Banco no están completos.
             */
            throw new DatosIncompletosException();
        }
    }
}