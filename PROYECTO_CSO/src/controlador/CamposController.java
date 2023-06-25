package controlador;

import Vista.Login;
import static controlador.VentanasController.ventanaInicio;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Clase encargada de los campos de los formularios.
 */
public class CamposController {
    private VentanasController window = new VentanasController();

    /**
     * Método que realiza la limpieza de todos los JTextField en un JPanel.
     *
     * @param panel El JPanel que contiene los JTextField a limpiar.
     */
    public static void limpiar(JPanel panel) {
        for (Object o : panel.getComponents()) {
            if (o instanceof JTextField) {
                ((JTextField) o).setText("");
            }
        }
    }

    /**
     * Método que muestra en un JLabel el nombre de la ventana en la que se encuentra el usuario.
     *
     * @param label  El JLabel donde se mostrará el nombre de la ventana.
     * @param panel  El JPanel que representa la ventana actual.
     */
    public static void mostrarNombreVentana(JLabel label, JPanel panel) {
        String formulario = panel.getClass().getSimpleName();
        label.setText(formulario.replace("_", " "));
    }

    /**
     * Método que cambia el color del botón al colocar el mouse sobre él.
     *
     * @param button  El JButton sobre el que se realiza la acción.
     */
    public static void setColor(JButton button) {
        button.setBackground(new Color(255, 51, 51));
    }

    /**
     * Método que restablece el color del botón al quitar el mouse sobre él.
     *
     * @param button  El JButton sobre el que se realiza la acción.
     */
    public static void resetColor(JButton button) {
        button.setBackground(new Color(153, 0, 0));
    }
}