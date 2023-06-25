package controlador;

import Conexion.Conexion;
import Modelo.Banco;
import Modelo.Cobros;
import Modelo.Comunidad;
import Modelo.Director;
import Modelo.Finca;
import Modelo.Pago;
import Modelo.Presidente;
import Modelo.Propietario;
import Modelo.Secretario;
import Modelo.Usuario;
import Vista.Login;
import Vista.Registro_Comunidad;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * Clase encargada de las pruebas unitarias de los métodos del módulo de Registro.
 * 
 * @author GAMER
 */
public class PruebasUnitarias {
    private String num = String.valueOf(new Random().nextInt(1000 + 1) + 1);
    private String num2 = String.valueOf(new Random().nextInt(9999 + 1000) + 1000);
    private Login log = new Login();
        
    /**
     * Método que abarca cada una de las pruebas unitarias de los métodos pertenecientes al módulo de Registro.
     */
    public void realizarPruebasUnitarias() {
        
        /**
         * Prueba de conexión a base de datos alojada en "Azure".
         */
        ConexionController.getconection();
        
        /**
         * Prueba de consultas para llenado de tablas.
         */
        TablasRegistroController.llenarTablaBanco(new JTable());    
        TablasRegistroController.llenarTablaComunidad(new JTable());    
        TablasRegistroController.llenarTablaComunidadByCiudad(new JTable(), new ReturnCombo().getCombo());    
        TablasRegistroController.llenarTablaPresidente(new JTable());    
        TablasRegistroController.llenarTablaPropietario(new JTable());    
        TablasRegistroController.llenarTablaPropietarioByCiudad(new JTable(), new ReturnCombo().getCombo());    
         
        /**
         * Prueba del método registrarBanco.
         */
        RegistroBancoController.registrarBanco(new Banco("nombre" + num, "direccion" + num, "repre" + num, "1"));
        
        /**
         * Prueba del método registrarCobro.
         */
        RegistroCobrosController.registrarCobro(new Cobros("desc" + num, "12" + num, String.valueOf(java.time.LocalDateTime.now()), String.valueOf(java.time.LocalDateTime.now()), "1", "1"));
        
        /**
         * Prueba del método registrarComunidad.
         */
        RegistroComunidadController.registrarComunidad(new Comunidad("name" + num, "city" + num, "canton" + num, new Date(), "dire" + num, "ref" + num, "descri" + num, "A"));
        
        /**
         * Prueba del método registrarDirector.
         */
        RegistroDirectorController.registrarDirector(new Director("1", "noma" + num, 12, "121212" + num2, "Masculino", "0920912", "ciudad", "direc" + num), new Usuario("hola" + num, "contra" + num, 1));
        
        /**
         * Prueba del método registrarSecretario.
         */
        RegistroSecretariaController.registrarSecretario(new Secretario("1", "noma" + num, 12, "121212" + num2, "Masculino", "0920912", "ciudad", "direc" + num), new Usuario("hola" + num, "contra" + num, 2));
        
        /**
         * Prueba del método registrarFinca.
         */
        RegistroFincaController.registrarFinca(new Finca("name" + num, "city" + num, "dir" + num, new Date(), "1"));
        
        /**
         * Prueba del método registrarPago.
         */
        RegistroPagoController.registrarPago(new Pago("name" + num, "12" + num, new Date(), "1", "1"));
        
        /**
         * Prueba del método registrarPresidente.
         */
        RegistroPresidenteController.registrarPresidente(new Presidente("1", "noma" + num, 12, "121212" + num2, "Masculino", "0920912", "ciudad", "direc" + num));
        
        /**
         * Prueba del método registrarPropietario.
         */
        RegistroPropietarioController.registrarPropietario(new Propietario("1", "noma" + num, 12, "121212" + num2, "Masculino", "0920912", "ciudad", "direc" + num));
        
        /**
         * Prueba de consulta de Usuario.
         */
        UsuarioController.consultarUsuario(new Usuario("dir", "dir", 2));
        
        /**
         * Prueba de registro de Usuario.
         */
        UsuarioController.registrarUsuario(new Usuario("dirV", "dirV", 2));
        
        /**
         * Prueba de ingreso de Usuario.
         */
        LoginController.iniciarSesion(new Usuario("dir", "dir"), log.txtUser, log.txtpassword);
    }
}