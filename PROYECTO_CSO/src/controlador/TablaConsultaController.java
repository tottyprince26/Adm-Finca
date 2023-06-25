package controlador;

import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TablaConsultaController {
    public static void llenarTablaCobroPropietarios(JTable tablita) {
        DefaultTableModel modelo = new DefaultTableModel();
        tablita.setModel(modelo);
        Conexion connect = new Conexion();
        Connection conexion = null;
        ResultSet rs = null;
        CallableStatement myCall = null;

        try {
            conexion = connect.getconection();
            myCall = conexion.prepareCall("{call getCobrosPropietarios()}");
            rs = myCall.executeQuery();
            modelo.addColumn("id_cobro");
            modelo.addColumn("propietario");
            modelo.addColumn("cedula");
            modelo.addColumn("presidente");
            modelo.addColumn("cedula");
            modelo.addColumn("cantidad");

            System.out.println("ejecuta");
            while (rs.next()) {
                Object fila[] = new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            System.err.println("ERROR");
        } finally {
            try {
                if (myCall != null) {
                    myCall.close();
                }
            } catch (Exception e) {
            }
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
            }
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public static void llenarTablaPagosPropietarios(JTable tablita) {
        DefaultTableModel modelo = new DefaultTableModel();
        tablita.setModel(modelo);
        Conexion connect = new Conexion();
        Connection conexion = null;
        ResultSet rs = null;
        CallableStatement myCall = null;

        try {
            conexion = connect.getconection();
            myCall = conexion.prepareCall("{call getPagosPropietarios()}");
            rs = myCall.executeQuery();
            modelo.addColumn("id_pago");
            modelo.addColumn("banco");
            modelo.addColumn("representante");
            modelo.addColumn("presidente");
            modelo.addColumn("cedula");
            modelo.addColumn("cantidad");

            System.out.println("ejecuta");
            while (rs.next()) {
                Object fila[] = new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            System.err.println("ERROR");
        } finally {
            try {
                if (myCall != null) {
                    myCall.close();
                }
            } catch (Exception e) {
            }
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
            }
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public static void llenarTablaGastosComunidad(JTable tablita) {
        DefaultTableModel modelo = new DefaultTableModel();
        tablita.setModel(modelo);
        Conexion connect = new Conexion();
        Connection conexion = null;
        ResultSet rs = null;
        CallableStatement myCall = null;

        try {
            conexion = connect.getconection();
            myCall = conexion.prepareCall("{call getGastosComunidad()}");
            rs = myCall.executeQuery();
            modelo.addColumn("comunidad");
            modelo.addColumn("banco");
            modelo.addColumn("gasto_total");

            System.out.println("ejecuta");
            while (rs.next()) {
                Object fila[] = new Object[3];
                for (int i = 0; i < 3; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            System.err.println("ERROR");
        } finally {
            try {
                if (myCall != null) {
                    myCall.close();
                }
            } catch (Exception e) {
            }
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
            }
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception e) {
            }
        }
    }

    public static void llenarTablaGastosPropietarios(JTable tablita) {
        DefaultTableModel modelo = new DefaultTableModel();
        tablita.setModel(modelo);
        Conexion connect = new Conexion();
        Connection conexion = null;
        ResultSet rs = null;
        CallableStatement myCall = null;

        try {
            conexion = connect.getconection();
            myCall = conexion.prepareCall("{call getGastosPropietarios()}");
            rs = myCall.executeQuery();
            modelo.addColumn("propietario");
            modelo.addColumn("ciudad");
            modelo.addColumn("gasto_total");

            System.out.println("ejecuta");
            while (rs.next()) {
                Object fila[] = new Object[3];
                for (int i = 0; i < 3; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            System.err.println("ERROR");
        } finally {
            try {
                if (myCall != null) {
                    myCall.close();
                }
            } catch (Exception e) {
            }
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
            }
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (Exception e) {
            }
        }
    }
}