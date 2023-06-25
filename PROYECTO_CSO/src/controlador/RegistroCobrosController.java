package controlador;

import Conexion.Conexion;
import Exceptions.DatosIncompletosException;
import Modelo.Cobros;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Clase que controla el registro de los Cobros.
 * 
 * @author GAMER
 */
public class RegistroCobrosController {
    
    /**
     * Método que registra los Cobros en la base de datos recibiendo como parámetro un objeto de la clase Cobros.
     * 
     * @param cobro el objeto de la clase Cobros a registrar.
     */
    public static void registrarCobro(Cobros cobro){
        
        if(!cobro.getDescripcion().isEmpty() && !cobro.getCantidad().isEmpty() && !cobro.getPropietario().isEmpty()
                && !cobro.getPresidente().isEmpty() && !cobro.getFechaCobro().isEmpty() && !cobro.getFechaVence().isEmpty())
        {
            Conexion conect = new Conexion();
            Connection conexion = (Connection) conect.getconection();
            CallableStatement myCall = null;
       
            try {
                myCall = (CallableStatement) conexion.prepareCall("{call putCobro(?,?,?,?,?,?)}");
                myCall.setString(1, cobro.getFechaCobro());
                myCall.setString(2, cobro.getFechaVence());
                myCall.setString(3, cobro.getDescripcion());
                myCall.setString(4, cobro.getCantidad());
                myCall.setInt(5, Integer.parseInt(cobro.getPropietario()));
                myCall.setInt(6, Integer.parseInt(cobro.getPresidente()));
                myCall.executeUpdate();
                JOptionPane.showMessageDialog(null, "REGISTRO DE COBRO EXITOSO !"); 
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
             * Excepción que se lanza cuando los datos del Cobros no están completos.
             */
             throw new DatosIncompletosException();
        }
    }
}