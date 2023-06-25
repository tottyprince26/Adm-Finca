/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Conexion.Conexion;
import Exceptions.DatosIncompletosException;
import Modelo.Comunidad;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *clase que controla el registro de Comunidad
 * @author GAMER
 */
public class RegistroComunidadController {
    /**
     * metodo encargado de registrar las comunidades en la abse de datos recibiendo como parametro comunidad
     * @param comunidad objeto de la clase Comunidad
     */
    public static void registrarComunidad(Comunidad comunidad){
    if(!comunidad.getNombre().isEmpty()&&!comunidad.getDireccion().isEmpty()&&!comunidad.getReferencia().isEmpty()&&!comunidad.getDescripcion().isEmpty()&&
            !comunidad.getAñoDeFundacion().toString().isEmpty()&&!comunidad.getCiudad().isEmpty()&&!comunidad.getCanton().isEmpty())
     {
        Conexion conect= new Conexion();
        Connection conexion=(Connection) conect.getconection();
         
        CallableStatement myCall = null;
        
        try {
                    myCall=(CallableStatement) conexion.prepareCall("{call putComunidad(?,?,?,?,?,?,?,?)}");
                    
                    myCall.setString(1,comunidad.getNombre());
                    myCall.setString(2, comunidad.getCiudad());
                    myCall.setString(3,comunidad.getCanton());
                    myCall.setString(4, comunidad.getAñoDeFundacion().toString());
                    myCall.setString(5, comunidad.getDireccion());
                    myCall.setString(6,comunidad.getReferencia());
                    myCall.setString(7,comunidad.getDescripcion());
                    myCall.setString(8,"A".toString());
                    myCall.executeUpdate();
                    JOptionPane.showMessageDialog(null, "REGISTRO DE COMUNIDAD EXITOSO !"); 
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DE REGISTRO !\nERROR DE CONEXION");
         }finally {
                try{myCall.close();} catch (Exception e){}
                try{conexion.close();} catch (Exception e){}
        }
     }else {
        /**
         * Excepcion que se lanza al no estar los datos de Comunidad completos
         */
        throw new DatosIncompletosException();
    }
     
    }
}
