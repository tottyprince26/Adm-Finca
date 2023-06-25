/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Conexion.Conexion;
import com.mysql.jdbc.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que controla el contenido de las tablas de los diferentes formularios.
 * 
 * Descripción adicional de la clase.
 * 
 * @author GAMER
 */
public class TablasRegistroController {

    /**
     * Método que llena la tabla de propietarios recibiendo como parámetro un objeto de JTable.
     *
     * @param tablita objeto de JTable
     */
    public static void llenarTablaPropietario(JTable tablita) {
        DefaultTableModel modelo = new DefaultTableModel();
        tablita.setModel(modelo);
        Conexion connect = new Conexion();
        com.mysql.jdbc.Connection conexion = (com.mysql.jdbc.Connection) connect.getconection();
        ResultSet rs = null;
        CallableStatement myCall = null;

        try {
            myCall = (CallableStatement) conexion.prepareCall("{call getPropietarios()}");
            rs = myCall.executeQuery();
            modelo.addColumn("id_propietario");
            modelo.addColumn("nombre");
            modelo.addColumn("edad");
            modelo.addColumn("cedula");
            modelo.addColumn("sexo");
            modelo.addColumn("contacto");
            modelo.addColumn("ciudad");
            modelo.addColumn("direccion");
            modelo.addColumn("comunidad_id");

            System.out.println("ejecuta");
            while (rs.next()) {
                Object fila[] = new Object[9];
                for (int i = 0; i < 9; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            System.err.println("ERROR");
        } finally {
            try {
                myCall.close();
            } catch (Exception e) {
            }
            try {
                rs.close();
            } catch (Exception e) {
            }
            try {
                conexion.close();
            } catch (Exception e) {
            }
        }
    }

    /**
     * Método que llena la tabla de presidentes recibiendo como parámetro un objeto de JTable.
     *
     * @param tablita objeto de JTable
     */
    public static void llenarTablaPresidente(JTable tablita) {
        DefaultTableModel modelo = new DefaultTableModel();
        tablita.setModel(modelo);
        Conexion connect = new Conexion();
        com.mysql.jdbc.Connection conexion = (com.mysql.jdbc.Connection) connect.getconection();
        ResultSet rs = null;
        CallableStatement myCall = null;

        try {
            myCall = (CallableStatement) conexion.prepareCall("{call getPresidentes()}");
            rs = myCall.executeQuery();
            modelo.addColumn("id_presidente");
            modelo.addColumn("nombre");
            modelo.addColumn("edad");
            modelo.addColumn("cedula");
            modelo.addColumn("sexo");
            modelo.addColumn("contacto");
            modelo.addColumn("ciudad");
            modelo.addColumn("direccion");
            modelo.addColumn("comunidad_id");

            System.out.println("ejecuta");
            while (rs.next()) {
                Object fila[] = new Object[9];
                for (int i = 0; i < 9; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            System.err.println("ERROR");
        } finally {
            try {
                myCall.close();
            } catch (Exception e) {
            }
            try {
                rs.close();
            } catch (Exception e) {
            }
            try {
                conexion.close();
            } catch (Exception e) {
            }
        }
    }

    /**
     * Método que llena la tabla de comunidad y el combobox de ciudad recibiendo como parámetros
     * un objeto de JTable y un objeto de JComboBox.
     *
     * @param tablita objeto de JTable
     * @param combo objeto de JComboBox
     */
    public static void llenarTablaComunidadByCiudad(JTable tablita, JComboBox combo) {
        DefaultTableModel modelo = new DefaultTableModel();
        tablita.setModel(modelo);
        Conexion connect = new Conexion();
        com.mysql.jdbc.Connection conexion = (com.mysql.jdbc.Connection) connect.getconection();
        CallableStatement myCall = null;
        ResultSet rs = null;

        try {
            myCall = (CallableStatement) conexion.prepareCall("{call getComunidadByCiudad(?)}");
            myCall.setString(1, combo.getSelectedItem().toString());
            rs = myCall.executeQuery();
            modelo.addColumn("id_comunidad");
            modelo.addColumn("nombre");
            modelo.addColumn("ciudad");
            modelo.addColumn("canton");
            modelo.addColumn("fecha_fundacion");
            modelo.addColumn("direccion");
            modelo.addColumn("referencia");
            modelo.addColumn("descripcion");
            modelo.addColumn("estado");

            System.out.println("ejecuta");
            while (rs.next()) {
                Object fila[] = new Object[9];
                for (int i = 0; i < 9; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            System.err.println("ERROR");
        } finally {
            try {
                myCall.close();
            } catch (Exception e) {
            }
            try {
                rs.close();
            } catch (Exception e) {
            }
            try {
                conexion.close();
            } catch (Exception e) {
            }
        }
    }

    /**
     * Método que llena la tabla comunidad recibiendo como parámetro un objeto de JTable.
     *
     * @param tablita objeto de JTable
     */
    public static void llenarTablaComunidad(JTable tablita) {
        DefaultTableModel modelo = new DefaultTableModel();
        tablita.setModel(modelo);
        Conexion connect = new Conexion();
        com.mysql.jdbc.Connection conexion = (com.mysql.jdbc.Connection) connect.getconection();
        CallableStatement myCall = null;
        ResultSet rs = null;

        try {
            myCall = (CallableStatement) conexion.prepareCall("{call getComunidades()}");
            rs = myCall.executeQuery();

            modelo.addColumn("id_comunidad");
            modelo.addColumn("nombre");
            modelo.addColumn("ciudad");
            modelo.addColumn("canton");
            modelo.addColumn("fecha_fundacion");
            modelo.addColumn("direccion");
            modelo.addColumn("referencia");
            modelo.addColumn("descripcion");
            modelo.addColumn("estado");

            System.out.println("ejecuta");
            while (rs.next()) {
                Object fila[] = new Object[9];
                for (int i = 0; i < 9; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            System.err.println("ERROR");
        } finally {
            try {
                myCall.close();
            } catch (Exception e) {
            }
            try {
                rs.close();
            } catch (Exception e) {
            }
            try {
                conexion.close();
            } catch (Exception e) {
            }
        }
    }

    /**
     * Método que llena la tabla de comunidad y el combobox de ciudad recibiendo como parámetros
     * un objeto de JTable y un objeto de JComboBox.
     *
     * @param tablita objeto de JTable
     * @param combo objeto de JComboBBox
     */
    public static void llenarTablaPropietarioByCiudad(JTable tablita, JComboBox combo) {
        DefaultTableModel modelo = new DefaultTableModel();
        tablita.setModel(modelo);
        Conexion connect = new Conexion();
        com.mysql.jdbc.Connection conexion = (com.mysql.jdbc.Connection) connect.getconection();
        CallableStatement myCall = null;
        ResultSet rs = null;

        try {
            myCall = (CallableStatement) conexion.prepareCall("{call getPropietariosByCiudad(?)}");
            myCall.setString(1, combo.getSelectedItem().toString());
            rs = myCall.executeQuery();

            modelo.addColumn("id_propietario");
            modelo.addColumn("nombre");
            modelo.addColumn("edad");
            modelo.addColumn("cedula");
            modelo.addColumn("sexo");
            modelo.addColumn("contacto");
            modelo.addColumn("ciudad");
            modelo.addColumn("direccion");
            modelo.addColumn("comunidad_id");

            System.out.println("ejecuta");
            while (rs.next()) {
                Object fila[] = new Object[9];
                for (int i = 0; i < 9; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            System.err.println("ERROR");
        } finally {
            try {
                myCall.close();
            } catch (Exception e) {
            }
            try {
                rs.close();
            } catch (Exception e) {
            }
            try {
                conexion.close();
            } catch (Exception e) {
            }
        }
    }

    /**
     * Método que llena la tabla de bancos recibiendo como parámetro un objeto de JTable.
     *
     * @param tablita objeto de JTable
     */
    public static void llenarTablaBanco(JTable tablita) {
        DefaultTableModel modelo = new DefaultTableModel();
        tablita.setModel(modelo);
        Conexion connect = new Conexion();
        com.mysql.jdbc.Connection conexion = (com.mysql.jdbc.Connection) connect.getconection();
        CallableStatement myCall = null;
        ResultSet rs = null;

        try {
            myCall = (CallableStatement) conexion.prepareCall("{call getBancos()}");
            rs = myCall.executeQuery();
            modelo.addColumn("id_banco");
            modelo.addColumn("nombre");
            modelo.addColumn("direccion");
            modelo.addColumn("representante");
            modelo.addColumn("comunidad_id");

            System.out.println("ejecuta");
            while (rs.next()) {
                Object fila[] = new Object[5];
                for (int i = 0; i < 5; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            System.err.println("ERROR");
        } finally {
            try {
                myCall.close();
            } catch (Exception e) {
            }
            try {
                rs.close();
            } catch (Exception e) {
            }
            try {
                conexion.close();
            } catch (Exception e) {
            }
        }
    }
}