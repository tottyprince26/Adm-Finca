/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author GAMER
 */
public class ConexionController {
    /**
     * atributos de la clase ConexionController  para la conexion a a la base de datos
     */
    private static String USUARIO = "root";
    private static String CONTRASEÑA = "admin";
    private static final String URL="jdbc:mysql://127.0.0.1:3307/admfinca?autoReconnect=true&useSSL=true";
    private static Connection  conexion=null;
    /**
     * metodo Connection que devuelve el atributo conexion
     * @return conexion
     */
    public static Connection getconection()
    {
        /**
         *excepcion que  valida la conexion a la base de datos
         */
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexion=(Connection) DriverManager.getConnection(URL,USUARIO,CONTRASEÑA);
            System.out.println("CONECTADO");
        } catch (ClassNotFoundException ex) {
            System.err.println("ERROR, "+ex);
        }       
        catch (SQLException ex) 
        {
            System.err.println("ERROR, "+ex);
        }
        return conexion;
    }
}